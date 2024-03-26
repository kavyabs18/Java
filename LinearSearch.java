package com.kodnest.practice;

import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of an Array");
		int size = scan.nextInt();
		int a[] = new int[size];
		for(int i=0; i<a.length; i++) {
			a[i] = scan.nextInt();
		}
		System.out.println("Enter the Target Element");
		int target = scan.nextInt();
		int result = LinearSearch(a,target);
		if(result!=-1) {
			System.out.println("Element "+target+" found at index "+result);
		}else {
			System.out.println("Element not found");
		}
		
	}
	static int LinearSearch(int[] a, int target) {
		int i=0;
		while(i<a.length) {
			if(a[i]==target) {
				return i;
			}
			i++;
		}
		return -1;
	}
}
