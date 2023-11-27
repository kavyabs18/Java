package com.kodnest.w3resource;

public class Q58 {
/*Write a Java program to capitalize the first letter of each word in a sentence.
Sample Output:

Input a Sentence: the quick brown fox jumps over the lazy dog.         
The Quick Brown Fox Jumps Over The Lazy Dog.*/
	public static void main(String[] args) {
		String s = "the quick brown fox jumps over the lazy dog.";
		String []a = s.split(" ");
		String result = "";
		for(int i=0; i<a.length; i++) {
			s =  ((a[i].charAt(0)+"").toUpperCase()+a[i].substring(1)+" ");
			result=result+s;
		}
		System.out.println(result);
	}
}
