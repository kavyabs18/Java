package com.kodnest.Questions;

public class charactersInReverseOrder {
public static void main(String[] args) {
//	1. wajp to display all the characters in reverse order	
	String s = "programming";
	for(int i=s.length()-1; i>=0; i--) {
		System.out.print(s.charAt(i)+" ");
	}
}
}