import java.util.Scanner;

public class LCM_HCF {
	/**
	 * 
	 * @param x : first number
	 * @param y : second number
	 * @return : HCF of x & y 
	 */
	static long hcf(long x,long y)throws AssertionError {
		if(x == 0  &&  y == 0)
			throw new AssertionError("Both numbers cant be zero.");
		if(x < 0  || y < 0)
			throw new AssertionError("Numbers cant be negative.");
		if (x==0)
			return y;
		return hcf( y % x , x );


	}
	/**
	 * 
	 * @param x : first number
	 * @param y : second number
	 * @return : LCM of x & y 
	 */
	static long lcm(long x, long y){
		return (x * y) / hcf( x,y);

	}
}
