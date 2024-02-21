package com.kodnest.demo_exception;

public class DemoException {
public static void main(String[] args) {
	int []a = {1,2,3,4,5};
	try {
		System.out.println(a[5]);		
	}
	catch (ArithmeticException e) {
		System.out.println("Exception caught - Enter array index within the boundary");
	}
	catch (Exception e) {
		System.out.println("Exception caught - Enter array index within the boundary");
	}
	finally {
		System.out.println("Program ended");
	}
}
}
