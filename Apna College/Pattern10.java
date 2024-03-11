package com.apnacollege;

public class Pattern10 {
	public static void main(String[] args) {
//		Print a palindromic number pyramid.
		int m=5;
		for(int i=1; i<=m; i++) {
			for(int j=1; j<=m-i; j++) {
				System.out.print(" ");
			}
			for(int j=i; j>=1; j--) {
				System.out.print(j);
			}
			for(int j=2; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
