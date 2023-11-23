package com.kodnest.controlconstructs;

import java.util.Scanner;

public class MathCalculation {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("User please enter the number");
	int n = scan.nextInt();
	tables(n);
	int result = factorial(n);
	System.out.println("The factorial of "+n+" is "+result);
	scan.close();
}
public static void tables(int n) {
	System.out.println("The multiplication table of "+n);
	for(int i=1; i<=10; i++) {
		System.out.println(n+" x "+i+" = "+(i*n));
	}	
}
static int factorial(int n) {
	int prod=1;
	for(int i=n; i>=1; i--) {
		prod = prod*i;
	}
	return prod;
}
}
