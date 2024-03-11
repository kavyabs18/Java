package com.apnacollege;

public class Pattern13 {
	public static void main(String[] args) {
//		Print a hollow Butterfly.
		int n = 10;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(j==1||j==n||i==j||(i+j)==11) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
