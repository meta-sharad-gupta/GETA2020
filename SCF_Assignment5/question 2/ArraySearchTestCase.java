import static org.junit.Assert.*;

import org.junit.Test;


public class ArraySearchTestCase {

	ArraySearch object=new ArraySearch();

	@Test
	public void test() {
		int[] array=new int[]{1,2,3,4,5,6,7,8,9,0};
		assertEquals(8,object.linearSearch(array , 8 ,array.length-1));
		assertEquals(8,object.binarySearch(array , 8 , 0 , array.length-1));
	}

	@Test
	public void test1() {//test case when number is not present in array.
		int[] array=new int[]{12,23,34,45,56};
		assertEquals(2,object.linearSearch(array , 23 , array.length-1));
		assertEquals(-1,object.binarySearch(array , 9 , 0 , array.length-1));
	}

	@Test
	public void test2() {
		int[] array=new int[]{1,2,1,1,1,1,1,1,1};
		assertEquals(9,object.linearSearch(array , 1 , array.length-1));
		assertEquals(5,object.binarySearch(array , 1 , 0 , array.length-1));
	}

	@Test
	public void test3() {
		int[] array=new int[]{1};
		assertEquals(1,object.linearSearch(array , 1 , array.length-1));
		assertEquals(1,object.binarySearch(array , 1 , 0 , array.length-1));
	}

	@Test
	public void test4() {//test case when array is empty.
		int[] array=new int[]{};
		assertEquals(2,object.linearSearch(array , 23 , array.length-1));
		assertEquals(2,object.binarySearch(array , 23 , 0 , array.length-1));
	}

}