package com.kodnest.methods1;

import java.util.Scanner;

public class App15 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("User please enter the number");
		double num = scan.nextDouble();
		
		Question15 q15 = new Question15();
		double result = q15.halveTheNumber(num);
		
		System.out.println("The result is "+result);
	}
}
