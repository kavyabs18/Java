package com.apnacollege;

import java.util.Scanner;

public class String1 {
	public static void main(String[] args) {
//		Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size of Array");
		int size = scan.nextInt();
		String []s = new String[size];
		System.out.println("Enter the names");
		int count=0;
		for(int i=0; i<s.length; i++) {
			s[i] = scan.next();
			count += s[i].length();
		}
		System.out.println("Total Length of all names : "+count);
	}
}
