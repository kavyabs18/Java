package com.apnacollege;

public class Pattern16 {
	public static void main(String[] args) {
//		Print half Pyramid.
		int n = 5;
		for(int i=1; i<=n; i++) {
			for(int j=n; j>i; j--) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
