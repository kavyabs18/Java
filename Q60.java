package com.kodnest.w3resource;

public class Q60 {
/*Write a Java program to find the penultimate (next to the last) word in a sentence.
Sample Output:

Input a String: The quick brown fox jumps over the lazy dog.
Penultimate word: lazy*/
	public static void main(String[] args) {
		String s = "The quick brown fox jumps over the lazy dog.";
		String []a = s.split(" ");
		System.out.println(a[a.length-2]);
	}
}
