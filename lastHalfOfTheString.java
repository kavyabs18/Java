package com.kodnest.Questions;

public class lastHalfOfTheString {
public static void main(String[] args) {
//	1. wajp to display the last half of the string	
	String s = "programming";
	for(int i=s.length()/2+1; i<s.length(); i++) {
		System.out.print(s.charAt(i)+" ");
	}
}
}
