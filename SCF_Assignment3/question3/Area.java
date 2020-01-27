import java.util.InputMismatchException;
import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		/*
		 * Class Operation's instance is created
		 */
		AreaOperations operation=new AreaOperations();
		Scanner input=new Scanner(System.in);
		double width , height ,radius , area ;
		while(true){
			try{

				System.out.println("\n\nEnter the choice for which you want to find area : ");
				System.out.println("1. Triangle\n2. Rectangle\n3. Square\n4. Circle\n5. Exit");

				int choice = input.nextInt();

				switch(choice){

				case 1:
					System.out.print("\nEnter width of triangle : ");
					width = input.nextDouble();
					if( width > 0){
						System.out.print("Enter height of triangle: ");
						height = input.nextDouble();
						if(height > 0){
							area=operation.areaOfTriangle(width,height);
							System.out.println("\nArea of the triangle : "  +  area  +  "\n\n");
						}
						else
							System.out.println("Height should be greater then zero.\n");
					}
					else 
						System.out.println("Width should be greater then zero.\n");
					break;

				case 2:
					System.out.print("\nEnter width of rectangle : ");
					width = input.nextDouble();
					if( width > 0){
						System.out.print("Enter Height of rectangle : ");
						height = input.nextDouble();
						if(height > 0){
							area=operation.areaOfRectangle(width,height);
							System.out.println("\nArea of the rectangle : "  +  area  +  "\n\n");
						}else
							System.out.println("Height should be greater then zero.\n");
					}
					else 
						System.out.println("Width should be greater then zero.\n");

					break;

				case 3:
					System.out.print("\nEnter width of square ");
					width = input.nextDouble();
					if( width > 0){
						area=operation.areaOfSquare(width);
						System.out.println("\nArea of the square : "  +  area  +  "\n\n");
					}	else 
						System.out.println("Width should be greater then zero.\n");
					break;

				case 4:
					System.out.print("\nEnter radius of circle : ");
					radius = input.nextDouble();
					if( radius > 0){
						area=operation.areaOfCircle(radius);
						System.out.println("\nArea of the circle : "  +  area  +  "\n\n");
					}	else 
						System.out.println("Radius should be greater then zero.\n");
					break;

				case 5:
					System.exit(0);
					break;

				default:
					System.out.println("Your input dont match to the given choice\n\n");
				}	
			}
			catch(InputMismatchException e){
				System.out.print("Your input dont match to the given choice\n\n");
				input.next();

			}
		}

	}	
}
