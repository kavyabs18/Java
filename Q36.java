package com.kodnest.w3resource;

import java.util.Scanner;

public class Q36 {
/*Write a Java program to compute the distance between two points on the earth's surface.
Distance between the two points [ (x1,y1) & (x2,y2)]
d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
Radius of the earth r = 6371.01 Kilometers
Input Data:
Input the latitude of coordinate 1: 25
Input the longitude of coordinate 1: 35
Input the latitude of coordinate 2: 35.5
Input the longitude of coordinate 2: 25.5
Expected Output

The distance between those points is: 1480.0848451069087 km */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("User please enter the latitude of coordinate 1 :");
		double x1 = scan.nextDouble();
		x1 = Math.toRadians(x1);
		System.out.println("User please enter the latitude of coordinate 1 :");
		double y1 = scan.nextDouble();
		y1 = Math.toRadians(y1);
		System.out.println("User please enter the latitude of coordinate 2 :");
		double x2 = scan.nextDouble();
		x2 = Math.toRadians(x2);
		System.out.println("User please enter the latitude of coordinate 2 :");
		double y2 = scan.nextDouble();
		y2 = Math.toRadians(y2);
		double radius = 6371.01;
		double d = radius * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
		System.out.println("The distance between those points is: "+d+"km");
	}
}
