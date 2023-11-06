package com.kodnest.array;

import java.util.Scanner;

public class RotateArrayBackward {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("User enter the size of an Array");
	int size = scan.nextInt();
	int a[] = new int[size];
	System.out.println("Enter rotating value");
	int k = scan.nextInt();
	
	System.out.println("User enter the elements");
	for(int i=0; i<a.length; i++) {
		a[i] = scan.nextInt();
	}
	
	System.out.println("Rotated Array is : ");
	for(int i=0; i<a.length; i++) {
		int j = (i+k)%size;
		System.out.print(a[j]+" ");	
	}
}
}
