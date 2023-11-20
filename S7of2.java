package com.kodnest.stringQuestionsinkodnest;

public class S7of2 {
public static void main(String[] args) {
	//65-->90 A to Z
	//97-->122 a to z
	//48-->57 0 to 9
	System.out.println((int)'0');
	
	

	String str = "Hello World!123";
	
	String lowercase = str.toLowerCase();
	
	int digit = 0;
	int vowels = 0;
	int consonants = 0;
	for(int i=0;i<str.length(); i++) {
		if (Character.isDigit(str.charAt(i))){
			digit++;
		}
	}
	
	for(int i=0; i<lowercase.length(); i++) {
		if(lowercase.charAt(i)>=97 && lowercase.charAt(i)<=122) {
			if(lowercase.charAt(i) == 'a' || lowercase.charAt(i) == 'e' || lowercase.charAt(i) == 'i' || lowercase.charAt(i) == 'o' || lowercase.charAt(i) == 'u') {
				vowels++;
			}
			else {
				consonants++;
			}
		}
	}
	System.out.println("Total Digits : "+digit);
	System.out.println("The vowel count is : "+vowels);
	System.out.println("The Consonants is : "+consonants);
	System.out.println("The special characters is : "+(str.length()-digit-vowels-consonants));
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// Upper case = 2
	//Lower case = 8
	//number = 3
	//special character = leftout
	
	int upper = 0;
	int lower = 0;
	int number = 0;
	for(int i=0; i<str.length(); i++) {
		char ch = str.charAt(i);
		if(ch>=65&&ch<=90) {
			upper++;
		}else if(ch>=97&&ch<=122) {
			lower++;
		}else if(ch>=48&&ch<=57) {
			number++;
		}
	}
	System.out.println("Upper case letters : "+upper);
	System.out.println("Lower case letters : "+lower);
	System.out.println("Numbers : "+number);
	System.out.println("Special characters :" +(str.length()-upper-lower-number));
}
}
