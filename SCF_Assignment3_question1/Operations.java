import java.util.Scanner;

public class Operations {
	/*
	 * Used for comparing two strings
	 * @param mainString : the string on which the operation has to be performed
	 * @return 0,1 : these integer shows if strings are equal or not
	 */
	public int compare(String mainString) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the second string with which you want to compare main string:");
		String secondString = input.nextLine();
		char[] mainstring = mainString.toCharArray();//it breaks the string into a character array
		char[] secondstring = secondString.toCharArray();
		if (mainstring.length != secondstring.length) {

			return 0;

		} else {
			for (int length = 0; length < mainstring.length; length++) {
				if (mainstring[length] != secondstring[length]) {
					return 0;
				}
			}
			return 1;

		}
	}
	/*
	 * Used for reverse the input string
	 * @param mainString : the string on which the operation has to be performed
	 * @return reverseString : it gives the reverse of mainString
	 */
	public String reverse(String mainString) {
		char[] mainstring = mainString.toCharArray();
		char[] reversestring = new char[mainstring.length];
		int j=0;
		for (int length = mainstring.length - 1; length >= 0; length--) {

			reversestring[j] = mainstring[length];
			j+=1;
		}
		String reverseString = String.valueOf(reversestring);
		return reverseString;

	}

	/*
	 * Used for change the uppercase character to lowercase and vice versa
	 * @param mainString : the string on which the operation has to be performed
	 * @return returnString : it gives the output string in change of character case
	 */
	public String changeCase(String mainString){
		char[] mainstring = mainString.toCharArray();
		for (int length = 0; length < mainstring.length; length++){
			int b=mainstring[length];

			if(b>96&&b<123){
				b=b-32;
				mainstring[length] =(char)b;
			}
			else if(b>64&&b<97){
				b=b+32;
				mainstring[length] =(char)b;

			}


		}
		String returnString = String.valueOf(mainstring);
		return  returnString;


	}

	/*
	 * Used for giving the largest word from a string
	 * @param mainString : the string on which the operation has to be performed
	 * @return reverseString : it gives the reverse of mainString
	 */
	public String largestWord(String mainString){
		char[] mainstring = mainString.toCharArray();
		
		int variablelength=0,mainlength=0,mainindex=0,variableindex=0;
		for (int length = 0 ; length < mainstring.length ; length++){
			if(mainstring[length]==' '||length==mainstring.length-1){
				if(length==mainstring.length-1)
					variablelength++;
				if(variablelength>=mainlength){
					mainlength=variablelength;
					mainindex=variableindex;
				}

				variablelength=0;
				variableindex=length+1;

			}
			else
				variablelength++;
		}
		char[] largestWord = new char[mainlength];
		for(int length=0;length<mainlength;length++){
			largestWord[length]  = mainstring[(mainindex+length)];
		}
		String returnString = String.valueOf(largestWord);
		return returnString;
	}
}
