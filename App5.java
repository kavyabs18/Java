package com.kodnest.methods1;

import java.util.Scanner;

public class App5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("User! please enter the speed of the vehical in km/h");
		double speed = scan.nextDouble();
		System.out.println("User! please enter the time travelled in hours");
		double time = scan.nextDouble();
		
		Question5 q5 = new Question5();
		double result = q5.calculateDistance(speed, time);
		
		System.out.println("The distance travelled is "+result);
	}
}
