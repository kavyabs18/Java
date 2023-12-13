package com.kodnest.w3resource;

import java.util.Scanner;

public class Q117 {
/* Q117 Write a Java program to compute the square root of a given number.
Input a positive integer: 25
Square root of 25 is: 5 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("User please enter an integer");
		int n = scan.nextInt();
		System.out.println((int)Math.sqrt(n));
	}
}
