package com.kodnest.w3resource;

import java.util.Scanner;

public class Q63 {
/*Write a Java program that accepts two integer values from the user and returns the 
 largest value. However if the two values are the same, return 0 and find the smallest 
 value if the two values have the same remainder when divided by 6.
Sample Output:

Input the first number : 12                                            
Input the second number: 13                                            
Result: 13*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("User please enter first integer");
		int a = scan.nextInt();
		System.out.println("User please enter second integer");
		int b = scan.nextInt();
		int result = largest(a,b);
		System.out.println(result);
		
	}
	public static int largest(int a, int b) {
		if(a==b) {
			return 0;
		}
		else if(a%6==b%6){
			if(a<b) {
				return a;
			}
			else {
				return b;
			}
			
		}
		else if(a>b){
			return a;
		}
		else {
			return b;
		}
	}
}
