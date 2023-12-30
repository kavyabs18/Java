package com.kodnest.Questions;

public class convertMutableToImmutableString {
public static void main(String[] args) {
//	1. wajp to convert mutable to immutable string 
	StringBuffer s = new StringBuffer("programming");
	String str = new String(s);
	System.out.print(s);
}
}
