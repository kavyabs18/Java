package com.kodnest.practice;

public class SubArray {
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		System.out.println("Sub Arrays are : ");
		for(int i=0; i<a.length; i++) {
			for(int j=i; j<a.length; j++) {
				for(int k=i; k<=j; k++){
					System.out.print(a[k]+" ");
				}
				System.out.println();
			}
		}
	}
}
