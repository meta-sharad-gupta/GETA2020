import java.util.InputMismatchException;
import java.util.Scanner;

public class Marksheet {

	public static void main(String[] args) {
		/*
		 * Class Operation's instance is created
		 */
		MarksheetOperation marksheet = new MarksheetOperation();
		Scanner input = new Scanner(System.in);
		while(true){
			try {
				System.out.print("Enter the total number of students:");
				int numberOfStudents = input.nextInt();

				float grades[] = new float[numberOfStudents];
				int index=0 ;
				System.out.println("Grades of Students should not less then 0 and exceed 100\n");
				while(index < grades.length){

					try {
					System.out.print("Enter the grade of student " + (index + 1)
							+ ":");
					
					grades[index] = input.nextFloat();
					if(grades[index] >= 0 && grades[index] <101 ){
						index++;
					}
					else{
					System.out.println("\nYour input dont match to the given choice\n\n");
					}
					} catch (InputMismatchException e) {
						System.out.print("\nYour input dont match to the given choice\n\n");
						input.next();

					}
					
				}

				while (true) {
					try {
					System.out
					.println("Press:\n1.For average of grades.\n2.Maximum grade.\n3.Minimum grade.\n4.Percentage of pass students.\n5. Exit");
					int choiceForProcess = input.nextInt();
					switch (choiceForProcess) {

					case 1:
						System.out.print("Average of grades are:"
								+ marksheet.averageGrades(grades) + "\n\n");
						break;

					case 2:
						System.out.print("Maximum grades are:"
								+ marksheet.maximumGrade(grades) + "\n\n");
						break;

					case 3:
						System.out.print("Minimum grades are:"
								+ marksheet.minimumGrade(grades) + "\n\n");
						break;

					case 4:
						System.out.print("Percentage of pass stuents are:"
								+ marksheet.passStudents(grades) + "\n\n");
						break;

					case 5:
						System.exit(0);
						break;

					default:
						System.out
						.println("Your input dont match to the given choice\n\n ");

					}
					} catch (InputMismatchException e) {
						System.out.print("Your input dont match to the given choice\n\n");
						input.next();

					}

				}

			} catch (InputMismatchException e) {
				System.out.print("Your input dont match to the given choice\n\n");
				input.next();

			}
		}
	}

}
