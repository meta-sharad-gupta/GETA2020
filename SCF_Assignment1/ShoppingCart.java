
//Shopping Cart Program//

import java.util.Scanner;

public class ShoppingCart {

	public static void main(String[] args) {
		Item item=new Item();
		Update cart= new Update();

		System.out.println("******* HEY WELCOME TO SHOPPING CART *******");

		int i;// loop variable

		int y = 1;
		while (y == 1) {// loop for continues cart process

			
			try {// for Exception handling in whole program

				System.out
						.println("\nPress:\n"
								+ "1 to display all available Items with price list\n"
								+ "2 to select item followed by updating its quantity\n"
								+ "3 to display Updated Cart Items\n"
								+ "4 to change the quantity of Item allready added in cart"
								+ "\n5 to Checkout and BILL\n");// cart
																// operations

				Scanner s = new Scanner(System.in);
				int choiceforCartProcess = s.nextInt();// variable for cart
														// operations

				switch (choiceforCartProcess) {// for performing cart operations

				case 1:// display all available Items with price list
					
						item.display();
					
					break;

			case 2:// for selecting item and their quantity
					cart.update();
					break;

			case 3:// list of items with quantity and amount
					cart.list();
					break;

			case 4:// to update any quantity again
					cart.update_2();
					break;

				case 5:// final billing process
						cart.bill();
						y=2;
						break;

				default:
					System.out.println("Please Enter a Valid Choice");
					break;

				}
			}

			

		catch (Exception e) {
				System.out.println("Your CHOICE IS INVALID");
			}
		}
	}
}

