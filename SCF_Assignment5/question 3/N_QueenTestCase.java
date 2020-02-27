import static org.junit.Assert.*;
import org.junit.Test;

public class N_QueenTestCase{
	/**
	 * This method is used to test the nQueen function of N_Queen Class.
	 */
	@Test
	public void testForN_Queen(){
		N_Queen obj = new N_Queen();
		boolean result = obj.nQueen(new int[][] {{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}},0,4);
		if(result)
		{
			obj.print(4);
		}
		assertEquals(true, result);

	}

	@Test
	public void testForN_Queen1(){
		N_Queen obj = new N_Queen();
		boolean result = obj.nQueen(new int[][] {{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0}},0,8);
		if(result)
		{
			obj.print(8);
		}
		assertEquals(true, result);

	}
	@Test
	public void testForN_Queen2(){//test case when queen cant be placed
		N_Queen obj = new N_Queen();
		boolean result = obj.nQueen(new int[][] {{0,0,0,0},{0,0,0,0},{0,0,0,0}},0,3);
		if(result)
		{
			obj.print(3);
		}
		assertEquals(true, result);

	}



}
