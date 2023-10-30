package com.kodnest.loopingpractice;

import java.util.Scanner;

public class GCD { 
	public static void main(String[] args)   
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("User please enter 2 digits");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int gcd = 1;
		for(int i = 1; i <= a && i <= b; i++)
		{
			if(a%i==0 && b%i==0) {
				gcd = i;				
			}
		}
		System.out.printf("GCD of %d and %d is: %d", a, b, gcd);  
	}
}