package com.kodnest.hackerrank;

import java.util.Scanner;

public class StdIn_and_StdOut {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an Integer");
		int i = scan.nextInt();
		System.out.println("Enter a Decimal Number");
		double d = scan.nextDouble();
		System.out.println("Enter the String");
		scan.nextLine();
		String s = scan.nextLine();
		scan.close();
		// Write your code here.

		System.out.println("String: " + s);
		System.out.println("Double: " + d);
		System.out.println("Int: " + i);
	}
}
