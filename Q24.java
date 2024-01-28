package com.kodnest.w3resource;

import java.util.Scanner;

public class Q24 {
public static void main(String[] args) {
	/*Write a Java program to convert a binary number to an octal number.
Input Data:
Input a Binary Number: 111
Expected Output

Octal number: 7 */
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the binary number");
	int a = scan.nextInt();
	int i=0;
	int sum=0;
	while(a!=0) {
		sum=(int) (sum+Math.pow(2, i)*(a%10));
		a=a/10;
		i++;
	}
	System.out.println("In Decimal: "+sum);
	i=0;
	int n[] = new int[20];
	while(sum!=0) {
		n[i] = sum%8;
		sum=sum/8;
		i++;
	}
	System.out.print("In Octal: ");
	for(int j=i-1; j>=0; j--) {
		System.out.print(n[j]);
	}
}
}
