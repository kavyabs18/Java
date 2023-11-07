package com.kodnest.methods1;

import java.util.Scanner;

public class App4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("User! please enter First Name");
		String str1=scan.next();
		System.out.println("User please enter Last Name");
		String str2=scan.next();
		
		Question4 q4 = new Question4();
		String result = q4.joinString(str1,str2);
		
		System.out.println(result);
	}
}
