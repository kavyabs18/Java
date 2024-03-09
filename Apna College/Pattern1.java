package com.apnacollege;

public class Pattern1 {
	public static void main(String[] args) {
//		Solid Rectangle
		int row = 4;
		int col = 5;
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
