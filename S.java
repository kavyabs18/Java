package com.kodnest.loopingpractice;

public class S {
public static void main(String[] args) {
	for(int i=0; i<=12; i++) {
		for(int j=0; j<=6; j++) {
			if(i==0||i==6||i==12||j==0&&i<=6||j==6&&i>=6) {
				System.out.print("* ");
			}
			else {
				System.out.print("  ");
			}
		}
		System.out.println();
	}
}
}
