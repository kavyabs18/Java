package com.kodnest.w3resource;

import java.util.Scanner;

public class Q51 {
/* Write a Java program to convert a string to an integer.
Sample Output:

Input a number(string): 25                                             
The integer value is: 25*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("User please enter an integer");
		String s = scan.next();
		int a = Integer.parseInt(s);
		System.out.println(a);
	}
}
