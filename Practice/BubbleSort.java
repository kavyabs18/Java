package com.kodnest.practice;

public class BubbleSort {
	public static void main(String[] args) {
//		SinkingSort, InplaceSort, ExchangeSort
		int [] a = {5,2,0,8,4,6};
		int temp;
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a.length-i-1; j++) {
				if(a[j]<a[j+1]) {
					continue;
				}else {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for(int i:a) {
			System.out.print(i+" ");
		}
	}
}
