package com.kodnest.w3resource;

import java.util.Scanner;

public class Q5 {
/* 5. Write a Java program that takes two numbers as input and displays the product of two numbers.
Test Data:
Input first number: 25
Input second number: 5
Expected Output :
25 x 5 = 125*/
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 2 digits");
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println(a*b);
	}
}
