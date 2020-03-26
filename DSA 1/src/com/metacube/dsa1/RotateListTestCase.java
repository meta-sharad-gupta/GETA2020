package com.metacube.dsa1;

import static org.junit.Assert.*;

import org.junit.Test;

public class RotateListTestCase {

	@Test
	public void firstRotateListTestCase() {
		Node head = null;
		head = RotateListMain.createLinklist(head, 2);
		head = RotateListMain.createLinklist(head, 3);
		head = RotateListMain.createLinklist(head, 4);
		head = RotateListMain.createLinklist(head, 5);
		head = RotateListMain.createLinklist(head, 6);
		head = RotateListMain.createLinklist(head, 7);
		
		Node head2 = null;
		head2 = RotateListMain.createLinklist(head2, 2);
		head2 = RotateListMain.createLinklist(head2, 5);
		head2 = RotateListMain.createLinklist(head2, 6);
		head2 = RotateListMain.createLinklist(head2, 3);
		head2 = RotateListMain.createLinklist(head2, 4);
		head2 = RotateListMain.createLinklist(head2, 7);
		
		int leftRotation = 2 , rightRotation = 5 , numberOfRotation = 2;
		
		Node actualSublist = RotateListMain.subLinklist(head, leftRotation , rightRotation , numberOfRotation,6);
		Node expectedSublist = head2;
		while( expectedSublist != null ) {
			assertEquals(expectedSublist.data,actualSublist.data);
			expectedSublist = expectedSublist.next;
			actualSublist = actualSublist.next;
		}
	}
	
	@Test
	public void secondRotateListTestCase() {
		Node head = null;
		head = RotateListMain.createLinklist(head, 1);
		head = RotateListMain.createLinklist(head, 2);
		head = RotateListMain.createLinklist(head, 3);
		head = RotateListMain.createLinklist(head, 4);
		head = RotateListMain.createLinklist(head, 5);
		head = RotateListMain.createLinklist(head, 6);
		head = RotateListMain.createLinklist(head, 7);
		
		Node head2 = null;
		head2 = RotateListMain.createLinklist(head2, 3);
		head2 = RotateListMain.createLinklist(head2, 4);
		head2 = RotateListMain.createLinklist(head2, 5);
		head2 = RotateListMain.createLinklist(head2, 1);
		head2 = RotateListMain.createLinklist(head2, 2);
		head2 = RotateListMain.createLinklist(head2, 6);
		head2 = RotateListMain.createLinklist(head2, 7);
		
		int leftRotation = 1 , rightRotation = 5 , numberOfRotation = 3;
		
		Node actualSublist = RotateListMain.subLinklist(head, leftRotation , rightRotation , numberOfRotation ,7);
		Node expectedSublist = head2;
		while( expectedSublist != null ) {
			assertEquals(expectedSublist.data,actualSublist.data);
			expectedSublist = expectedSublist.next;
			actualSublist = actualSublist.next;
		}
	}
	
	@Test(expected=AssertionError.class)
	public void NegativeRotateListTestCase() {
		Node head = null;
		head = RotateListMain.createLinklist(head, 1);
		head = RotateListMain.createLinklist(head, 2);
		
		Node head2 = null;
		head2 = RotateListMain.createLinklist(head2, 3);
		head2 = RotateListMain.createLinklist(head2, 4);
		
		int leftRotation = 8 , rightRotation = 8 , numberOfRotation = 1;
		
		Node actualSublist = RotateListMain.subLinklist(head, leftRotation , rightRotation , numberOfRotation,2);
		Node expectedSublist = head2;
		while( expectedSublist != null ) {
			assertEquals(expectedSublist.data,actualSublist.data);
			expectedSublist = expectedSublist.next;
			actualSublist = actualSublist.next;
		}
	}

	

}
