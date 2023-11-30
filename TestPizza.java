package com.kodnest.oops;

class Pizza{
	//constructor
	public Pizza() {
		System.out.println("Making a basic pizza");
	}
}

class Margerita extends Pizza {
	//constructor
	public Margerita() {
		//super method call by default
		System.out.println("Adding cheese on top");
	}
}

public class TestPizza {
	public static void main(String[] args) {
		Margerita pizza = new Margerita();
	}
}
