package com.kodnest.array;

import java.util.Scanner;

public class ThreeDArray {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	//Size of an Array
	System.out.println("User please enter the size of an Array");
	int a = scan.nextInt();
	int b = scan.nextInt(); 
	int c = scan.nextInt();
	
	//Creation of an Array
	int m[][][] = new int[a][b][c];
	
	//Read the elements
	System.out.println("User please enter the elements");
	for(int i=0; i<m.length; i++) {
		for(int j=0; j<m[i].length; j++) {
			for(int k=0; k<m[i][j].length; k++) {
				m[i][j][k] = scan.nextInt();
			}
		}
	}
	
	//Display the elements
	System.out.println("The Matrix is : ");
	for(int i=0; i<m.length; i++) {
		for(int j=0; j<m[i].length; j++) {
			for(int k=0; k<m[i][j].length; k++) {
				System.out.print(m[i][j][k] +" ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
}
