package com.kodnest.Questions;

public class Solution6 {
public static void main(String[] args) {
//	1. wajp to display ->gnimm	
	String s = "programming";
	for(int i=s.length()-1; i>s.length()/2; i--) {
		System.out.print(s.charAt(i)+" ");
	}
}
}
