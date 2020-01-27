import java.util.Scanner;

public class Update {
	int i;
	Item item = new Item();
	

	public void update() {//method for updating the quaantity
		System.out.println("enter the ID of the product");
		Scanner s = new Scanner(System.in);
		int id = s.nextInt();// variable to select id of product

		int z = 1;
		while (z == 1) {
			System.out.println("Enter the quantity of "
					+ item.nameOfProduct[id - 1] + "(Not More Then 100) ");
			int quantity = s.nextInt();// variable to take quantity
										// of product from user

			if (quantity > 0 && quantity < 101)// condition for
												// limiting quantity
												// of items
			{
				item.quantityOfProduct[id - 1] = quantity;
				z = 2;
			}

			else {
				System.out.println("Enter Valid Quantiy");
			}
		}

	}

	public void list() {//method to display item list
		System.out
				.println("\n                *  LIST OF ITEMS AND FINAL AMOUNT  *\n\n       ");
		System.out.println("ID		" + "NAME		" + "PRICE		" + "QUANTITY	 "
				+ "AMOUNT");
		for (i = 0; i < item.numberOfProducts; i++) {
			if (item.quantityOfProduct[i] != 0)
				System.out
						.println(i
								+ 1
								+ "		"
								+ item.nameOfProduct[i]
								+ "		"
								+ item.priceOfProducts[i]
								+ "		"
								+ item.quantityOfProduct[i]
								+ "		"
								+ (item.quantityOfProduct[i] * item.priceOfProducts[i]));

		}
	}
	public void update_2(){//method for update the quantity if already their
		
		Scanner s1 = new Scanner(System.in);int id;
		System.out.println("enter the ID of the product");
		id = s1.nextInt();
		if (item.quantityOfProduct[id - 1] == 0) {// condition if
												// quantity is
												// already zero
			System.out
					.println("Item is Not availabale in cart.Kindly Add the "
							+ item.nameOfProduct[id - 1]
							+ " in cart first.");
		} else {
			 int z = 1;
			while (z == 1) {
				System.out
						.println("Kindly update the new quantity (not more than 100) of "
								+ item.nameOfProduct[id - 1]
								+ " . Old quantity was  "
								+ item.quantityOfProduct[id - 1]);
				int quantity = s1.nextInt();

				if (quantity > 1 && quantity < 101) {
					item.quantityOfProduct[id - 1] = quantity;
					z = 2;
				} else {
					System.out.println("Enter Valid Quantiy");
				}
			}
		}
	}
	public void bill(){//method for bill
		int bill = 0; // variable for Final Bill
		for (i = 0; i < item.numberOfProducts; i++) {
			bill = bill
					+ (item.quantityOfProduct[i] * item.priceOfProducts[i]);
		}
		System.out.println("Your Total Bill Amount Is :  " + bill+ "\nTHANK YOU FOR SHOPPING WITH US ");
		
		

	}
}
