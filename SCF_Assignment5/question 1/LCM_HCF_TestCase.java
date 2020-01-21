import static org.junit.Assert.*;

import org.junit.Test;

//class of test cases for LCM and HCF
public class LCM_HCF_TestCase {

	LCM_HCF object = new LCM_HCF();

	@Test
	public void test() {
		long x = 18 , y = 18 ;
		assertEquals(18,object.hcf(x, y));
		assertEquals(18,object.lcm(x, y));
	}

	@Test
	public void test1() {
		int x = 0 , y = 20 ;
		assertEquals(20,object.hcf(x, y));
		assertEquals(0,object.lcm(x, y));
	}

	@Test
	public void test2() {
		int x = 30 , y = 50 ;
		assertEquals(10,object.hcf(x, y));
		assertEquals(150,object.lcm(x, y));
	}

}

