package com.kodnest.exception_handling;

import java.util.Scanner;

public class Shopnest {
	public static void main(String[] args) {
		shop();
	}
	public static void shop() {
		try {
			pay();
			System.out.println("Thank you for shopping");
		}
		catch(Exception ex) {
			System.out.println("Shopping not completed, try again!");
		}
	}
	public static void pay() {
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Please enter amount: ");
			int amt = scan.nextInt();
			System.out.println("Payment Successful - INR "+amt);
		} catch (Exception ex) {
			System.out.println("Payment not completed!");
			throw ex;
		}
	}
}
