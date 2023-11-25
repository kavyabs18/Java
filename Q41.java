package com.kodnest.w3resource;

import java.util.Scanner;

public class Q41 {
/*Write a Java program to print the ASCII value of a given character.
Expected Output

The ASCII value of Z is :90*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("User please enter a character");
		char ch = scan.next().charAt(0);
		System.out.println((int)ch);
		
	}
}
