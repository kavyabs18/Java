package com.kodnest.practicetest;
import java.util.Scanner;
public class Question10 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("User please enter an integer");
	int a=scan.nextInt();
	if(a>=30&&a<=300)
		System.out.println("true");
	else
		System.out.println("false");
}
}
