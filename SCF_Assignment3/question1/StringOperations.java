
import java.util.InputMismatchException;
import java.util.Scanner;

public class StringOperations {

	public static void main(String[] args) {

		// Class Operation's instance is created

		OperationsForString operation = new OperationsForString();
		Scanner input = new Scanner(System.in);

		while(true){
			try{
				System.out.println("Press:\n1.Check the equality of two strings.\n"
						+ "2.Reverse of string\n"
						+ "3.Replace lowercase characters with uppercase and uppercase with lowercase\n"
						+ "4.Largest word of a string\n"
						+ "5.Exit\n");

				int choice = input.nextInt();

				switch(choice){


				case 1:

					if(operation.compare(mainString())==0)
					{
						System.out.println("Strings are not equal.(0)\n\n");
					}else{
						System.out.println("Strings are equal.(1)\n\n");
					}
					break;

				case 2:

					String reverse = mainString();
					if(reverse.isEmpty())
						System.out.println("String cant be empty\n");
					else
						System.out.print("Reverse String is : "  +  operation.reverse(reverse)  +  "\n\n");
					break;

				case 3:
					String returnString = mainString();
					if(returnString.isEmpty())
						System.out.println("String cant be empty\n");
					else
					System.out.print("New string is:"  +  operation.changeCase(returnString)  +  "\n\n");
					break;

				case 4:
					String returnnString = mainString();
					if(returnnString.isEmpty())
						System.out.println("String cant be empty\n");
					else
					System.out.print("Longest word is:"  +  operation.largestWord(returnnString)  +  "\n\n");
					break;

				case 5:
					System.exit(0);
					break;

				default:
					System.out.print("Your input dont match to the given choice\n\n");

				}
			}
			catch(InputMismatchException e){
				System.out.print("Your input dont match to the given choice\n\n");
				input.next();

			}
		}




	}
	public static String mainString(){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the string for which you want to perform the operation:");

		String mainString = input.nextLine();
		return mainString;

	}

}

