package com.kodnest.datatypes;

import java.util.Scanner;

public class Q3 {
public static void main(String[] args) {
	/*Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer.

Test Data
Input an integer between 0 and 1000: 565
Expected Output :
The sum of all digits in 565 is 16*/
	Scanner scan = new Scanner(System.in);
	System.out.println("Input an integer between 0 and 1000: ");
	int n = scan.nextInt();
	int a = n;
	int sum = 0;
	while(n!=0) {
		sum = sum+n%10;
		n = n/10;
	}
	System.out.println("The sum of all digits in "+a+" is "+sum);
}
}
