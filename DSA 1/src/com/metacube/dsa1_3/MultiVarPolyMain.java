package com.metacube.dsa1_3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * It is a class with main method.
 *
 */
public class MultiVarPolyMain {

	private static Scanner sc;

	/**
	 * It is a main method.
	 * @param args unused
	 */
	public static void main(String args[]) {
		boolean loop =true;
		while(loop){
			sc = new Scanner(System.in);
			MultiVarPoly polyObj = new MultiVarPoly();
			try {
				System.out.print("\n\nEnter the number of variables in the polynomial : ");
				int numberOfVariable = sc.nextInt();

				int expoArr[] = new int[numberOfVariable + 1];
				System.out.print("Enter the number of terms in your polynomial : ");
				int numberOfTerms = sc.nextInt();
				
				for (int loopCounter = 1; loopCounter <= numberOfTerms; loopCounter++) {
					System.out.print("Enter the coefficient of "+ loopCounter +" terms : ");
					int coeff = sc.nextInt();
					
					//here the values of the exponents will be saved
					for (int loopCounter2 = 1; loopCounter2 <= numberOfVariable ; loopCounter2++) {
						System.out.print("Enter exponent value for your "+ loopCounter2 +" variable for "+ loopCounter +" term : ");
						int exponent = sc.nextInt();
						expoArr[loopCounter2] = exponent;
					}
					polyObj.createLinkList(coeff, expoArr);
				}
				
				polyObj.show();
				polyObj.findDegree();
			} catch (InputMismatchException e) {
				System.out.println("Invalid Input");
			} 
		}
	}
}