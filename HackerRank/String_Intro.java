package com.kodnest.hackerrank;

import java.util.Scanner;

public class String_Intro {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String1");
		String A = sc.next();
		System.out.println("Enter String2");
		String B = sc.next();
		System.out.println("Length of both Strings is "+(A.length() + B.length()));
		if (A.compareTo(B) > 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		System.out.println((A.charAt(0) + "").toUpperCase() + A.substring(1) + " " + (B.charAt(0) + "").toUpperCase()
				+ B.substring(1));
		/* Enter your code here. Print output to STDOUT. */

	}
}
