package com.kodnest.w3resource;

public class Q38 {
/* Write a Java program to count letters, spaces, numbers and other characters in an input string.
Expected Output

The string is :  Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33
letter: 23                                               
space: 9                                                 
number: 10                                               
other: 6 

a-z(97-122),  A-Z(65-90),  ' '(32),   0-9(48-57)

*/
	public static void main(String[] args) {
		String s = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
		int letter = 0;
		int space = 0;
		int number = 0;
		int other = 0;
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)>=97&&s.charAt(i)<=122||s.charAt(i)>=65&&s.charAt(i)<=90) {
				letter++;
			}
			else if(s.charAt(i)==32) {
				space++;
			}
			else if(s.charAt(i)>=48&&s.charAt(i)<=57) {
				number++;
			}
			else {
				other++;
			}
		}
		System.out.println("letter: "+letter);
		System.out.println("space: "+space);
		System.out.println("number: "+number);
		System.out.println("other: "+other);
	}
}
