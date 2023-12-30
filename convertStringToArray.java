package com.kodnest.Questions;

public class convertStringToArray {
public static void main(String[] args) {
//	1. wajp to convert a string to an Array 
	String s = "programming";
	char []ch=s.toCharArray();
	for(int i=0; i<ch.length; i++) {
		System.out.print(ch[i]);
	}
}
}
