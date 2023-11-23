package com.kodnest.constructor;

public class Application {
public static void main(String[] args) {
	Student s = new Student("Shiv", 46, 46.7f);
	System.out.println(s.name);
	System.out.println(s.age);
	System.out.println(s.marks);
	s.study();
}
}
