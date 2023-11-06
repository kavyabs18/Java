package com.kodnest.array;

import java.util.Scanner;

public class SumOfCorrespondingElementsInArrays {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	//size of an Arrays
	System.out.println("User please enter the size of Array 1 and 2");
	int x = scan.nextInt();
	
	//Creation of Arrays
	int a[] = new int[x];
	int b[] = new int[x];
	int c[] = new int[x];
	
	//Read Elements
	System.out.println("User please enter the Elements of Array-1");
	for(int i=0; i<a.length; i++) {
		a[i] = scan.nextInt();
	}
	System.out.println("User please enter the Elements of Array-2");
	for(int i=0; i<b.length; i++) {
		b[i] = scan.nextInt();
	}
	
	//Display the Elements
	System.out.println("The Sum of 2 Array Elements are :");
	for(int i=0; i<c.length; i++) {
		c[i]=a[i]+b[i];
		System.out.print(c[i]+" ");
	}
}
}
