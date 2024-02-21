package com.kodnest.demo_exception;

public class Arithmetic_Exception {
public static void main(String[] args) {
	try {
		int a = 10;
		int b = 0;
		int quo = a/b;
		System.out.println(quo);		
	}
	catch (Exception e) {
		System.out.println("Division by zero not Possible");
	}
	
	
//	String s = "123a";
//	int parseInt = Integer.parseInt(s);
//	System.out.println(parseInt);
}
}
//ArrayIndexOutOfBoundsException
//NegativeArraySizeException
//java.lang.StringIndexOutOfBoundsException
//NumberFormatException