package com.kodnest.w3resource;

import java.util.Scanner;

public class Q49 {
/* Write a Java program to accept a number and check whether the number is even or not. Prints 1 if the number is even or 0 if odd.
Sample Output:

Input a number: 20                                                     
1*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("User please enter an integer");
		int n = scan.nextInt();
		if(n%2==0) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
	}
}
