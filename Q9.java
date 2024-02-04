package com.kodnest.datatypes;

import java.util.Scanner;

public class Q9 {
public static void main(String[] args) {
	/*Write a Java program that accepts two integers from the user and prints the sum, the difference, the product, the average, the distance (the difference between the integers), the maximum (the largest of the two integers), and the minimum (the smallest of the two integers).

Test Data
Input 1st integer: 25
Input 2nd integer: 5
Expected Output :
Sum of two integers: 30
Difference of two integers: 20
Product of two integers: 125
Average of two integers: 15.00
Distance of two integers: 20
Max integer: 25
Min integer: 5*/
	Scanner scan = new Scanner(System.in);
	System.out.println("Input 1st integer: ");
	int a = scan.nextInt();
	System.out.println("Input 2nd integer: ");
	int b = scan.nextInt();
	System.out.println("Sum of two integers: "+(a+b));
	System.out.println("Difference of two integers: "+(a-b));
	System.out.println("Product of two integers: "+(a*b));
	System.out.println("Average of two integers: "+((a+b)/2));
	System.out.println("Distance of two integers: "+(a-b));
	if(a>b) {
		System.out.println("Max integer: "+a);
		System.out.println("Min integer: "+b);
	}else {
		System.out.println("Min integer: "+b);
		System.out.println("Max integer: "+a);
	}
}
}
