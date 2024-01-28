package com.kodnest.w3resource;

import java.util.Scanner;

public class Q26 {
public static void main(String[] args) {
	/*Write a Java program to convert a octal number to a binary number.
Input Data:
Input any octal number: 7
Expected Output

Equivalent binary number: 111*/
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
	System.out.println("In Decimal: "+sum);
	i=0;
	int add[] = new int[20];
	while(sum!=0) {
		add[i]=sum%2;
		i++;
		sum=sum/2;
	}
	System.out.println("In Binary: ");
	for(int j=i-1; j>=0; j--) {
		System.out.print(add[j]);
	}
}
}
