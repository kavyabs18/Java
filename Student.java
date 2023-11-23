package com.kodnest.constructor;

public class Student {
	String name;
	int age;
	float marks;
	public Student(String a, int b, float c) {
		name = a;
		age = b;
		marks = c;
	}
	void study() {
		System.out.println("Studying");
	}
}
