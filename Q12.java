package com.kodnest.w3resource;

import java.util.Scanner;

public class Q12 {
/* Write a Java program that takes three numbers as input to calculate and print the average of the numbers.*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("User please enter the 3 numbers");
		float num1 = scan.nextFloat();
		float num2 = scan.nextFloat();
		float num3 = scan.nextFloat();
		System.out.println("Average = "+(num1+num2+num3)/3);
	}
}
