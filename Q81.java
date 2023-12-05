package com.kodnest.w3resource;

import java.util.Scanner;

class Q81 {
/*Write a Java program to swap the first and last elements of an array (length must be at least 1) and create another array.
Sample Output:

Original Array: [20, 30, 40]                                           
New array after swaping the first and last elements: [40, 30, 20] */
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
			System.out.print((b[i] = a[b.length-1-i])+" ");
		}
	}
}
