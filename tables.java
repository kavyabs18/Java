package com.kodnest.constructor;

import java.util.Scanner;
public class tables {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("User please enter the number");
	int n = scan.nextInt();
	System.out.println("The multiplication table of "+n);
	int result = tables(n);
	scan.close();
}
public static int tables(int n) {
	if(n==0) {
		return 1;
	}
	else {
		for(int i=1; i<=10; i++) {
			System.out.println(n+" x "+i+" = "+(i*n));
		}
		n=0;
		return tables(n);
	}
}
}
