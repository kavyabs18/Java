package com.apnacollege;

public class Pattern15 {
	public static void main(String[] args) {
//		Print Pascal’s Triangle.
		int n = 5;
		for (int i = 0; i < n; i++) {
            int number = 1;
            for(int j=n-1; j>i; j--) {
            	System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
	}
}
