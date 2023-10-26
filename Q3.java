package com.kodnest.w3resource;

import java.util.Scanner;

public class Q3 {
/* 3. Write a Java program to divide two numbers and print them on the screen.
Test Data :
50/3
Expected Output :
16*/
	public static void main(String[] args) {
		System.out.println("Enter 2 digits");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println(a/b);
	}
}
