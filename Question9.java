package com.kodnest.practicetest;
import java.util.Scanner;
public class Question9 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("User! please enter a character");
	char ch=scan.next().charAt(0);
	if(ch>='a'&&ch<='z')
		System.out.println("lowercase");
	if(ch>='A'&&ch<='Z')
		System.out.println("Uppercase");
}
}
