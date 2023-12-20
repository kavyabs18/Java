package com.kodnest.exception_handling;

public class MyException extends Exception {
	public MyException() {
		super("Insufficient funds, try entering a less amount");
	}
}
