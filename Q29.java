package com.kodnest.w3resource;

import java.util.Scanner;

public class Q29 {
public static void main(String[] args) {
	/* Write a Java program to convert a hexadecimal number into a binary number.
Input Data:
Enter Hexadecimal Number : 37,		2a5
Expected Output

Equivalent Binary Number is: 110111,		1010100101*/
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the hexadecimal number");
	String s = scan.nextLine();
	s = s.toUpperCase();
	String digits = "0123456789ABCDEF";
	int value = 0;
	for(int i=0; i<s.length(); i++) {
		char c = s.charAt(i);
		int d = digits.indexOf(c);
		value = 16*value+d;
	}
	System.out.println("In Decimal: "+value);
	int a[] = new int[20];
	int i=0;
	while(value!=0) {
		a[i] = value%2;
		value=value/2;
		i++;
	}
	System.out.print("In Binary: ");
	for(int j=i-1; j>=0; j--) {
		System.out.print(a[j]);
	}
}
}
