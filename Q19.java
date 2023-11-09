package com.kodnest.w3resource;

import java.util.Scanner;

public class Q19 {
/*Write a Java program to convert an integer number to a binary number.
Input Data:
Input a Decimal Number : 5
Expected Output

Binary number is: 101 */
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("User please enter an integer number : ");
		int n = scan.nextInt();
		int a[] = new int[20];
		int i=0;
		while(n!=0) {
			a[i++] = n%2;				
			n = n/2;
		}
		for(int j = i-1; j>=0;j--) {
			System.out.print(a[j]);			
		}
	}
}
