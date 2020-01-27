package intSet;



import static org.junit.Assert.*;

import org.junit.Test;
/**
 * 
 * class IntSetTest contains test case related to IntSet class.
 */
public class IntSetTest {
	IntSet intSetObj = new IntSet(new int[]{1,2,3,4,8,6,5,9,1000});

	@Test
	public void inSetTest1() {
		assertEquals(true, intSetObj.isMember(1000));
	}

	@Test
	public void inSetTest2() {
		assertEquals(false, intSetObj.isMember(15));
	}

	@Test
	public void inSetTest3() {
		assertEquals(9, intSetObj.size());
	}

	@Test
	public void inSetTest4() throws Exception {
		assertEquals(true , intSetObj.isSubSet((new int[]{1,2,3})) );
	}

	@Test
	public void inSetTest5() throws Exception {
		assertEquals(false , intSetObj.isSubSet((new int[]{123,2,3})) );
	}

	@Test
	public void inSetTest6() throws Exception {
		IntSet obj = intSetObj.union( new IntSet(new int[]{1,2,3}), new IntSet(new int[]{1,12,3}) );
		assertArrayEquals(new int[]{1,2,3,12}, obj.getArray() );
	}

	@Test
	public void Negative_test_case() throws Exception {
		try {
			assertEquals("size of array is size is zero",1, new IntSet(new int[]{}));
		}
		catch (Exception e) {
			assertEquals("size of array is size is zero", e.getMessage());
		}
	}


	@Test
	public void testIntSet3() throws Exception {
		try {
			IntSet set = new IntSet(new int[] {1,10000});
		} catch (Exception e) {
			assertEquals("Number should be in range from 1-1000", e.getMessage());
		}
	}


}
