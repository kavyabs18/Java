package com.kodnest.array;

import java.util.Scanner;

public class TwoDArrayForStudents {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	//size of an Array
	System.out.println("User please enter the total number of classes");
	int classes = scan.nextInt();
	System.out.println("User please enter the total number of students");
	int students = scan.nextInt();
	
	//2D Array creation
	int m[][] = new int[classes][students];
	
	//read elements into the Array
	System.out.println("Please enter the Marks of "+students+" Students present in "+classes+" classes");
	for(int i=0; i<m.length; i++) {
		for(int j=0; j<m[i].length; j++) {
			m[i][j] = scan.nextInt();
		}
	}
	
	//write elements from the Array
	System.out.println("The Marks of "+students+" present in "+classes+" are : ");
	for(int i=0; i<m.length; i++) {
		for(int j=0; j<m[i].length; j++) {
			System.out.println(m[i][j]);
		}
	}
}
}
