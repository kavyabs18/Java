package com.kodnest.w3resource;

public class Q61 {
/*Write a Java program to reverse a word.
Sample Output:

Input a word: dsaf
Reverse word: fasd*/
	public static void main(String[] args) {
		String s = "dsaf";
		for(int i=s.length()-1; i>=0; i--) {
			System.out.print(s.charAt(i));			
		}
	}
}
