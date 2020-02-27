import java.util.Scanner;

public class OperationsForString {
	/**
	 * Used for comparing two strings
	 * @param mainString : the string on which the operation has to be performed
	 * @return 0,1 : these integer shows if strings are equal or not
	 */
	public int compare(String mainString) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the second string for comparison :");
		String secondString = input.nextLine();
		char[] mainstring = mainString.toCharArray();//it breaks the string into a character array
		char[] secondstring = secondString.toCharArray();
		int returnValue = 1;//variable for return 0 or 1
		if (mainstring.length != secondstring.length) {
			returnValue = 0;
		}
		else {
			for (int index = 0; index < mainstring.length; index++) {
				if (mainstring[index] != secondstring[index]) {
					returnValue = 0;
				}
			}
		}
		if(returnValue == 0)
			return returnValue;
		else
		return returnValue;
	}
	/**
	 * Used for reverse the input string
	 * @param mainString : the string on which the operation has to be performed
	 * @return reverseString : it gives the reverse of mainString
	 */
	public String reverse(String mainString) {
		char[] mainstring = mainString.toCharArray();
		char[] reversestring = new char[mainstring.length];
		int indexOfReverseString=0;
		for (int index = mainstring.length - 1; index >= 0; index--) {//question on for loop

			reversestring[indexOfReverseString] = mainstring[index];
			indexOfReverseString+=1;
		}
		String reverseString = String.valueOf(reversestring);
		return reverseString;

	}

	/**
	 * Used for change the uppercase character to lowercase and vice versa
	 * @param mainString : the string on which the operation has to be performed
	 * @return returnString : it gives the output string in change of character case
	 */
	public String changeCase(String mainString){
		char[] mainstring = mainString.toCharArray();
		for (int index = 0; index < mainstring.length; index++){
			int index1 = mainstring[index];

			if(index1 > 96 && index1 < 123) {
				index1 = index1 - 32;
				mainstring[index] = (char)index1;
			} else if(index1 > 64 && index1 < 91) {
				index1 = index1+32;
				mainstring[index] =(char)index1;

			}


		}

		String returnString = String.valueOf(mainstring);
		return  returnString;


	}

	/**
	 * Used for giving the largest word from a string
	 * @param mainString : the string on which the operation has to be performed
	 * @return reverseString : it gives the reverse of mainString
	 */
	public String largestWord(String mainString){
		char[] mainstring = mainString.toCharArray();

		int variablelength = 0, mainlength = 0, mainindex = 0, variableindex = 0;
		for (int index = 0 ; index < mainstring.length ; index++){
			if(mainstring[index] == ' ' || index == mainstring.length-1){
				if(index == mainstring.length-1)
					variablelength++;
				if(variablelength >= mainlength){
					mainlength = variablelength;
					mainindex = variableindex;
				}

				variablelength = 0;
				variableindex = index+1;

			}
			else
				variablelength++;
		}
		char[] largestWord = new char[mainlength];
		for(int index = 0 ; index < mainlength ; index++){
			largestWord[index]  = mainstring[(mainindex+index)];
		}
		String returnString = String.valueOf(largestWord);
		return returnString;
	}
}
