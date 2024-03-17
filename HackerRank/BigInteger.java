package com.kodnest.hackerrank;

import java.util.Scanner;

public class BigInteger {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers with spaces");
		java.math.BigInteger a = new java.math.BigInteger(sc.next());
		java.math.BigInteger b = new java.math.BigInteger(sc.next());
		sc.close();
		System.out.println("Sum : "+a.add(b));
		System.out.println("Product : "+a.multiply(b));
	}
}
