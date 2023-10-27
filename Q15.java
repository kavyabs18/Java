package com.kodnest.w3resource;

import java.util.Scanner;

public class Q15 {
/*Write a Java program to swap two variables.*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("User please enter 2 numbers");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("num1 = "+num1);
		System.out.println("num2 = "+num2);
	}
}
