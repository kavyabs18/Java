package com.apnacollege;

public class Bubble_Sort {
	public static void main(String[] args) {
		int []a = {7,8,3,1,2};
		
//		time complexity=O(n^2)
//		sorted in ascending order
		for(int i=0; i<a.length-1; i++) {
			for(int j=0; j<a.length-1-i; j++) {
				if(a[j]>a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		printArray(a);
	}
	public static void printArray(int[] a) {
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
}
