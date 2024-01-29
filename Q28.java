package com.kodnest.w3resource;

import java.util.Scanner;

public class Q28 {
public static void main(String[] args) {
	/*Write a Java program to convert a hexadecimal value into a decimal number.
Input Data:
Input a hexadecimal number: 25,		2a5
Expected Output

Equivalent decimal number is: 37,		677*/
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the hexadecimal number");
	String s = scan.nextLine();
	String digits = "0123456789ABCDEF";
	s = s.toUpperCase();
	int value=0;
	for(int i=0; i<s.length(); i++) {
		char c = s.charAt(i);
		int d = digits.indexOf(c);
		value = 16*value+d;
	}
	System.out.println(value);
}
}
