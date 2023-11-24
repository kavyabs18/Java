package com.kodnest.w3resource;

import java.util.Scanner;

public class Q34 {
/*Write a Java program to compute hexagon area.
Area of a hexagon = (6 * s^2)/(4*tan(π/6))
where s is the length of a side
Input Data:
Input the length of a side of the hexagon: 6
Expected Output

The area of the hexagon is: 93.53074360871938*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("User please enter the length of a side of the hexagon");
		float s = scan.nextFloat();
		double area = (6*Math.pow(s, 2))/(4*Math.tan(Math.PI/6));
		System.out.println("The area of the hexagon : "+area);
	}
}
