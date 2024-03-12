package com.apnacollege;

import java.util.Scanner;

public class StringBuilder1 {
	public static void main(String[] args) {
//		Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of an Array");
		int size = scan.nextInt();
		StringBuilder[] sb = new StringBuilder[size];
		int length = 0;
		for(int i=0; i<sb.length; i++) {
			sb[i] = new StringBuilder();
			String s = scan.next();
			sb[i].append(s);
			length += sb[i].length();
		}
		System.out.println("Total Length of all names : "+length);
	}
}
