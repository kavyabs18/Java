package com.kodnest.practicetest;

import java.util.Scanner;

public class Question4 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("User! please enter an integer");
		int a=scan.nextInt();
		if(a%2==0&&a%3==0&&a%4==0) {
			System.out.println("Divisible by 2, 3 and 4");
		}
		System.out.println("end");
	}
}
