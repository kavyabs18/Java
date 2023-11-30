package com.kodnest.oops;

class A {
	//inbuilt method with zero parameter is called by default
	//super method is calling to its parent (object class) by default
	int age;
}

class B extends A {
	public B() {
		//super method call is invoking to its parent (class A) by default
	}
	String name;
}

class Solution {
	public static void main(String[] args) {
		B b = new B();
		System.out.println(b.name);
		System.out.println(b.age);
	}
}
