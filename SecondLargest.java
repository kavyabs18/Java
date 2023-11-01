package com.kodnest.array;

import java.util.Scanner;

public class SecondLargest {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	//size of an Array
	System.out.println("Enter the size of an Array");
	int size = scan.nextInt();
	
	//create an Array
	int a[] = new int[size];
	
	//read the elements into an Array
	System.out.println("Enter the elements of an Array");
	for(int i=0; i<a.length; i++) {
		a[i] = scan.nextInt();
	}
	
	//write the elements from the array
	System.out.println("The elements are : ");
	for(int i=0; i<a.length; i++) {
		System.out.println(a[i]);
	}
	
	//2nd largest element
	System.out.println("The 2nd largest element is : ");
	int temp=0  ;
	for(int i=0; i<a.length; i++) {
		for(int j=i+1; j<a.length; j++) {
			if(a[i]<a[j]) {
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
	}
	System.out.println(a[1]);
	
}
}
