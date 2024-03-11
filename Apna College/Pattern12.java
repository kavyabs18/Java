package com.apnacollege;

public class Pattern12 {
	public static void main(String[] args) {
//		Print a Diamond shape
		int n=4;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<2*i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=n; i>=1; i--) {
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<2*i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
