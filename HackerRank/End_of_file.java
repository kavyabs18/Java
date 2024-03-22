package com.kodnest.hackerrank;

import java.util.Scanner;

public class End_of_file {

	public static void main(String[] args) {
		/*
		  Hello world
		  I am a file
		  Read me until end-of-file.
		 */
		Scanner sc = new Scanner(System.in);
		int i = 1;
		System.out.println("Enter the input");
		while (sc.hasNext()) {
			String a = sc.nextLine();
			System.out.println(i + " " + a);
			i++;
		}
		sc.close();
	}
}