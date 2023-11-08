package com.kodnest.methods1;

import java.util.Scanner;

public class App9 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("User! please enter the number has to cube");
		int num = scan.nextInt();
		
		Question9 q9= new Question9();
		int result = q9.cubeNumber(num);
		System.out.println("The cube of given number is "+result);
	}
}
