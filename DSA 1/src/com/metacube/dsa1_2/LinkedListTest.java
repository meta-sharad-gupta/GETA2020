package com.metacube.dsa1_2;

import static org.junit.Assert.*;

import org.junit.Test;

public class LinkedListTest {

	@Test
	public void test() {
		LinkedList list = new LinkedList();
		LinkedList.insertData(list, 10);
		LinkedList.insertData(list, 20);
		LinkedList.insertData(list, 30);
		LinkedList.insertData(list, 40);
		LinkedList.insertData(list, 50);
		LinkedList.insertData(list, 60);
		LinkedList.insertData(list, 70);
		// LinkedList.insertData(list, 10);
		
		list.head.next.next.next.next = list.head;
		
		assertEquals(true, DetectLoop.hasLoop(list.head) );
	}
	
	@Test
	public void test2() {
		LinkedList list = new LinkedList();
		LinkedList.insertData(list, 10);
		LinkedList.insertData(list, 20);
		LinkedList.insertData(list, 30);
		LinkedList.insertData(list, 40);
		LinkedList.insertData(list, 50);
		LinkedList.insertData(list, 60);
		LinkedList.insertData(list, 70);
		// LinkedList.insertData(list, 10);
		
		assertEquals(false, DetectLoop.hasLoop(list.head) );
	}

}
