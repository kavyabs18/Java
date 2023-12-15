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
		System.out.println("Division by zero");
	}
}
}
//ArrayIndexOutOfBoundsException
//NegativeArraySizeException
//java.lang.StringIndexOutOfBoundsException