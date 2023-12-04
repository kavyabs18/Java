package com.kodnest.oops;

public class Shape {
	void draw() {
		System.out.println("Drawing a Shape");
	}
}

class Circle extends Shape{
	void draw() {
		System.out.println("Drawing a Circle");
	}
}

class Rectangle extends Shape{
	void draw() {
		System.out.println("Drawing a Rectangle");
	}
}

class Square extends Shape{
	void draw() {
		System.out.println("Drawing a Square");
	}
}
