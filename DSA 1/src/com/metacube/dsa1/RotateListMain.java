package com.metacube.dsa1;

import java.util.Scanner;

public class RotateListMain {

	public static void main(String[] args) {
		boolean loop = true;
		while(loop){
			try{
				Node head = null;

				Scanner sc=new Scanner(System.in);
				System.out.println("Please enter the new Linklist => ");
				int x , countLastNode = 0;
				int runningLoop;
				do {
					System.out.println("Please enter the data : ");
					int data = sc.nextInt();
					head = createLinklist(head,data);
					System.out.println("Do you want to add more elements :\nPress 1 : Yes\t\tOther Integer : No");
					//variable for continuing the process 
					x = sc.nextInt();
					countLastNode++;
				}while(x==1);

				showLinklist(head);
				while(loop){
					System.out.println("Enter value of Left Position : ");
					int leftPosition = sc.nextInt();
					System.out.println("Enter value of Right Position : ");
					int rightPosition = sc.nextInt();
					System.out.println("Enter value of Number of Rotation : ");
					int numberOfRotation = sc.nextInt();

					head  = subLinklist(head, leftPosition , rightPosition , numberOfRotation , countLastNode );

					showLinklist(head);

					System.out.println("Press 1 for perform the operation again else any other operation to exit");
					runningLoop = sc.nextInt();
					if(runningLoop == 1){
						loop = true;
					}else{
						loop = false;
					}

				}

				System.out.println("Press 1 for entering another LinkedList else any other Integer to exit");

				runningLoop = sc.nextInt();
				if(runningLoop == 1){
					loop = true;
				}else{
					loop = false;
				}
			}catch(Exception e){
				System.out.println("\nEnter a valid input.\n");
			}

		}

	}


	static Node subLinklist(Node head, int leftPosition, int rightPosition, int numberOfRotation , int countLastNode) {
		int loopVariable = 1;
		Node previousLeft = null;
		Node left = null;
		Node right = head;

		if( leftPosition > rightPosition ) {
			System.out.println("This case in not valid ( Left position can not be greater than right position ).");
			return head;
		}
		else if(leftPosition < 1){
			System.out.println("Left Position can,t be less then 1.");
		}
		else if(rightPosition > countLastNode){
			System.out.println("Right position is greater then maximum nodes");
		}
		

		if( numberOfRotation >= (rightPosition - leftPosition + 1) ) {
			numberOfRotation = numberOfRotation % ( rightPosition - leftPosition + 1 );
			if( numberOfRotation == 0 ) {
				return head;
			}
		}
		if( leftPosition == rightPosition ) {
			return head;
		}

		while( ( right != null ) && ( loopVariable <= leftPosition || loopVariable <= rightPosition ) ) {
			if( loopVariable <= leftPosition ) {
				previousLeft = left;
				left = right;
			}
			if( loopVariable < rightPosition ) {
				right = right.next;
				loopVariable++;
			} else {
				break;
			}
		}

		if(leftPosition == 1) {
			previousLeft = right.next;
		} else {
			previousLeft.next = right.next;
		}

		right.next = null;
		left = rotation(left,numberOfRotation);
		right = left;
		while(right.next != null) {
			right = right.next;
		}

		if(leftPosition ==1) {
			head = left;
			right.next = previousLeft;
		} else {
			right.next = previousLeft.next;
			previousLeft.next = left;
		}

		return head;
	}


	// For roatating the string
	static Node rotation(Node left, int numberOfRotation) {
		Node current = null;
		for(int loopVariable = 1 ; loopVariable <= numberOfRotation ; loopVariable++) {
			current = left;
			while(current.next.next !=null) {
				current = current.next;
			}
			current.next.next = left; // First value added to last node
			left = current.next;      // left now poiting to last node
			current.next = null;      // doing last node next to null
		}
		return left;
	}

	static Node createLinklist(Node head,int element) {

		Node node = new Node(element);
		Node current = null;
		if(head == null) { 
			head = node;
		} else {
			current = head;
			while(current.next != null) {
				current = current.next;
			}
			current.next = node;
		}
		return head;
	}

	static void showLinklist(Node head) {
		Node traverse = head;
		String txt = "List is";
		if (head == null) {
			txt += " Empty";
		} else {
			while(traverse != null) {
				txt += (" ~> " + traverse.data);
				traverse = traverse.next;
			}
		}
		System.out.println(txt);
	}
}
