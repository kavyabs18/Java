package com.kodnest.methods1;

import java.util.Scanner;

public class App7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("User! please enter marks of 8 semesters");
		double sem1 = scan.nextDouble();
		double sem2 = scan.nextDouble();
		double sem3 = scan.nextDouble();
		double sem4 = scan.nextDouble();
		double sem5 = scan.nextDouble();
		double sem6 = scan.nextDouble();
		double sem7 = scan.nextDouble();
		double sem8 = scan.nextDouble();
		
		Question7 q7 = new Question7();
		double result = q7.calculateAverage(sem1,sem2,sem3,sem4,sem5,sem6,sem7,sem8);
		
		System.out.println("The average of 8 semesters is "+result);		
	}
}