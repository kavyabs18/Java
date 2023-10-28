package com.kodnest.practicetest;
import java.util.Scanner;
public class Question7 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("User! please enter length and bredth of geometric shape");
		int l=scan.nextInt();
		int b=scan.nextInt();
		if(l==b)
			System.out.println("The given shape is a square");
		else
			System.out.println("The given shape is not a square");
	}
}
