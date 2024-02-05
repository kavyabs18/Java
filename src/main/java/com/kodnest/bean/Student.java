package com.kodnest.bean;

public class Student {
	int Id;
	String Name;
	
	public Student() {
		super();
		System.out.println("0-argument");
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name) {
		super();
		System.out.println("1-argument");
		Id = id;
		Name = name;
	}
	
	public int getId() {
		System.out.println("getter-id");
		return Id;
	}
	public void setId(int id) {
		System.out.println("setter-id");
		Id = id;
	}
	public String getName() {
		System.out.println("getter-name");
		return Name;
	}
	public void setName(String name) {
		System.out.println("setter-name");
		Name = name;
	}
	
	@Override
	public String toString() {
		return "Student [Id=" + Id + ", Name=" + Name + "]";
	}
}
