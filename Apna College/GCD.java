package com.apnacollege;

import java.util.Scanner;

public class GCD {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int a = scan.nextInt();
		int b = scan.nextInt();
		while(a!=b) {
			if(a>b) {
				a=a-b;
			}
			else {
				b=b-a;
			}
		}
		System.out.println("GCD = "+a);
	}
}
