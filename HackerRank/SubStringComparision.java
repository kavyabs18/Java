package com.kodnest.hackerrank;

import java.util.Scanner;

public class SubStringComparision {
	public static String getSmallestAndLargest(String s, int k) {
		String smallest = "";
		String largest = "";
		String emp = "";
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				if (s.substring(i, j).length() == k) {
					emp = emp + s.substring(i, j) + " ";
				}
			}
		}
		String[] split = emp.split(" ");
		for (int i = 0; i < split.length; i++) {
			for (int j = 0; j < split.length - i - 1; j++) {
				if (split[j].compareTo(split[j + 1]) > 0) {
					String temp = split[j];
					split[j] = split[j + 1];
					split[j + 1] = temp;
				}
			}
		}
		smallest = split[0];
		largest = split[split.length - 1];
		// Complete the function
		// 'smallest' must be the lexicographically smallest substring of length 'k'
		// 'largest' must be the lexicographically largest substring of length 'k'

		return "lexicographically smallest substring : " + smallest + "\n" +"lexicographically largest substring : " + largest;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string without space");
		String s = scan.next();
		System.out.println("Enter the length of sub-string");
		int k = scan.nextInt();
		scan.close();

		System.out.println(getSmallestAndLargest(s, k));
	}
}