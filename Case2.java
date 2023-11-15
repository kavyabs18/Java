package com.kodnest.concatination;

public class Case2 {
public static void main(String[] args) {
	String s1 = new String("Java");
	String s2 = new String("Program");
	String s3 = s1 + s2;
	String s4 = s3;
	System.out.println(s3==s4);
	System.out.println(s3.equals(s4));
}
}
