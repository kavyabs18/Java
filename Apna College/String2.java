package com.apnacollege;

import java.util.Scanner;

public class String2 {
	public static void main(String[] args) {
//		Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’. 
//		Ex:		Original = “eabcdef’ ; result = “iabcdif”
//				Original = “xyz” ; result = “xyz”
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
		String original = scan.nextLine();
		String result = "";
		for(int i=0; i<original.length(); i++) {
			if(original.charAt(i)=='e') {
				result += 'i';
			}else {
				result += original.charAt(i);
			}
		}
		System.out.println("Original String : "+original);
		System.out.println("Result String : "+result);
	}
}
