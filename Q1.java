package com.kodnest.datatypes;

import java.util.Scanner;

public class Q1 {
public static void main(String[] args) {
	/*Write a Java program to convert temperature from Fahrenheit to Celsius degrees.
Test Data
Input a degree in Fahrenheit: 212
Formula:(f-32)*5/9
Expected Output:
212.0 degree Fahrenheit is equal to 100.0 in Celsius*/
	Scanner scan = new Scanner(System.in);
	System.out.println("User enter temperatue in Fahrenheit");
	float f = scan.nextFloat();
	float c = (f-32)*5/9;
	System.out.println(f+" Fahrenheit is equal to "+c+" in degree Celsius");
}
}
