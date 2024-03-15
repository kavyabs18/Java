package com.kodnest.hackerrank;

import java.util.Scanner;

public class Static_Initialize_Block {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Breadth of Rectangle");
		int i = sc.nextInt();
		System.out.println("Enter Height of Rectangle");
		int j = sc.nextInt();
		if (i > 0 && j > 0) {
			System.out.println(i * j);
		} else {
			Exception e = new Exception();
			System.out.println(e + ": Breadth and height must be positive");
		}
	}
}
