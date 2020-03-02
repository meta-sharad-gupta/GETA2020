package view;

import java.util.ArrayList;
import java.util.Iterator;
import dao.UserBucket;


/**
 * 
 * @author Sharad Gupta 
 * Shopping Cart OutputView Code
 * copyright GET2020
 */
public class OutputView {
	
	/**
	 * Display Welcome message 
	 */
	public void aboutProgram(){
		System.out.println("		SHOPPING SERVICE                          ");
		System.out.println("ADD   |   REMOVE   |   UPDATE   |   DELETE           \n\n");
	}
	
	/**
	 * 
	 * @param productName
	 * @param produtPrice
	 * Display Product list and there corresponding price
	 */
	public void displayListOfProducts(String[] productName, int[] produtPrice) {
		System.out.println("SN\tProduct Name\tPrice \t \t\t  ");
		for (int productId = 0; productId < 5; productId++)
			System.out.println((productId + 1) + "\t"	+ productName[productId]+"\t\t"+ produtPrice[productId]);
	}

	/**
	 * Display Operation List  
	 */
	public void displayOptions() {
		System.out.println("\n1: Add Product in Bucket");
		System.out.println("2: Remove Product form Bucket");
		System.out.println("3: Display Orders List");
		System.out.println("4: Place the Order");
		System.out.println("5: Exit ");
	}

	/**
	 * 
	 * @param userBucket
	 * Display user bucket
	 */
	public void  displayBucketProducts(ArrayList<UserBucket> userBucket) {
		Iterator<UserBucket> itrator = userBucket.iterator();
		int productID = 1;
		System.out.println("\tID\tProduct Name\tQuantity\tPrice");

		while (itrator.hasNext()) {
			UserBucket itreatorIndex = (UserBucket) itrator.next();
			System.out.println("\t"+productID++ + "\t" + itreatorIndex.getProductName() + "\t\t"
					+ itreatorIndex.getProductQuantity() + "\t\t" + itreatorIndex.getProductPrice());
		}


	}
	/**
	 * 
	 * @param totalPrice
	 * @param totalProductinBucket
	 * DIsplay total price and total product
	 */
	public void displayTotalPriceAndQuantity(int totalPrice, int totalProductinBucket){
		System.out.println("\tQuantity of Products: " + totalProductinBucket+ "\n\tTotal Price: " + totalPrice + "\n");
	}
	
	/**
	 * Ask to buy more
	 */
	public void askToBuyMore(){
		System.out.println("DO you want to buy more Product ?");
		System.out.println("Press 1 for Yes and other key for No\n\n");
	}

}
