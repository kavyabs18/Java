package com.kodnest.array;

import java.util.Scanner;

public class LinearSearch {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	//size of an Array
	System.out.println("User please enter the size of an Array");
	int size = scan.nextInt();
	
	//creation of an Array
	int a[] = new int[size];
	
	//read the elements
	System.out.println("User please enter the elements");
	for(int i=0; i<a.length; i++) {
		a[i] = scan.nextInt();
	}

	//Search element
	System.out.println("Enter the element to search");
	int find = scan.nextInt();
	boolean ispresent = false;
	for(int i=0; i<a.length; i++) {
		if(a[i]==find) {
			ispresent = true;
			break;
		}
	}
	if(ispresent ==true) {
		System.out.println("Present");
	}
	else {
		System.out.println("Not Present");
	}
}
}
