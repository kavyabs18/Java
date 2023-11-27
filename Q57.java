package com.kodnest.w3resource;

import java.util.Scanner;

public class Q57 {
/* Write a Java program to accept an integer and count the factors of the number.
Sample Output:

Input an integer: 25                                                   
3*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("User please enter an integer value");
		int a = scan.nextInt();
		int count = 0;
		for(int i=1; i<=a; i++) {
			if(a%i==0) {
				count++;
			}
		}
		System.out.println(count);
	}
}
