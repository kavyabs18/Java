package com.kodnest.Questions;

public class hellojavaTOjavahello {
public static void main(String[] args) {
//wajp convert hello java program to program java hello 
	String s = "hello java program";
	String []split = s.split(" ");
	for(int i=split.length-1; i>=0; i--) {
		System.out.print(split[i]+" ");
	}
}	
}
