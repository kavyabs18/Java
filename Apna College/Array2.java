package com.apnacollege;

import java.util.Scanner;

public class Array2 {
	public static void main(String[] args) {
//		Print the spiral order matrix as output for a given matrix of numbers. 
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		System.out.println("Number of Rows");
		int m = scan.nextInt();
		System.out.println("Number of Columns");
		int n = scan.nextInt();
		int a[][] = new int[m][n];
		System.out.println("Enter the elements");
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				a[i][j] = scan.nextInt();
			}
		}
		
		int row_start = 0;
		int row_end = m-1;
		int col_start = 0;
		int col_end = n-1;
		
		while(row_start<=row_end && col_start<=col_end) {
			for(int col =col_start; col<=col_end; col++) {
				System.out.print(a[row_start][col]+" ");
			}
			row_start++;
			
			for(int row=row_start; row<=row_end; row++) {
				System.out.print(a[row][col_end]+" ");
			}
			col_end--;
			
			for(int col=col_end; col>=col_start; col--) {
				System.out.print(a[row_end][col]+" ");
			}
			row_end--;
			
			for(int row=row_end; row>=row_start; row--) {
				System.out.print(a[row][col_start]+" ");
			}
			col_start++;
		}
	}
}
