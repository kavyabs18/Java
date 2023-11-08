package com.kodnest.methods1;

import java.util.Scanner;

public class App13 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("User! please enter the Principal amount");
		double principal = scan.nextDouble();
		System.out.println("User please enter the Time");
		double time = scan.nextDouble();
		System.out.println("User please enter the Rate of Intrest");
		double rate = scan.nextDouble();
		
		Question13 q13 = new Question13();
		double result = q13.calculateSimpleInterest(principal,rate,time);
		
		System.out.println("The Simple Intrest is "+result);
	}
}
