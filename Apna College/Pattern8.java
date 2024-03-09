package com.apnacollege;

public class Pattern8 {
	public static void main(String[] args) {
		int n = 5;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=(2*n-1); j++) {
				if((i+j)>5&&(i+j)<=10) {
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
