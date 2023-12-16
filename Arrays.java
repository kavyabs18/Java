package com.kodnest.data_structures;

import java.util.Scanner;

public class Arrays {
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
