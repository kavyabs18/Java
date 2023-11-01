package com.kodnest.array;

import java.util.Scanner;

public class RowsIntoColumns {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	//size of an Array
	System.out.println("User please enter number of Rows in the Matrix");
	int row = scan.nextInt();
	System.out.println("User please enter number  of Columns in the Matrix");
	int col = scan.nextInt();
	
	//creation of an Array
	int a[][] = new int[row][col];
	
	//read the elements
	System.out.println("User please enter the values");
	for(int i=0; i<a.length; i++) {
		for(int j=0; j<a[i].length; j++) {
			a[i][j] = scan.nextInt();
		}
	}
	
	//display the elements
	System.out.println("The Matrix is : ");
	for(int i=0; i<a.length; i++) {
		for(int j=0; j<a[i].length; j++) {
			System.out.print(a[j][i]+" ");
		}
		System.out.println();
	}
}
}
