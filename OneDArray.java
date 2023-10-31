package com.kodnest.array;

import java.util.Scanner;

public class OneDArray {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	// size of an array
	System.out.println("User! please enter the size of an Array"); // user prompt message
	int size =scan.nextInt();
	
	// create an integer array
	int a[] = new int [size]; 
	System.out.println(a.length+" is the size of the Array");
	
	// read elements into the array
	System.out.println("User! please enter the Marks");
	for(int i=0; i<a.length; i++) {
		a[i] = scan.nextInt(); 
	}
	
	// write elements from the array
	for(int i=0; i<a.length; i++) {
		System.out.println("Marks of Student "+(i+1)+" : "+a[i]); 
	}
}
}
