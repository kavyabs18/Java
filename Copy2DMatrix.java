package com.kodnest.array;

import java.util.Scanner;

public class Copy2DMatrix {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	//size of an Array
	System.out.println("User please enter number of Rows in the Matrix");
	int row = scan.nextInt();
	System.out.println("User please enter number  of Columns in the Matrix");
	int col = scan.nextInt();
	
	//creation of an Array
	int a[][] = new int[row][col];
	int b[][] = new int[row][col];
	
	//read the elements
	System.out.println("User please enter the values for Matrix A");
	for(int i=0; i<a.length; i++) {
		for(int j=0; j<a[i].length; j++) {
			a[i][j] = scan.nextInt();
		}
	}
	 
	//copy the elements
	for(int i=0; i<a.length; i++) {
		for(int j=0; j<a[i].length; j++) {
			b[i][j]=a[i][j];
		}
		System.out.println();
	}
	
	//display the elements
	System.out.println("The Matrix B is : ");
	for(int i=0; i<a.length; i++) {
		for(int j=0; j<a[i].length; j++) {
			System.out.print(b[i][j]+" ");
		}
		System.out.println();
	}
}
}
