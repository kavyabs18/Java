package com.apnacollege;

import java.util.Scanner;

public class StringBuilder2 {
	public static void main(String[] args) {
//		Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’. 
//		Ex:		Original = “eabcdef’ ; result = “iabcdif”
//				Original = “xyz” ; result = “xyz”
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
		StringBuilder original = new StringBuilder(scan.next());
		StringBuilder result = new StringBuilder();
		for(int i=0; i<original.length(); i++) {
			if(original.charAt(i)=='e') {
				result.append('i');
			}else {
				result.append(original.charAt(i));
			}
		}
		System.out.println("Original : "+original);
		System.out.println("Result : "+result);
	}
}
