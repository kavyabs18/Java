package com.kodnest.methods1;

import java.util.Scanner;

public class App16 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("USer! please enter en integer");
		int throttleSetting = scan.nextInt();
		
		Question16 q16 = new Question16();
		double result = q16.calculateThrust(throttleSetting);
		
		System.out.println("The e result of raising the throttleSetting to the fifth power, \r\n"
				+ "representing the spacecraft's thrust is "+result);
	}
}
