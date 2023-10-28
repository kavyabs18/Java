package com.kodnest.practicetest;
import java.util.Scanner;
public class Question6 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("User! please enter an integer");
		int a=scan.nextInt();
		if(a%3==0) {
			System.out.println("Divisible by 3");
		}
		else {
			System.out.println("Not-Divisible by 3");
		}
	}
}
