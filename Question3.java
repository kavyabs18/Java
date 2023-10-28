package com.kodnest.practicetest;

import java.util.Scanner;

public class Question3 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("User! please enter an integer");
		int a=scan.nextInt();
		if(a%2==0) {
			System.out.println("even");
		}
		System.out.println("end");
	}
}
