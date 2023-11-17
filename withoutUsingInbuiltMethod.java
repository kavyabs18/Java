package com.kodnest.Questions;

public class withoutUsingInbuiltMethod {
public static void main(String[] args) {
	String s = "prog";
	int count = 0;
	int i = 0; 
	
	try {
		
	while(true) {
		System.out.println(s.charAt(i));
		i++;
		count++;
	}
	} catch (Exception e) {
		System.out.println("The length is "+count);
	}
}
}
