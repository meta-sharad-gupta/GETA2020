package com.metacube.dsa1_3;

/**
 * It is a class to find degree of multivariate polynomial.
 */
public class MultiVarPoly {

	private Node head;

	/**
	 * It is class used to create a node of linked list.
	 */
	class Node {
		public int data;
		public Node right;
		public Node exponential;

		/**
		 * It is default constructor of class.
		 */
		public Node() {
		}

		/**
		 * It is a constructor used to initialize a node.
		 * @param data value of data field of node.
		 */
		public Node(int data) {
			this.data = data;
			right = null;
			exponential = null;
		}

	}

	/**
	 * It is a method which is used to create a linked list.
	 * @param coeff coefficient of polynomial
	 * @param expoArr array of exponent of particular coefficient.
	 */
	public void createLinkList(int coeff, int[] expoArr) {
		Node newNode = new Node(coeff);
		if (head == null) {
			head = newNode;
		} else {
			Node temp = head;
			while (temp.right != null) {
				temp = temp.right;
			}
			temp.right = newNode;
		}
		for (int i = 1; i < expoArr.length ; i++) {
			Node newNode1 = new Node(expoArr[i]);
			newNode.exponential = newNode1;
			newNode = newNode1;
		}

	}

	/**
	 * It is a method used to show a linked list.
	 */
	public void show() {
		Node temp = head;
		if (head == null) {
			System.out.println("No elements are in the list!!!\n");
			return;
		}
		
		System.out.println("\n\nLINKED LIST  : ");
		while(temp != null) {
			System.out.print("coefficient->" + temp.data + "->" + "Exponential terms->");
			Node temp1= temp.exponential;
			while (temp1 != null) {
				System.out.print(temp1.data + "->");
				temp1 = temp1.exponential;
			}
			temp = temp.right;
			System.out.println();
		}
	}

	/**
	 * It is a method used to find degree of the polynomial.
	 */
	public int findDegree() {
		int max = 0;
		try{
		
		if (head == null) {
			System.out.println("No items in the list!!!");
			return max;
		}
		Node temp = head;
		while (temp != null) {
			int sum = 0;
			Node temp1 = temp;
			while (temp1.exponential != null) {
				sum = sum + temp1.exponential.data;
				temp1 =temp1.exponential;
			}
			if (sum > max) {
				max = sum;
			}
			temp = temp.right;
		}
		
		}
		catch(Exception e){
			
		}
		return max;
	}
}
