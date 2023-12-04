package com.kodnest.oops;

public class DemoShape {
	public static void main(String[] args) {
		
		
		Shape s;
		
		Shape c = new Circle();
		c.draw();
		
		s=c;
		s.draw();
		
		
		//upcasting
		s = new Rectangle();// Rectangle(child) is behaving like a parent class
		s = new Square();
		s.draw();
		s.draw();
		
		//downcasting
		Shape x = new Circle(); 
		((Circle) x).draw(); //if no statement(draw method is absent) is present in Shape class
	}
}
