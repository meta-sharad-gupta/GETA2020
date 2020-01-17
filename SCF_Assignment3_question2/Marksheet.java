import java.util.InputMismatchException;
import java.util.Scanner;


public class Marksheet {

	public static void main(String[] args) {
		/*
		 * Class Operation's instance is created
		 */
		MarksheetOperation marksheet = new MarksheetOperation();
		System.out.print("Enter the total number of students:");
		Scanner input = new Scanner(System.in);
		int numberOfStudents = input.nextInt(); 
		float grades[] = new float[numberOfStudents];
		for(int length=0;length<grades.length;length++){//loop for taking the input of grade from user 
			System.out.print("Enter the grade of student "  +  (length+1)  +  ":");
			grades[length] = input.nextFloat();
		}
		while(true){
			try{
				System.out.println("Press:\n1.For average of grades.\n2.Maximum grade.\n3.Minimum grade.\n4.Percentage of pass students.");
				int choiceForProcess = input.nextInt();
				switch(choiceForProcess){

				case 1:
					System.out.print("Average of grades are:"  +  marksheet.averageGrades(grades)  +  "\n\n");
					break;

				case 2:
					System.out.print("Maximum grades are:"  +  marksheet.maximumGrade(grades)  +  "\n\n");
					break;

				case 3:
					System.out.print("Minimum grades are:"  +  marksheet.minimumGrade(grades)  +  "\n\n");
					break;

				case 4:
					System.out.print("Percentage of pass stuents are:"  +  marksheet.passStudents(grades)  +  "\n\n");
					break;

				default:
					System.out.println("Your input dont match to the given choice\n\n ");

				}
			}
			catch(InputMismatchException e){
				System.out.print("Your input dont match to the given choice\n\n");
				input.next();

			}
		}


	}
}
