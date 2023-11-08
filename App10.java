package com.kodnest.methods1;

import java.util.Scanner;

public class App10 {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("User! please enter a message to decode");
		char ch = scan.next().charAt(0);
		
		Question10 q10 = new Question10();
		int result = q10.decodeCharacter(ch);
		
		System.out.println("The Unicode of the received character is "+result);
	}
}
