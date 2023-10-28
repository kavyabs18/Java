package com.kodnest.practicetest;
import java.util.Scanner;
public class Question8 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("User! please enter the income of a citizen");
	int income=scan.nextInt();
	if(income<=700000)
		System.out.println("Income is 700000 or less. No tax is required");
	else
		System.out.println("Income is greater than 700000. Tax must be paid");
}
}
