import java.util.InputMismatchException;
import java.util.Scanner;

public class StringOerations {

	public static void main(String[] args) {

		/*
		 * Class Operation's instance is created
		 */
		Operations operation = new Operations();
		Scanner input = new Scanner(System.in);

		while(true){
			try{
				System.out.println("Press:\n1.Check the equality of two strings.\n2.Reverse of string\n3.Replace lowercase characters with uppercase and uppercase with lowercase\n4.Largest word of a string\n");

				int choice = input.nextInt();

				switch(choice){


				case 1:
					System.out.print(   operation.compare(mainString())  +  "\n\n");
					break;

				case 2:


					System.out.print("Reverse String is : "  +  operation.reverse(mainString())  +  "\n\n");
					break;

				case 3:
					System.out.print("New string is:"  +  operation.changeCase(mainString())  +  "\n\n");
					break;

				case 4:
					System.out.print("Longest word is:"  +  operation.largestWord(mainString())  +  "\n\n");
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

