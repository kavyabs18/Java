package com.kodnest.constructor;

import java.util.Scanner;

public class factorial {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("User please enter a number");
	int n = scan.nextInt();
	int result = fact(n);
	System.out.println("Factorial is "+result);
}
public static int fact(int n) {
	if(n==0) {
		return 1;
	}
	else{
		return (n*fact(n-1));
	}
}
}
