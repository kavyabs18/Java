package com.kodnest.bean;

public class Laptop {
	String Name;
	String Color;
	
	public Laptop() {
		super();
		System.out.println("0-parameterized constructor");
	}
	public Laptop(String name, String color) {
		super();
		Name = name;
		Color = color;
		System.out.println("Parameterized constructor");
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
		System.out.println("setter-name");
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
		System.out.println("setter-color");
	}
	
	@Override
	public String toString() {
		return "Laptop [Name=" + Name + ", Color=" + Color + "]";
	}
}
