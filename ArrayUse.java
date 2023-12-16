package com.kodnest.data_structures;

import java.util.Scanner;

public class ArrayUse {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Arrays array = new Arrays();
			while(true) {			
			System.out.println("User please enter the number to start program");
			System.out.println("=============================");
			System.out.println("1 -  Insertion");
			System.out.println("2 -  Deletion");
			System.out.println("3 -  Display");
			System.out.println("Any other number to stop the program");
			System.out.println("=============================");
			int n = scan.nextInt();
			switch (n) {
			case 1:	array.insert();
					break;
				
			case 2: array.delete();
					break;
				
			case 3: array.display();
					break;
				
			default: return;
			}
		}
	}
}
