package com.kodnest.demo_exception;

class Demo_Exception {
	public static void main(String[] args) {
		System.out.println("main-start");
		method1();
		System.out.println("main-stop");
	}
	
	static void method1() {
		System.out.println("method-1 start");
		method2();
		System.out.println("method-1 stop");
	}
	
	static void method2() {
		System.out.println("method-2 start");
			method3();
		System.out.println("method-2 stop");
	}
	
	static void method3() {
		System.out.println("method-3 start");
		try {
			System.out.println(3/0);			
		} catch (Exception e) {
			System.out.println("Exception caught");
		}
		System.out.println("method-3 stop");
	}
}
