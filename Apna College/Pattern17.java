package com.apnacollege;

public class Pattern17 {
	public static void main(String[] args) {
//		Print Inverted Half Pyramid.
		int n = 4;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<i; j++) {
				System.out.print(" ");
			}
			for(int j=n; j>=i; j--) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}
