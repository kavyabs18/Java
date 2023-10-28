package com.kodnest.practicetest;

import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("User please enter a character");
		char a=scan.next().charAt(0);
		if (a>='A'&&a<='Z') {
			System.out.println("Upper case");
		}
		else {
			System.out.println("end");
		}
	}
}
