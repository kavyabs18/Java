package com.kodnest.w3resource;

import java.util.Scanner;

public class Q18 {
public static void main(String[] args) {
	/*Write a Java program to multiply two binary numbers.
Input Data:
Input the first binary number: 10
Input the second binary number: 11
Expected Output

Product of two binary numbers: 110*/
	long bin1, bin2;
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter 1st binary input");
	bin1 = scan.nextLong();
	System.out.println("Enter 2nd binary input");
	bin2 = scan.nextLong();
	int n = (int) (bin1*bin2);
	System.out.println(n);
}
}
