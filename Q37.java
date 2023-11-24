package com.kodnest.w3resource;

import java.util.Scanner;

public class Q37 {
/*Write a Java program to reverse a string.
Input Data:
Input a string: The quick brown fox
Expected Output

Reverse string: xof nworb kciuq ehT*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("User please enter a string");
		char[] s = scan.nextLine().toCharArray();
		for(int i=s.length-1; i>=0; i--) {
			System.out.print(s[i]);
		}
	}
}
