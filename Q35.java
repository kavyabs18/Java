package com.kodnest.w3resource;

import java.util.Scanner;

public class Q35 {
/*Write a Java program to compute the area of a polygon.
Area of a polygon = (n*s^2)/(4*tan(π/n))
where n is n-sided polygon and s is the length of a side
Input Data:
Input the number of sides on the polygon: 7
Input the length of one of the sides: 6
Expected Output

The area is: 130.82084798405722*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("User please enter the number of sides on a polygon");
		int n = scan.nextInt();
		System.out.println("USer please enter the length of of a side");
		float s = scan.nextFloat();
		double area = (n*Math.pow(s, 2))/(4*Math.tan(Math.PI/n));
		System.out.println("The area is : "+area);
	}
}
