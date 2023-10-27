package com.kodnest.w3resource;

import java.util.Scanner;

public class Q13 {
/*Write a Java program to print the area and perimeter of a rectangle.
Test Data:
Width = 5.6 Height = 8.5


Expected Output
Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("User please enter the width and height of the rectangle");
		float w = scan.nextFloat();
		float h = scan.nextFloat();
		float a = w*h;
		float p = 2*(w+h);
		System.out.printf("Area is "+w+" * "+h+" = "+"%.2f",a);
		System.out.println();
		System.out.printf("Perimeter is "+2+" * ("+w+" + "+h+") = "+"%.2f",p);
	}
}
