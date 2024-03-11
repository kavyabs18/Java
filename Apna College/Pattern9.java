package com.apnacollege;

public class Pattern9 {
	public static void main(String[] args) {
//		Print a number pyramid.
		int m=5;
		for(int i=1; i<=m; i++) {
			for(int j=1; j<=m-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}
