package com.kodnest.w3resource;

import java.util.Scanner;

public class Q20 {
/* 1. Write a Java program to convert a decimal number to a hexadecimal number.
		Input Data:
		Input a decimal number: 15
		Expected Output

		Hexadecimal number is : F */
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("User please enter the integer : ");
		int n = s.nextInt();
		String a[] = new String [20];
		int i=0;
		int q=0;
		while(n!=0) {
			q = n%16;
			n=n/16;
			String b[] = {"0","0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};
			a[i++] = b[++q];
		}
		for(int j=i-1; j>=0; j--) {
			System.out.print(a[j]);
		}
	}
}
