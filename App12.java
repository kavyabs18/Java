package com.kodnest.methods1;

import java.util.Scanner;

public class App12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("User! please enter the height in inches");
		double inches = scan.nextDouble();
		
		Question12 q12 = new Question12();
		double result = q12.convertInchesToFeet(inches);
		
		System.out.println("The height in feet is "+result);
	}
}
