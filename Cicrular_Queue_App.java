package com.kodnest.data_structures;

import java.util.Scanner;

public class Cicrular_Queue_App {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Circular Queue Size");
		int n = scan.nextInt();
		Circular_Queue cq = new Circular_Queue(n);
		while(true) {
			System.out.println("Press : 1 ---------> Insert");
			System.out.println("Press : 2 ---------> Delete");
			System.out.println("Press : 3 ---------> Display");
			System.out.println("Press any other number to exit");
			System.out.println("Enter your Choice");
			int choice = scan.nextInt();
			switch(choice) {
			case 1 : cq.insert();
					 break;
					 
			case 2 : cq.delete();
					 break;
					 
			case 3 : cq.display();
					 break;
					 
			default : System.exit(0);
			}
		}
	}
}
class Circular_Queue{
	private Scanner scan =new Scanner(System.in);
	private int[] CQ;
	private int size;
	private int r=-1;
	private int f=0;
	private int count=0;
	public Circular_Queue(int n) {
		CQ =new int[n];
		size = CQ.length;
	}
	public void insert() {
		int elem;
		if(count==size) {
			System.out.println("Insertion not Possible");
		}
		else {
			System.out.println("Enter the Element");
			elem=scan.nextInt();
			r=(r+1)%size;
			CQ[r]=elem;
			count++;
		}
	}
	public void delete() {
		if(count==0) {
			System.out.println("Deletion not Possible");
		}
		else {
			System.out.println("Element deleted is "+CQ[f]);
			f=(f+1)%size;
			count--;
		}
	}
	public void display() {
		int f1=f;
		if(count==0) {
			System.out.println("Circular Queue is empty");
		}
		else {
			for(int i=1; i<=count; i++) {
				System.out.print(CQ[f1]+" ");
				f1=(f1+1)%5;
			}
			System.out.println();			
		}
	}
}