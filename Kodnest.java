package com.kodnest.array;

import java.util.Scanner;

class Employee{
	String name;
	int age;
	
	
	//constructor with 2 parameters
	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

class Kodnest {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("User please enter the number of Employee");
	int size = scan.nextInt();
	
	//Create an Employee Array
	Employee e[] = new Employee[size];
	
	//Read Employee Details
	for(int i=0; i<e.length; i++) {
		System.out.println("User please enter the Details of Employee : "+(i+1));
		System.out.print("Employee Name - ");
		String name = scan.next();
		System.out.print("Employee Age - ");
		int age = scan.nextInt();
		e[i] = new Employee(name,age);
	}
	
	//Display Employee Details
	System.out.println("Employee details are :");
	for(int i=0; i<e.length; i++) {
		System.out.print(e[i].name+"  ");
		System.out.println(e[i].age);
	}
	
}
}
