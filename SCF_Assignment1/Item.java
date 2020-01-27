
public class Item {
	int numberOfProducts = 7;// total number of products in cart
	String[] nameOfProduct = { "Soap", "Shampoo", "Biscuit", "Milk", "Egg",
			"breads", "Brush" };// array for name of products
	int priceOfProducts[] = { 40, 120, 30, 44, 6, 18, 20 };// array for
															// prices of the
															// products
	int[] quantityOfProduct = new int[numberOfProducts];// array for quantity of
														// products
	public int getNumberOfProducts() {
		return numberOfProducts;
	}
	public void setNumberOfProducts(int numberOfProducts) {
		this.numberOfProducts = numberOfProducts;
	}
	public String[] getNameOfProduct() {
		return nameOfProduct;
	}
	public void setNameOfProduct(String[] nameOfProduct) {
		this.nameOfProduct = nameOfProduct;
	}
	public int[] getPriceOfProducts() {
		return priceOfProducts;
	}
	public void setPriceOfProducts(int[] priceOfProducts) {
		this.priceOfProducts = priceOfProducts;
	}
	public int[] getQuantityOfProduct() {
		return quantityOfProduct;
	}
	public void setQuantityOfProduct(int[] quantityOfProduct) {
		this.quantityOfProduct = quantityOfProduct;
	}

	public void display(){
		int i;
	
		System.out.println("\n          AVAILABLE ITEM LIST \n\nID		NAME		PRICE");
		for (i = 0; i < numberOfProducts; i++) {
			System.out.println(i + 1 + "		" + nameOfProduct[i]
					+ "		" + priceOfProducts[i]);
	}
	}
}
