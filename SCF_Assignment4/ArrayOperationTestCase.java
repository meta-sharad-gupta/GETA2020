import static org.junit.Assert.*;

import org.junit.Test;

//class for passing the test case
public class ArrayOperationTestCase {
	ArrOperation object = new ArrOperation();

	@Test
	public void clumpTest1() {
		int[] array ={1, 2, 2, 3, 4, 4};
		int result = object.clump(array);
		assertEquals(2,result);
	}

	@Test
	public void clumpTest2() {
		int[] array ={1, 1, 2, 1, 1};
		int result = object.clump(array);
		assertEquals(2,result);
	}

	@Test
	public void clumpTest3() {
		int[] array ={1, 1, 1, 1, 1};
		int result = object.clump(array);
		assertEquals(1,result);
	}


	@Test
	public void splitTest1() {
		int[] array ={1, 1, 1, 2, 1};
		int result = object.split(array);
		assertEquals(3,result);
	}

	@Test
	public void splitTest2() {
		int[] array ={2, 1, 1, 2, 1};
		int result = object.split(array);
		assertEquals(-1,result);
	}

	@Test
	public void splitTest3() {
		int[] array ={10, 10};
		int result = object.split(array);
		assertEquals(1,result);
	}
	@Test
	public void maxMirrorTest1(){	 
		int[] array ={1, 2, 3, 8, 9, 3, 2, 1};
		int ans=object.MirrorSection(array);
		assertEquals(3,ans);
	}
	@Test
	public void testMaxMirror2(){	  
		assertEquals(2,object.MirrorSection(new int[]{7,1,4,9,7,4,1}));
	}
	@Test
	public void testMaxMirror3(){	  
		assertEquals(3,object.MirrorSection(new int[]{1, 2, 1,4}));
	}
	@Test
	public void fixXY1(){
		int result[] = object.fixXY(new int[]{5,4,9,4,9,5,9},4,5);
		int[] expected={ 9, 4, 5, 4, 5, 9, 9 };
		assertArrayEquals(expected,result);
	}
	@Test
	public void fixXY2(){
		int result[] = object.fixXY(new int[]{1,4,1,5},4,5);
		int[] expected={1,4,5,1};
		assertArrayEquals(expected,result);
	}
	@Test
	public void fixXY3(){	
		int result[] = object.fixXY(new int[]{1,4,1,5,5,4,1},4,5);
		int []expectedArr = new int[]{1,4,5,1,1,4,5};
		assertArrayEquals( expectedArr, result );
	}
	
}
