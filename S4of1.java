package com.kodnest.stringQuestionsinkodnest;

public class S4of1 {
public static void main(String[] args) {
	String str = "ava";
	String s = "";
	for(int i =str.length()-1; i>=0; i--) {
		s = s+str.charAt(i);
	}
	if(str.equals(s)) {
		System.out.println("Palindrome");
	}
	else {
		System.out.println("Not!");
	}
}
}
