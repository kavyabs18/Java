package com.kodnest.practice;

public class BitonicArray {
	public static void main(String[] args) {
//		Bitoin Array : Strictly increasing and then decreasing
//		Find max element
		int a[] = {1,3,5,7,9,5,3,1};
		int min = 0;
		for(int i=0; i<a.length; i++) {
			if(a[i]>min) {
				min = a[i];
			}else {
				System.out.println(i);
				break;
			}
		}
	}
}
