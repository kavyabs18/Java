package com.apnacollege;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
//		Find the maximum & minimum number in an array of integers. 
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = scan.nextInt();
		int a[] = new int[size];
		System.out.println("Enter the elements");
		for(int i=0; i<size; i++) {
			a[i] = scan.nextInt();
		}
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for(int i=0; i<size; i++) {
			if(a[i]<min) {
				min = a[i];
			}
			if(a[i]>max) {
				max = a[i];
			}
		}
		System.out.println("min = "+min+" max = "+max);
	}
}
