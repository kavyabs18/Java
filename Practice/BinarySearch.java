package com.kodnest.practice;

import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
//		Half-interval Search
		int []a = {1,5,2,9,8,3};
		Arrays.sort(a);
		System.out.println(Math.log10(1021));
		for(int i:a) {
			System.out.print(i+" ");
		}
		System.out.println();
		int target = 10;
		int result = BinarySearch(a, target);
		if(result>=0) {
			System.out.println("Element "+target+" found at index "+result);
		}
		else {
			System.out.println("Element not found");
		}
	}
	static int BinarySearch(int a[], int target) {
		int start = 0;
		int end = a.length-1;
		while(start<=end) {
			int mid = start+(end-start)/2;
			if(target==a[mid]) {
				return mid;
			}
			else if(target<a[mid]) {
				end = mid-1;
			}
			else {
				start = mid+1;
			}
		}
		return -1;
	}
}
