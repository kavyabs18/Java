package com.kodnest.array;

import java.util.Scanner;

public class RotateArrayForward {
/*1.	I/P  - 2, 3, 4, 5, 6
 		O/P  - 5, 6, 2, 3, 4
  2.	I/P  - 10, 20, 50, 40, 30
  		O/P  - 50, 40, 30, 20, 20*/
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("User enter the size of an Array");
	int size = scan.nextInt();
	int a[] = new int[size];
	int b[] = new int[size];
	System.out.println("Enter rotating value");
	int k = scan.nextInt();
	
	System.out.println("User enter the elements");
	for(int i=0; i<a.length; i++) {
		a[i] = scan.nextInt();
	}
	
	System.out.println("Rotated Array is : ");
	for(int i=0; i<a.length; i++) {
		int j = (i+k)%size;
		b[j] = a[i];
	}
	for(int j=0; j<a.length; j++) {
		System.out.print(b[j]+" ");
		
	}
}
}