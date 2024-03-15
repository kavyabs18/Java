package com.kodnest.hackerrank;

import java.util.Scanner;

public class SubString {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a String");
		String S = in.nextLine();
		System.out.println("Enter substring starting index ");
		int start = in.nextInt();
		System.out.println("Enter substring ending index ");
		int end = in.nextInt();
		System.out.print("Sub String is "+S.substring(start, end));
	}
}
