package com.kodnest.w3resource;

import java.util.Scanner;

class Q83 {
/*Write a Java program to multiply the corresponding elements of two integer arrays.
Sample Output:

Array1: [1, 3, -5, 4]                                                  
                                                                       
Array2: [1, 4, -5, -2]                                                 
                                                                       
Result: 1 12 25 -8*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("User please enter size of array");
		int n = scan.nextInt();
		System.out.println("User please enter array elements");
		int a[] = new int[n];
		for(int i=0; i<a.length; i++) {
			a[i] = scan.nextInt();
		}
		
		int b[] = new int[n];
		for(int i=0; i<b.length; i++) {
			b[i] = scan.nextInt();
		}
		
		int c[] = new int[n];
		for(int i=0; i<c.length; i++) {
			System.out.print((c[i] = a[i]*b[i])+" ");
		}
	}
}
