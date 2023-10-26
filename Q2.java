package com.kodnest.w3resource;
import java.util.Scanner;
public class Q2 {
/* 2. Write a Java program to print the sum of two numbers.
Test Data:
74 + 36
Expected Output :
110*/
	public static void main(String[] args) {
		System.out.println("Enter 2 digits");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println(a+b);
	}
}
