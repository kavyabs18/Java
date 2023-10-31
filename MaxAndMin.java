package com.kodnest.array;

import java.util.Scanner;

public class MaxAndMin {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	// size of an Array
	System.out.println("Enter size of an Array");
	int size = scan.nextByte();
	
	// create an Array
	byte a[] = new byte[size];
	
	// read elements into the Array
	System.out.println("Enter elements of an Array");
	for(int i=0; i<a.length; i++) {
		a[i] = scan.nextByte();
	}
	
	//write elements from the Array
	System.out.println("The elements are");
	for(int i=0; i<a.length; i++) {
		System.out.println(a[i]);
	}
	
	//find the maximum element of an Array
	
	//assuming first element of an Array as max value
	byte max = a[0];
	
	for(int i=0; i<a.length; i++) {
		if(max<a[i]) {
			//reassumption of max value
			max = a[i];
		}
	}
	
	System.out.println("The maximum element is : "+max);
	
	//find the minimum element of an Array
	
	//assuming first element of an Array as min value
	byte min = a[0];
	
	for(int i=0; i<a.length; i++) {
		if(min>a[i]) {
			//reassumption of min value
			min = a[i];
		}
	}
	
	System.out.println("The minimum element is : "+min);
}
}
