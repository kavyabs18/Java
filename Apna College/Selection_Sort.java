package com.apnacollege;

public class Selection_Sort {
	public static void main(String[] args) {
		int []a = {7,8,3,1,2};
		
//		time complexity=O(n^2)
//		selection sort
		for(int i=0; i<a.length-1; i++) {
			int smallest = i;
			for(int j=i+1; j<a.length; j++) {
				if(a[smallest]>a[j]) {
					smallest=j;
				}
			}
			int temp = a[i];
			a[i] = a[smallest];
			a[smallest] = temp;
		}
			printArray(a);
	}
	public static void printArray(int[] a) {
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
}
