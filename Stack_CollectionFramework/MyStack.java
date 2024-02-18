package com.kodnest.stack_collectionframework;

import java.util.Scanner;

public class MyStack {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		MyStack_ArrayList al = new MyStack_ArrayList();
		MyStack_LinkedList ll = new MyStack_LinkedList();
		MyStack_ArrayDeque ad = new MyStack_ArrayDeque();
		while (true) {
			System.out.println("Press: 1 -----> Use ArrayList");
			System.out.println("Press: 2 -----> Use LinkedList");
			System.out.println("Press: 3 -----> Use ArrayDeque");
			System.out.println("Any other number to exit");
			System.out.println("Enter your Choice");
			int n = scan.nextInt();
			if (n == 1) {
				while (true) {
					System.out.println("Press: 1 ------> Push");
					System.out.println("Press: 2 ------> Pop");
					System.out.println("Press: 3 ------> Peek");
					System.out.println("Press: 4 ------> Display");
					System.out.println("Any other number to exit");
					System.out.println("Enter your Choice");
					int choice = scan.nextInt();
					switch (choice) {
					case 1:
						al.push();
						break;

					case 2:
						al.pop();
						break;

					case 3:
						al.peek();
						break;

					case 4:
						al.display();
						break;

					default:
						System.exit(0);
					}
				}
			} else if (n == 2) {
				while (true) {
					System.out.println("Press: 1 ------> Push");
					System.out.println("Press: 2 ------> Pop");
					System.out.println("Press: 3 ------> Peek");
					System.out.println("Press: 4 ------> Display");
					System.out.println("Any other number to exit");
					System.out.println("Enter your Choice");
					int choice = scan.nextInt();
					switch (choice) {
					case 1:
						ll.push();
						break;

					case 2:
						ll.pop();
						break;

					case 3:
						ll.peek();
						break;

					case 4:
						ll.display();
						break;

					default:
						System.exit(0);
					}
				}
			}
			else if (n == 3) {
				while (true) {
					System.out.println("Press: 1 ------> Push");
					System.out.println("Press: 2 ------> Pop");
					System.out.println("Press: 3 ------> Peek");
					System.out.println("Press: 4 ------> Display");
					System.out.println("Any other number to exit");
					System.out.println("Enter your Choice");
					int choice = scan.nextInt();
					switch (choice) {
					case 1:
						ad.push();
						break;

					case 2:
						ad.pop();
						break;

					case 3:
						ad.peek();
						break;

					case 4:
						ad.display();
						break;

					default:
						System.exit(0);
					}
				}
				
			}
		}
	}
}
