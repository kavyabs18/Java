package com.kodnest.concatination;

public class Case1 {
public static void main(String[] args) {
	String s1 = "Java";
	String s2 = "Program";
	String s3 = s1 + s2;
	String s4 = s3;
	System.out.println(s3==s4);
	System.out.println(s3.equals(s4));
}
}
