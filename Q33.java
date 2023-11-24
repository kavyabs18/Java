package com.kodnest.w3resource;

import java.util.Scanner;

public class Q33 {
/*Write a Java program and compute the sum of an integer's digits.
Input Data:
Input an integer: 25
Expected Output

The sum of the digits is: 7*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("User please enter an integer value");
		int n = scan.nextInt();
		int sum=0;
		for(int i=n; i>0; i--) {
			int r = n%10;
			sum = sum+r;
			n = n/10;
		}
		System.out.println(sum);
	}
}
