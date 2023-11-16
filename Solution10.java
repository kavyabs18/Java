package com.kodnest.Questions;

public class Solution10 {
public static void main(String[] args) {
	//	1. wajp to check the given string is palindrome or not 
	String s ="mom";
	StringBuffer str = new StringBuffer(s);
	StringBuffer reverse = str.reverse();
	if(s.equals(reverse.toString())) {
		System.out.println("Palindrome");
	}
	else {
		System.out.println("Not Palindrome");
	}
}
}
