package com.kodnest.data_structures;

import java.util.Scanner;

public class Array_App {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Arrays array = new Arrays();
			while(true) {			
			System.out.println("User please enter the number to start program");
			System.out.println("=============================");
			System.out.println("1 -  Insertion");
			System.out.println("2 -  Deletion");
			System.out.println("3 -  Display");
			System.out.println("Any other number to stop the program");
			System.out.println("=============================");
			int n = scan.nextInt();
			switch (n) {
			case 1:	array.insert();
					break;
				
			case 2: array.delete();
					break;
				
			case 3: array.display();
					break;
				
			default: return;
			}
		}
	}
}


class Arrays {
	protected Scanner scan = new Scanner(System.in);
	protected int arr[];
	public Arrays(){
		System.out.println("User please enter size of an array");
		int size = scan.nextInt();
		arr = new int[size];
	}
	public void insert() {
		System.out.println("User please enter the position and element");
		int pos = scan.nextInt();
		if(pos>=0 && pos<=(arr.length-1)) {
			int ele = scan.nextInt();
			arr[pos] = ele;
		}
		else {
			System.out.println("User please enter the element position within the array range");
		}
	}
	public void delete() {
		System.out.println("User please enter the position from where to delete the element");
		int pos = scan.nextInt();
		if(pos>=0 && pos<=(arr.length-1)) {
			arr[pos] = 0;
		}
	}
	public void display() {
		System.out.println("The array elements are : ");
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}

