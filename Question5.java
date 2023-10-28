package com.kodnest.practicetest;

import java.util.Scanner;

public class Question5 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("User please enter the input");
		char a=scan.next().charAt(0);
		if (a=='M'||a=='m') {
			System.out.println("Male");
		}
		if (a=='F'||a=='f') {
			System.out.println("Female");
		}
		System.out.println("end");
	}
}
