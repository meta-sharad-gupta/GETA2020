import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Class PolyTest will contain the test case of polynomial(Poly) class 
 *
 */
public class PolyTest {
	Poly obj = new Poly(new int[][]{{2,1},{2,2},{2,0}});

	@Test
	public void Evaluation() {
		assertEquals(14, obj.evaluate(2.f),0.000);
	}

	@Test
	public void Evaluation1() {
		assertEquals(6.0f, obj.evaluate(-2f),0.009);
	}

	@Test
	public void Degree() {	
		assertEquals(2, obj.degree());
	}

	@Test
	public void AddPolinomial() {
		assertEquals( true, obj.addPoly( new Poly(new int[][]{{2,1},{2,2},{2,4}}), new Poly(new int[][]{ {2,1} , {2,2} })) );
	}

	@Test
	public void MultiplyPolinomial() {
		assertEquals( true, obj.multiplyPoly( new Poly(new int[][]{{2,1},{2,2},{2,4}}), new Poly(new int[][]{ {2,1} , {2,1} })) );
	}

	@Test
	public void when_negative_number_ispassed() {
		try { 
			assertEquals("size of array is size is zero",1, new Poly(new int[][]{}));
		}
		catch (AssertionError e) {
			System.out.println("\nsize of array is zero");
		}
	}

}
