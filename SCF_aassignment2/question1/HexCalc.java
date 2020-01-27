import java.util.*;

public class HexCalc {

	private static boolean flag;
	public static void main(String[] args) {

		System.out.println("****WELCOME TO HEXADECIMAL OPERATIONS****");
		Scanner s = new Scanner(System.in);
		String firstHexad  , secondHexad ;
		int x =1;
		int y = 1, z;
		while (y == 1) {
			try{
				Scanner s1 = new Scanner(System.in);
				Scanner s2 = new Scanner(System.in);
				System.out.println("\n\nPress:\n"
						+ "1. Perform airthemetic operations(add, subtract, multiply and divide) of two hexa decimal numbers\n"
						+ "2. Compare two Hexadecimal number\n"
						+ "3. Conversion for hexadecimal number to deccimal number\n"
						+ "4. Conversion for decimal number to hexadecimal number\n"
						+ "5. Exit");
				int choiceForProcess = s1.nextInt();
				switch (choiceForProcess) {
				case 1:


					System.out.print("Enter 1st Hexadecimal number:");
					firstHexad = s.nextLine();
					if(!inputNUmbers(firstHexad)){//checking if number is hexadecimal or not
						System.out.println("Hexadecimal Number is not correct\n");
						break;
					}


					System.out.print("Enter 2nd Hexadecimal number:");
					secondHexad = s.nextLine();
					if(!inputNUmbers(secondHexad)){
						System.out.println("Hexadecimal Number is not correct\n");
						break;
					}



					char[] firstHexa = firstHexad.toCharArray();
					char[] secondHexa = secondHexad.toCharArray();
					int a=conversionH2D(firstHexa,"Number 1");//converted decimal number
					int b=conversionH2D(secondHexa,"Number 2");
					int c;
					//case for subtraction
					if (a >= b)
						c =a-b;
					else{
						c = b-a;
					}

					System.out.println("Addition is:"  +  conversionD2H((a+b))  +  
							"\nSubstraction is:"  +  conversionD2H(c)+  
							"\nMultiplication is:"  +  conversionD2H(a*b)  +  
							"\nDivision is: quotient is "  +   conversionD2H((a/b))  +  " and reminder is "  +  conversionD2H(a%b) )
							;

					break;




				case 2:

					System.out.println("Enter 1st Hexadecimal number:");
					firstHexad = s.nextLine();
					if(!inputNUmbers(firstHexad)){
						System.out.println("Hexadecimal Number is not correct");
						break;
					}

					System.out.println("Enter 2nd Hexadecimal number:");
					secondHexad = s.nextLine();
					if(!inputNUmbers(secondHexad)){
						System.out.println("Hexadecimal number is not correct");
						break;
					}

					char[] firstHex = firstHexad.toCharArray();
					char[] secondHex = secondHexad.toCharArray();

					System.out.println( "1 to Comparasion for equal\n"
							+ "2 to comparison for greater\n"
							+ "3 to comparison for smaller\n");

					int choiceCase;//choice for  equal , greater and less
					choiceCase=s2.nextInt();
					switch(choiceCase){
					case 1:
						equal(firstHexad,secondHexad);
						break;
					case 2:
						greater(firstHexad,secondHexad);
						break;
					case 3:
						smaller(firstHexad,secondHexad);
						break;
					default:
						System.out.println("Enter a valid choice");

					}
					break;

				case 3:
					System.out.println("Enter Hexadecimal number:");
					firstHexad = s.nextLine();
					if(!inputNUmbers(firstHexad)){
						System.out.println("Number is not correct");
						break;
					}

					char[] hex = firstHexad.toCharArray();
					System.out.println("Decimal number is:"
							+ conversionH2D(hex,"Number"));
					break;

				case 4:
					System.out.println("Enter a decimal number:");
					int decimal = s1.nextInt();

					System.out.println("Hexadecimal number is:"  +  conversionD2H(decimal));
					break;

				case 5:
					System.exit(0);
				default:
					System.out.println("Enter a valid choice");


				}

			}
			catch(InputMismatchException e){
				System.out.println("your choice is not valid.");
			}
		}

	}
	/**
	 * 
	 * @param firstHexad : the number which have to be checked
	 * @return : number is hexadecimal or not
	 */
	static boolean inputNUmbers(String firstHexad){
		char[] firstHexa = firstHexad.toCharArray();
		int index , asciiValue ;
		for(index = 0 ; index < firstHexa.length ; index++){
			asciiValue=firstHexa[index];
			if(asciiValue >= 0 && asciiValue <= 47){
				return false;
			}
			else if(asciiValue >= 58 && asciiValue <= 64){
				return false;
			}
			else if(asciiValue >= 71 && asciiValue <= 96){
				return false;
			}
			else if(asciiValue >= 103){
				return false;
			}
		}

		return true;




	}
	/**
	 * 
	 * @param firstHexa : number to be converted
	 * @param s : number index
	 * @return : converted decimal value
	 */
	static int conversionH2D(char firstHexa[],String s) {

		int z=0, j, b, mul = 1;
		for (j = firstHexa.length-1; j >= 0; j--) {

			if (firstHexa[j] == '0' || firstHexa[j] == '1'
					|| firstHexa[j] == '2' || firstHexa[j] == '3'
					|| firstHexa[j] == '4' || firstHexa[j] == '5'
					|| firstHexa[j] == '6' || firstHexa[j] == '7'
					|| firstHexa[j] == '8' || firstHexa[j] == '9') {
				b = firstHexa[j] - 48;
			} else if (firstHexa[j] == 'a' || firstHexa[j] == 'b'
					|| firstHexa[j] == 'c' || firstHexa[j] == 'd'
					|| firstHexa[j] == 'e' || firstHexa[j] == 'f') {

				b = firstHexa[j] - 87;
			} else if (firstHexa[j] == 'A' || firstHexa[j] == 'B'
					|| firstHexa[j] == 'C' || firstHexa[j] == 'D'
					|| firstHexa[j] == 'E' || firstHexa[j] == 'F') {

				b = firstHexa[j] - 55;
			} else {

				flag=false;
				break;
			}
			z += (b * mul);
			mul *= 16;

		}
		return (z);

	}
	/**
	 * 
	 * @param firstHexa : number to be converted
	 * @param s : number index
	 * @return : converted hexadecimal value
	 */
	static String conversionD2H(int decimal) {
		int rem;  
		String hexa="";   
		char allhexa[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'}; 
		if(decimal==0)
			return "0";
		while(decimal>0)  
		{  
			rem=decimal%16;   
			hexa=allhexa[rem]+hexa;   
			decimal=decimal/16;  
		}  
		return hexa;  
	}
	/**
	 * 
	 * @param firstHexad : first number
	 * @param secondHexad : second number
	 */
	static void equal(String firstHexad,String secondHexad){
		if(firstHexad.compareTo(secondHexad)==0){
			System.out.println("Numbers are equal");
		}
		else{
			System.out.println("Numbers are not equal");
		}

	}
	/**
	 * 
	 * @param firstHexad : first number
	 * @param secondHexad : second number
	 */
	static void greater(String firstHexad,String secondHexad){
		if(firstHexad.compareTo(secondHexad)==1){
			System.out.println(firstHexad  +  " is greater then "  +secondHexad);
		}
		else{
			System.out.println(firstHexad  +  " is not greater then "  +secondHexad);
		}

	}
	/**
	 * 
	 * @param firstHexad : first number
	 * @param secondHexad : second number
	 */
	static void smaller(String firstHexad,String secondHexad){
		if(firstHexad.compareTo(secondHexad)==-1){
			System.out.println(firstHexad  +  " is smaller then "  +secondHexad);
		}
		else{
			System.out.println(firstHexad  +  " is  not smaller then "  +secondHexad);
		}

	}


}
