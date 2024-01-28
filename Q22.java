package com.kodnest.w3resource;

import java.util.Scanner;

public class Q22 {
public static void main(String[] args) {
	/* Write a Java program to convert a binary number to a decimal number.
Input Data:
Input a binary number: 100
Expected Output

Decimal Number: 4 */
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter the binary number");
	int a= scan.nextInt();
	int sum=0;
	int i=0;
	while(a!=0) {
		sum=(int) (sum+Math.pow(2, i)*(a%10));
		a=a/10;
		i++;
	}
	System.out.println(sum);
}
}
