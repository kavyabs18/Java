package com.kodnest.w3resource;

import java.util.Scanner;

public class Q153 {
public static void main(String[] args) {
	/* Write a Java program that accepts two double variables and test if both strictly between 0 and 1 and false otherwise.

Sample Output:
Input first number: 5
Input second number: 1
false*/
	Scanner scan = new Scanner(System.in);
	System.out.println("Input first number: ");
	double a = scan.nextDouble();
	System.out.println("Input second number: ");
	double b = scan.nextDouble();
	if(a>=0&&a<=0&&b>=0&&b<=0) {
		System.out.println("True");
	}
	else {
		System.out.println("False");
	}
}
}
