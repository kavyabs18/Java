package com.apnacollege;

import java.util.Scanner;

public class Array1 {
	public static void main(String[] args) {
//		Take an array of numbers as input and check if it is an array sorted in ascending order.
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = scan.nextInt();
		int a[] = new int[size];
		System.out.println("Enter the elements");
		for(int i=0; i<a.length; i++) {
			a[i] = scan.nextInt();
		}
		boolean isAscending = true;
		for(int i=0; i<a.length-1; i++) {
			if(a[i]>a[++i]) {
				isAscending = false;
			}
		}
		if(isAscending) {
			System.out.println("Array is sorted in ascending order");
		}else {
			System.out.println("Array is not sorted in ascending order");
		}
	}
}
