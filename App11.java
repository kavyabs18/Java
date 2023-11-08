package com.kodnest.methods1;

import java.util.Scanner;

public class App11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("User! please enter the radius of the planet");
		double radius = scan.nextDouble();
		
		Question11 q11 = new Question11();
		double result = q11.calculateSurfaceArea(radius);
		
		System.out.println("The surface area is "+ result);
	}
}
