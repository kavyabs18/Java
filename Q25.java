package com.kodnest.w3resource;

import java.util.Scanner;

public class Q25 {
public static void main(String[] args) {
	/* Write a Java program to convert a octal number to a decimal number.
Input Data:
Input any octal number: 10
Expected Output

Equivalent decimal number: 8*/
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the octal number");
	int a = scan.nextInt();
	int i=0;
	int sum=0;
	while(a!=0) {
		sum=(int) (sum+Math.pow(8, i)*(a%10));
		a=a/10;
		i++;
	}
	System.out.println(sum);
}
}
