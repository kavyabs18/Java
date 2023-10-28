package com.kodnest.practicetest;
import java.util.Scanner;
public class Question14 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("User ! please enter the marks");
	double a=scan.nextDouble();
	if(a>=90)
		System.out.println("For a percentage of "+a+"% the grade is A");
	if(a>=80&&a<90)
		System.out.println("For a percentage of "+a+"% the grade is B");
	if(a>=70&&a<80)
		System.out.println("For a percentage of "+a+"% the grade is C");
	if(a<70)
		System.out.println("For a percentage of "+a+"% the grade is D");
}
}
