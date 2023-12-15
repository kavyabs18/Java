package com.kodnest.demo_exception;

import java.util.Scanner;

public class Input_Mismatch_Exception {
public static void main(String[] args) {
	System.out.println("Bank app started");
	int oripin = 5678;
	int balance = 15000;
	System.out.println("User enter the PIN");
	int pin=0;
	Scanner scan = new Scanner(System.in);
	try {
		pin = scan.nextInt();
		if(pin == oripin) {
			System.out.println("Balance : "+balance);
		}
	}
	catch(Exception e) {
		System.out.println("Please enter valid numbers only");
	}
	finally {
		scan.close();
		System.out.println("Bank app terminated");		
	}
}
}
