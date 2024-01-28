package com.kodnest.w3resource;

import java.util.Scanner;

public class Q21 {
public static void main(String[] args) {
	/*Write a Java program to convert a decimal number to an octal number.
Input Data:
Input a Decimal Number: 15
Expected Output

Octal number is: 17 */
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the decimal number");
	int a= scan.nextInt();
	int n[] = new int[20];
	int i=0;
	while(a!=0) {
		n[i]=a%8;
		a=a/8;
		i++;
	}
	for (int j=i-1; j>=0; j--) {
		System.out.print(n[j]);
	}
}
}
