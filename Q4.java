package com.kodnest.datatypes;

import java.util.Scanner;

public class Q4 {
public static void main(String[] args) {
	/* Write a Java program to convert minutes into years and days.

Test Data
Input the number of minutes: 3456789
Expected Output :
3456789 minutes is approximately 6 years and 210 days*/
	Scanner scan = new Scanner(System.in);
	System.out.println("Input the number of minutes: ");
	int min = scan.nextInt();
	int years = min/(60*24*365);
	int days = min/(60*24)%365;
	System.out.println(min+" minutes is approximately "+years+" years and "+days+" days");
}
}
