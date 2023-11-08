package com.kodnest.methods1;

import java.util.Scanner;

public class App8 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("User! please enter the number to square");
		int num = scan.nextInt();
		
		Question8 q8 = new Question8();
		int result = q8.squareNumber(num);
		
		System.out.println("The square of the given number is "+result);
	}
}