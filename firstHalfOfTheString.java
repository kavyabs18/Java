package com.kodnest.Questions;

public class firstHalfOfTheString {
public static void main(String[] args) {
//	1. wajp to display the first half of the string	
	String s = "programming";
	for(int i=0; i<s.length()/2+1; i++) {
		System.out.print(s.charAt(i)+" ");
	}
}
}