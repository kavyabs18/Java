package com.kodnest.Questions;

import java.util.Scanner;

public class readASentenceAndDisplay {
public static void main(String[] args) {
	//wajp to read a sentence and display
	Scanner scan = new Scanner(System.in);
	System.out.println("User please enter a sentence");
	String s = scan.nextLine();
	System.out.println(s);
}
}
