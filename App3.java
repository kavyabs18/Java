package com.kodnest.methods1;

import java.util.Scanner;

class App3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("User please enter an integer value");
		int num=scan.nextInt();
		
		Question3 q3 = new Question3();
		q3.doubleTheNumber(num);
	}
}
