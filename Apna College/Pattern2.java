package com.apnacollege;

public class Pattern2 {
	public static void main(String[] args) {
//		Hollow Pattern
		int row = 4;
		int col = 5;
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				if(i==0||j==0||i==row-1||j==col-1) {
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
