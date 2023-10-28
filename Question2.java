package com.kodnest.practicetest;

import java.util.Scanner;

public class Question2 {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("User please enter a character");
	int a=scan.nextInt();
	if(a>=-99999&&a<=99999) {
		System.out.println("Integer");
	}
	System.out.println("end");
	}
}
