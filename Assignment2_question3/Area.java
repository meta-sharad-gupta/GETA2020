import java.util.InputMismatchException;
import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		/*
		 * Class Operation's instance is created
		 */
		AreaOperations operation=new AreaOperations();
		Scanner input=new Scanner(System.in);
		
			while(true){
				try{
				
				System.out.println("Enter the choice for which you want to find area : ");
				System.out.println("1. Triangle\n2. Rectangle\n3. Square\n4. Circle");
			
				int choice = input.nextInt();
				
				switch(choice){
				
				case 1:
					System.out.print("\nEnter width of triangle : ");
					double width = input.nextDouble();
					System.out.print("Enter height of triangle: ");
					double height = input.nextDouble();
					double area=operation.areaOfTriangle(width,height);
					System.out.println("\nArea of the triangle : "  +  area  +  "\n\n");
					break;
					
				case 2:
					System.out.print("\nEnter width of rectangle : ");
					width = input.nextDouble();
					System.out.print("Enter Height of rectangle : ");
					height = input.nextDouble();
					area=operation.areaOfRectangle(width,height);
					System.out.println("\nArea of the rectangle : "  +  area  +  "\n\n");
					break;
					
				case 3:
					System.out.print("\nEnter width of square ");
					width = input.nextDouble();
					area=operation.areaOfSquare(width);
					System.out.println("\nArea of the square : "  +  area  +  "\n\n");
					break;
					
				case 4:
					System.out.print("\nEnter radius of circle : ");
					double radius = input.nextDouble();
					area=operation.areaOfCircle(radius);
					System.out.println("\nArea of the circle : "  +  area  +  "\n\n");
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
