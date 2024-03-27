package com.kodnest.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PermutationArray {
	public static void main(String[] args) {
		int n=5;
		shuffelUsingList(n);
		int a [] = {3,1,5,2,0,4};
		shuffelUsingArray(a);
		
	}
	private static void shuffelUsingArray(int[] a) {
		int []b = new int[a.length];
		for(int i=0; i<b.length; i++) {
			b[i] = a[a[i]];
		}
		System.out.println("Shuffeling Array using Array concept : \n"+Arrays.toString(b));
	}
	public static void shuffelUsingList(int n) {
		List<Integer> b = new ArrayList<Integer>();
		for(int i=0; i<n; i++) {
			b.add(i);
		}
		Collections.shuffle(b);
		int []res = new int[b.size()];
		for(int i=0; i<b.size(); i++) {
			res[i] = b.get(i);
		}
		System.out.println("Shuffeling Array using Collections concept : \n"+Arrays.toString(res));
	}
}
