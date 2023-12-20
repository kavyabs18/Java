package com.kodnest.exception_handling;

import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the amount for withdrawl");
		int amount = scan.nextInt();
		try {
			withdraw(amount);
		} catch (MyException e) {
//			e.printStackTrace();
			System.out.println(e);
		}
	}

	static void withdraw(int amount) throws MyException {
		int balance = 10000;
		if(amount>balance) {
			throw new MyException();
		}
	}
}
