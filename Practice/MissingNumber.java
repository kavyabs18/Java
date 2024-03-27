package com.kodnest.practice;

import java.util.Arrays;

public class MissingNumber {
	public static void main(String[] args) {
//		Given an array arr[] of size N-1 with integers in the range of [1, N], the task is to find the missing number from the first N integers.
		int a[] = {1,4,2,6,3,7};
		Arrays.sort(a);
		for(int i=0; i<a.length-1; i++) {
			if(a[i]==a[i+1]-1) {
				continue;
			}else {
				System.out.println("Missing Element is : "+(a[i]+1));
				break;
			}
		}
	}
}
