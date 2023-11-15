package com.kodnest.concatination;

public class Case3 {
public static void main(String[] args) {
	String s1 = "Java";
	String s2 = "Program";
	String s3 = s1.concat(s2);
	String s4 = s1 + s2;
	System.out.println(s3 == s4);
	System.out.println(s3.equals(s4));
}
}
