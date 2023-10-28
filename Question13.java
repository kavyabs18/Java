package com.kodnest.practicetest;
import java.util.Scanner;
public class Question13 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("User! please enter an integer");
	int a=scan.nextInt();
	if(a>0)
		System.out.println("The number is positive");
	else
		System.out.println("The number is negative");
}
}
