package com.kodnest.methods1;

import java.util.Scanner;

public class App17 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("User! please enter the side length integer");
		int sideLength = scan.nextInt();
		System.out.println("User! please enter the side length in double");
		double sideLength1 = scan.nextDouble();
		
		Question17 q17 = new Question17();
		int result = q17.calculatePlotArea(sideLength);
		double result1 = q17.calculatePlotArea(sideLength1);
		
		System.out.println("calculate plot area is "+result);
		System.out.println("calculate plot area is "+result1);
	}
}
