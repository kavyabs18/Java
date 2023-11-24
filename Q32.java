package com.kodnest.w3resource;

import java.util.Scanner;

public class Q32 {
/*Write a Java program to compare two numbers.
Input Data:
Input first integer: 25
Input second integer: 39
Expected Output

25 != 39                                                                          
25 < 39                                                                           
25 <= 39*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("User please enter 2 integer values");
		int a = scan.nextInt();
		int b = scan.nextInt();
		if(a==b)
			System.out.println(a+" == "+b);
		if(a!=b)
			System.out.println(a+" != "+b);
		if(a<b)
			System.out.println(a+" < "+b);
		if(a<=b)
			System.out.println(a+" <= "+b);
		if(a>b)
			System.out.println(a+" > "+b);
		if(a>=b)
			System.out.println(a+" >= "+b);
	}
}
