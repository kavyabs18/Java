package com.kodnest.w3resource;

import java.util.Scanner;

class Q82 {
/*Write a Java program to find the largest element between the first, last, and middle values in an array of integers (even length).
Sample Output:

Original Array: [20, 30, 40, 50, 67]                                   
Largest element between first, last, and middle values: 67 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("User please enter size of array");
		int n = scan.nextInt();
		System.out.println("User please enter array elements");
		int a[] = new int[n];
		for(int i=0; i<a.length; i++) {
			a[i] = scan.nextInt();
		}
		if(a[0]>a[a.length/2]&&a[0]>a[a.length-1]) {
			System.out.println("Largest element between first, last, and middle values: "+a[0]);
		}
		else if(a[a.length/2]>a[0]&&a[a.length/2]>a[a.length-1]) {
			System.out.println("Largest element between first, last, and middle values: "+a[a.length/2]);
		}
		else {
			System.out.println("Largest element between first, last, and middle values: "+a[a.length-1]);
		}
	}
}
