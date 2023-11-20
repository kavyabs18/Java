package com.kodnest.stringQuestionsinkodnest;

public class S4of2 {
public static void main(String[] args) {
	String str = "Programming";
	String s = "";
	for(int i=0; i<str.length(); i++) {
		if(!s.contains(str.charAt(i)+"")) {
			s = s+str.charAt(i);
		}
	}
	System.out.println(s);
}
}
