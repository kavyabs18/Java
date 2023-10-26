package com.kodnest.w3resource;

import java.util.Scanner;

public class Q6 {
/* 6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 digits");
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println(a+" + "+b+" = "+(a+b));
		System.out.println(a+" - "+b+" = "+(a-b));
		System.out.println(a+" x "+b+" = "+(a*b));
		System.out.println(a+" / "+b+" = "+(a/b));
		System.out.println(a+" % "+b+" = "+(a%b));
	}
}
