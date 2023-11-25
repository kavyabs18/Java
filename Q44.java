package com.kodnest.w3resource;

import java.util.Scanner;

public class Q44 {
/*Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn.
Sample Output:

Input number: 5                                                        
5 + 55  + 555*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("User please enter an integer");
		int n = scan.nextInt();
		System.out.println(n+" + "+n+n+" + "+n+n+n);
	}
}
