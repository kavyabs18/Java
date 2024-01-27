package com.kodnest.data_structures;

import java.util.Scanner;

public class Queue_App {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("User Enter Size of Queue");
		int n = scan.nextInt();
		Queue queue = new Queue(n);
		while(true) {
			System.out.println("ENTER YOUR CHOICE");
			System.out.println("=============================");
			System.out.println("Press 1 ---------> Push/Insert");
			System.out.println("Press 2 ---------> Pop/Delete");
			System.out.println("Press 3 ---------> Display");
			System.out.println("Press any other number to STOP");
			System.out.println("=============================");
			int choice = scan.nextInt();
			switch(choice) {
			case 1 : queue.insert();
					 break;
			case 2 : queue.delete();
					 break;
			case 3 : queue.display();
					 break;
			default: System.exit(0);
			}
		}
	}
}

class Queue{
	private int q[];
	private int size;
	private int r = -1;
	private int f = 0;
	private Scanner scan = new Scanner(System.in);
	public Queue(int n) {
		q = new int[n];
		size = q.length;
	}
	
	public void insert() {
		if(r==size-1) {
			System.out.println("Insertion Not Possible");
		}
		else {
			System.out.println("Enter en element");
			int elem = scan.nextInt();
			++r;
			q[r] = elem;
		}
	}
	
	public void delete() {
		if(r==-1 || f>r) {
			System.out.println("Deletion Not Possible");
		}
		else {
			System.out.println("Element deleted is : "+q[f]);
			++f;
		}
	}
	
	public void display() {
		if(r==-1 || f>r) {
			System.out.println("Display Not Possible");
		}
		else {
			for(int i=f; i<=r; i++) {
				System.out.print(q[i]+" ");
			}
			System.out.println();
		}
	}
}