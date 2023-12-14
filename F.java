package com.kodnest.loopingpractice;

public class F {
public static void main(String[] args) {
	for(int i=0; i<=10; i++) {
		for(int j=0; j<=12; j++) {
			if(i==0||j==0||i==6) {
				System.out.print("*");
			}
		}
		System.out.println();
	}
}
}
