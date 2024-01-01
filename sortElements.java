package com.kodnest.Questions;

public class sortElements {
public static void main(String[] args) {
	String [] s = {"java", "mt", "at", "python", "data"};
	for(int i=0; i<s.length; i++) {
		for(int j=0; j<s.length-i-1; j++) {
			if(s[j].compareTo(s[j+1])>0) {
				String temp = s[j];
				s[j]=s[j+1];
				s[j+1]=temp;
			}
		}
	}
	for(String string : s) {
		System.out.println(string);
	}
}
}
