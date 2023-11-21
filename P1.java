package com.kodnest.String;

import java.util.Scanner;

public class P1 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("User please enter a string");
	String inputString = scanner.nextLine();
	System.out.println("User please enter index value");
	int index = scanner.nextInt();
	
	char character = getCharacterAtIndex(inputString, index);
	System.out.println("Character at index" + index + ":" + character);
}
public static char getCharacterAtIndex(String inputString, int index) {
	return inputString.charAt(index);
}
}
