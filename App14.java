package com.kodnest.methods1;

import java.util.Scanner;

public class App14 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("User! please enter time in minutes ");
		int minutes = scan.nextInt();
		
		Question14 q14 = new Question14();
		double result = q14.convertToHours(minutes);
		
		System.out.println("The time in hours is "+result);
	}
}
