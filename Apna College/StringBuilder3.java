package com.apnacollege;

import java.util.Scanner;

public class StringBuilder3 {
	public static void main(String[] args) {
//		Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.
//		Ex:		email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava” 
//				email = “helloWorld123@gmail.com”; username = “helloWorld123”
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the email");
		String s = scan.next();
		StringBuilder email = new StringBuilder(s);
		StringBuilder username = new StringBuilder();
		for(int i=0; i<email.length(); i++) {
			if(email.charAt(i)=='@') {
				break;
			}
			username.append(email.charAt(i));
		}
		System.out.println("Email : "+email);
		System.out.println("Username : "+username);
	}
}
