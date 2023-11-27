package com.kodnest.w3resource;

import java.util.Scanner;

public class Q52 {
/*Write a Java program to calculate the sum of two integers and return true if the sum is equal to a third integer.
Sample Output:

Input the first number : 5                                             
Input the second number: 10                                            
Input the third number : 15                                            
The result is: true*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("User please enter an integer value-1");
		int a = scan.nextInt();
		System.out.println("User please enter an integer value-2");
		int b = scan.nextInt();
		System.out.println("User please enter an integer value-3");
		int c = scan.nextInt();
		if(a+b==c) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}
}
