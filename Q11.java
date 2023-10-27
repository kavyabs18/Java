package com.kodnest.w3resource;

import java.util.Scanner;

public class Q11 {
/*Write a Java program to print the area and perimeter of a circle.
Test Data:
Radius = 7.5
Expected Output
Perimeter is = 47.12388980384689
Area is = 176.71458676442586*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("User please enter the radius of a circle");
		float r = scan.nextFloat();
		System.out.println("Perimeter is = "+(2*Math.PI*r));
		System.out.println("Area is = "+(Math.PI*Math.pow(r, 2)));
	}
}
