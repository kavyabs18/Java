package com.kodnest.practicetest;
import java.util.Scanner;
public class Question12 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("User! please enter an integer");
	int a=scan.nextInt();
	if(a%2==0)
		System.out.println("The number is divisible by 2");
	System.out.println("end");
}
}
