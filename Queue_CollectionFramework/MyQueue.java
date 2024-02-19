package com.kodnest.queue_collectionframework;

import java.util.Scanner;

public class MyQueue {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		MyQueue_ArrayList mq = new MyQueue_ArrayList();
		MyQueue_LinkedList ml = new MyQueue_LinkedList();
		MyQueue_ArrayDeque ad = new MyQueue_ArrayDeque();
		while (true) {
			System.out.println("Press: 1 -----> Use ArrayList");
			System.out.println("Press: 2 -----> Use LinkedList");
			System.out.println("Press: 3 -----> Use ArrayDeque");
			System.out.println("Any other number to exit");
			System.out.println("Enter your Choice");
			int n = scan.nextInt();
			if(n==1) {
				while(true) {
					System.out.println("Press: 1 ------> Push/Enque");
					System.out.println("Press: 2 ------> Pop/Deque");
					System.out.println("Press: 3 ------> Peek");
					System.out.println("Press: 4 ------> Display");
					System.out.println("Any other number to exit");
					System.out.println("Enter your Choice");
					int choice = scan.nextInt();
					switch(choice) {
					case 1: mq.enque();
					break;
					
					case 2: mq.deque();
					break;
					
					case 3: mq.peek();
					break;
					
					case 4: mq.display();
					break;
					
					default: System.exit(0);
					}
				}
			}
			else if(n==2) {
				while(true) {
					System.out.println("Press: 1 ------> Push/Enque");
					System.out.println("Press: 2 ------> Pop/Deque");
					System.out.println("Press: 3 ------> Peek");
					System.out.println("Press: 4 ------> Display");
					System.out.println("Any other number to exit");
					System.out.println("Enter your Choice");
					int choice = scan.nextInt();
					switch(choice) {
					case 1: ml.enque();
					break;
					
					case 2: ml.deque();
					break;
					
					case 3: ml.peek();
					break;
					
					case 4: ml.display();
					break;
					
					default: System.exit(0);
					}
				}
			}
			else if(n==3) {
				while(true) {
					System.out.println("Press: 1 ------> Push/Enque");
					System.out.println("Press: 2 ------> Pop/Deque");
					System.out.println("Press: 3 ------> Peek");
					System.out.println("Press: 4 ------> Display");
					System.out.println("Any other number to exit");
					System.out.println("Enter your Choice");
					int choice = scan.nextInt();
					switch(choice) {
					case 1: ad.enque();
					break;
					
					case 2: ad.deque();
					break;
					
					case 3: ad.peek();
					break;
					
					case 4: ad.display();
					break;
					
					default: System.exit(0);
					}
				}
			}
		}
	}
}
