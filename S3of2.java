package com.kodnest.stringQuestionsinkodnest;

public class S3of2 {
public static void main(String[] args) {
	String str = "Java";
	StringBuilder s =new StringBuilder(str);
	StringBuilder reverse = s.reverse();//reverse sting
	System.out.println(reverse);
	
	
	String x = "";
	for(int i=str.length()-1; i>=0; i--) {
		x = x+str.charAt(i);
	}
	System.out.println(s);//reverse string
	
	
	
	for(int i=str.length()-1; i>=0; i--) {
		System.out.print(str.charAt(i));//display
	}
}
}
