package com.kodnest.constructor;

import java.util.Scanner;
public class tables {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("User please enter the number");
	int n = scan.nextInt();
	System.out.println("The multiplication table of "+n);
	int i=1;
	tables(n,i);
	scan.close();
}
public static int tables(int n, int i) {
	if(i==11) {
		return 1;
	}
	else {
		System.out.println(n+" x "+i+" = "+(i*n));		
		return tables (n,i+1);
	}
}
}
