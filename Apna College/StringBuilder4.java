package com.apnacollege;

import java.util.Scanner;

public class StringBuilder4 {
	public static void main(String[] args) {
//		Reverse a String (using StringBuilder class)
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string");
		StringBuilder name = new StringBuilder(scan.next());
		int front = 0;
		int back = name.length()/2;
		System.out.println("Original String : "+name);
		for(int i=front; i<=back; i++) {
			char frontchar = name.charAt(i);
			char backchar = name.charAt(name.length()-1-i);
			name.setCharAt(i, backchar);
			name.setCharAt(name.length()-1-i, frontchar);
		}
		System.out.println("Reversed String : "+name);
	}
}
