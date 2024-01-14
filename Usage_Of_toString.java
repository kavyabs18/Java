package com.kodnest.Collections_Framework;

class Student{
	int age;
	String name;
	public Student(int age, String name) {
		this.age = age;
		this.name = name;		
	}
	public String toString() {
		return "Student{name:"+name+", age: "+age+"}";
	}
}

public class Usage_Of_toString {
	public static void main(String[] args) {
		Student student = new Student(10, "Jhon");
		System.out.println(student);
	}
}
