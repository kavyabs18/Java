package com.kodnest.datatypes;

import java.util.Scanner;

public class Q2 {
public static void main(String[] args) {
	/*Write a Java program that reads a number in inches and converts it to meters.
Note: One inch is 0.0254 meter.
Test Data
Input a value for inch: 1000
Expected Output :
1000.0 inch is 25.4 meters*/
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the value in inches");
	float i = scan.nextFloat();
	float m = i*0.0254f;
	System.out.println(i+" inch is "+m+" meters");
}
}
