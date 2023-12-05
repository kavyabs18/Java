package com.kodnest.w3resource;

import java.util.Scanner;

class Q80 {
/*Write a Java program to get the largest value between the first and last elements of an array (length 3) of integers.
Sample Output:

Original Array: [20, 30, 40]                                           
Larger value between first and last element: 40*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("User please enter size of array");
		int n = scan.nextInt();
		System.out.println("User please enter array elements");
		int a[] = new int[n];
		for(int i=0; i<a.length; i++) {
			a[i] = scan.nextInt();
		}
		if(a[0]>a[a.length-1]) {
			System.out.println("Larger value between first and last element: "+a[0]);
		}
		else {
			System.out.println("Larger value between first and last element: "+a[a.length-1]);
		}
	}
}
