package com.kodnest.array;

import java.util.Scanner;

public class TwoDArray {

public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	// size of an array
	System.out.println("User! please enter the row value of an Array"); // user prompt message
	int row =scan.nextInt();
	System.out.println("User! please enter the column value of an Array"); // user prompt message
	int column =scan.nextInt();
	
	// create an integer array
	int a[][] = new int [row][column]; 
	
	// read elements into the array
	System.out.println("User! please enter the elments");
	for(int i=0; i<row; i++) {
		for(int j=0; j<column; j++) {
			a[i][j] = scan.nextInt(); 
		}
	}
	
	// write elements from the array
	System.out.println("The elements of Array 1 are : ");
	for(int i=0; i<row; i++) {
		for(int j=0; j<column; j++) {
			System.out.println(a[i][j]); 			
		}
	}
}
}
