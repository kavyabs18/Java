package com.kodnest.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddArrayAndInteger {
	public static void main(String[] args) {
		int a[] = {8,5,0};
		int b = 580;
		List<Integer> result = sum(a,b);
		System.out.println(result);
	}
	
	static List<Integer> sum(int a[], int b) {
		List <Integer> add = new ArrayList<Integer>();
		int sum=0;
		for(int i=0; i<a.length; i++) {
			sum = sum*10 + a[i];
		}
		sum+=b;
//		to find length of the sum
//		int length = (int)Math.log10(sum)+1;
		while(sum!=0) {
			add.add(sum%10);
			sum/=10;
		}
		Collections.reverse(add);
		return add;
	}
}
