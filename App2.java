package com.kodnest.methods1;

import java.util.Scanner;

public class App2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("User please enter an integer-1");
		int num1 = scan.nextInt();
		System.out.println("User please enter an integer-2");
		int num2 = scan.nextInt();
		
		Question2 q2 = new Question2();
		int result1 = q2.subtractionNumbers(num1, num2);
		int result2 = q2.multiplyNumbers(num1, num2);
		double result3 = q2.divideNumbers(num1, num2);
		int result4 = q2.findRemainder(num1, num2);
		
		System.out.println("The result of subtracting num2 from num1 is = "+result1);
		System.out.println("The result of multiplying num1 and num2 is = "+result2);
		System.out.println("The result of dividing num1 by num 2 is = "+result3);
		System.out.println("The remainder when num1 is divided by num2 is = "+result4);
	}
}
