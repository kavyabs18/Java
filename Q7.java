package com.kodnest.datatypes;

import java.util.Scanner;

public class Q7 {
public static void main(String[] args) {
	/*Write a Java program to take the user for a distance (in meters) and the time taken (as three numbers: hours, minutes, seconds), and display the speed, in meters per second, kilometers per hour and miles per hour (hint: 1 mile = 1609 meters).

Test Data
Input distance in meters: 2500
Input hour: 5
Input minutes: 56
Input seconds: 23
Expected Output :
Your speed in meters/second is 0.11691531
Your speed in km/h is 0.42089513
Your speed in miles/h is 0.26158804*/
	Scanner scan = new Scanner(System.in);
	System.out.println("Input distance in meters:");
	float d = scan.nextFloat();
	System.out.println("Input hour:");
	float h = scan.nextFloat();
	System.out.println("Input minutes:");
	float m = scan.nextFloat();
	System.out.println("Input seconds:");
	float s = scan.nextFloat();
	float t = h*60*60+m*60+s;
	float ms = d/t;
	float kmh = d*3600/(t*1000);
	float mh = kmh/1.609f;
	System.out.println("Your speed in meters/second is "+ms);
	System.out.println("Your speed in km/h is "+kmh);
	System.out.println("Your speed in miles/h is "+mh);
}
}
