package com.kodnest.array;

import java.util.Scanner;

public class MergeArray {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	//Size of an Array
	System.out.println("User please enter the size of Array - 1");
	int x = scan.nextInt();
	System.out.println("User please enter the size of Array - 2");
	int y = scan.nextInt();
	
	//Creation of 3 Arrays
	int a[] = new int[x];
	int b[] = new int[y];
	int c[] = new int[(x+y)];
	
	//Read elements into an Array
	System.out.println("User please enter the elements of Array - 1");
	for(int i=0; i<a.length; i++) {
		a[i] = scan.nextInt();
	}
	System.out.println("User please enter the elements of Array - 2");
	for(int i=0; i<b.length; i++) {
		b[i] = scan.nextInt();
	}
	
	//Merge the Arrays
	for(int i=0; i<c.length; i++) {
		if(i<a.length) {
			c[i] = a[i];			
		}
		else {
			c[i] = b[i-a.length];
		}
	}
	
	//Display the Elements
	System.out.println("The Merged elemnets are : ");
	for(int i=0; i<c.length; i++) {
		System.out.println(c[i]);
	}
}
}
