package com.apnacollege;

public class Pattern11 {
	public static void main(String[] args) {
//		Print a solid Butterfly.
		int n = 4;
		for(int i=1; i<=2*n; i++) {
			if(i<=n) {
				for(int j=1; j<=n; j++) {
					if(j<=i) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				for(int j=n+1; j<=2*n; j++) {
					if((i+j)>8) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			else {
				for(int j=1; j<=n; j++) {
					if((i+j)<=9) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				for(int j=n+1; j<=2*n; j++) {
					if(j>(i-1)) {
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
}
