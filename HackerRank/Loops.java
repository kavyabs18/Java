package com.kodnest.hackerrank;

import java.util.Scanner;

public class Loops {
//	2
//	0 2 10
//	5 3 5
	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		System.out.println("Series : (a+2^0*b),(a+2^0*b+2^1*b),.....,(a+2^0*b+2^1*b+...+2^(n-1)*b)");
		System.out.println("Enter number of inputs");
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			System.out.print("a : ");
			int a = in.nextInt();
			System.out.print("b : ");
			int b = in.nextInt();
			System.out.print("n : ");
			int n = in.nextInt();
			int sum = a;
			for (int j = 0; j < n; j++) {
				sum = sum + (int) Math.pow(2, j) * b;
				System.out.print(sum + " ");
			}
			System.out.println();
		}
		in.close();
	}
}