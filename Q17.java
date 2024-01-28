package com.kodnest.w3resource;

import java.util.Scanner;

public class Q17 {
public static void main(String[] args) {
	/*Write a Java program to add two binary numbers.
	Input Data:
	Input first binary number: 10
	Input second binary number: 11
	Expected Output

	Sum of two binary numbers: 101*/
	long bin1, bin2;
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter 1st binary input");
	bin1 = scan.nextLong();
	System.out.println("Enter 2nd binary input");
	bin2 = scan.nextLong();
	int []a = new int[20];
	int i=0;
	int rem=0;
	while(bin1!=0||bin2!=0) {
		a[i]=(int) ((bin1%10+bin2%10+rem)%2);
		rem=(int) ((bin1%10+bin2%10+rem)/2);
			
		bin1=bin1/10;
		bin2=bin2/10;
		i++;
	}
	if(rem!=0) {
		a[i]=rem;
	}
	for (int j=i; j>=0; j--) {
		System.out.print(a[j]);
	}
}
}
