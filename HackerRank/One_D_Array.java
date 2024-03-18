package com.kodnest.hackerrank;

import java.util.Scanner;

public class One_D_Array {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size of an Array");
		int n = scan.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the Elements");
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		scan.close();

		// Prints each sequential element in array a
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}