package com.kodnest.w3resource;

import java.util.Scanner;

public class Q42 {
/*Write a Java program to input and display your password.
Expected Output

Input your Password:                                                    
Your password was: abc@123*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input your Password");
		String ch = scan.next();
		System.out.print(ch);
		
		
		
		/*		OR
		char c[] = scan.next().toCharArray();
		for(int i=0; i<c.length; i++) {
			System.out.print(c[i]);
		}*/
		
	}
}
