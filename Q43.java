package com.kodnest.w3resource;

public class Q43 {
/*Write a Java program to print the following string in a specific format (see output).
Sample Output

Twinkle, twinkle, little star,
	How I wonder what you are! 
		Up above the world so high,   		
		Like a diamond in the sky. 
Twinkle, twinkle, little star, 
	How I wonder what you are*/
	public static void main(String[] args) {
		String s1 = "Twinkle, twinkle, little star,";
		String s2 = "How I wonder what you are!";
		String s3 = "Up above the world so high,";
		String s4 = "Like a diamond in the sky.";
		System.out.println(s1+"\n\t"+s2+"\n\t\t"+s3+"\n\t\t"+s4+"\n"+s1+"\n\t"+s2);
	}
}
