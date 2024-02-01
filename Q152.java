package com.kodnest.w3resource;

import java.util.Scanner;

public class Q152 {
public static void main(String[] args) {
	/*Write a Java program that accepts four integers from the user and prints equal if all four are equal, and not equal otherwise.

Sample Output:
Input first number: 25
Input second number: 37
Input third number: 45
Input fourth number: 23
Numbers are not equal!*/
	Scanner scan = new Scanner(System.in);
	System.out.println("Input first number: ");
	int a = scan.nextInt();
	System.out.println("Input second number: ");
	int b = scan.nextInt();
	System.out.println("Input third number: ");
	int c = scan.nextInt();
	System.out.println("Input fourth number: ");
	int d = scan.nextInt();
	if(a==b&&a==c&&a==d) {
		System.out.println("Numbers are equal");
	}
	else {
		System.out.println("Numbers are not equal!");
	}
}
}
