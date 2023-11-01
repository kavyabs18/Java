package com.kodnest.array;

import java.util.Scanner;

public class TotalMarks {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	//size of an Array
	System.out.println("User please enter number of students");
	int size = scan.nextInt();
	
	//creation of an Array
	int a[] = new int[size];
	
	//read the elements into the Array
	System.out.println("User enter the marks of "+size+" Students");
	for(int i=0; i<a.length; i++) {
		a[i] = scan.nextInt();
	}
	
	//calculate Total Marks
	int sum = 0;
	for(int i=0; i<a.length; i++) {
		sum = sum+a[i];
	}
	System.out.println("Total Marks of "+size+" Students is : "+sum);
}
}
