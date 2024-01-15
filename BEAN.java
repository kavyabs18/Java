package com.kodnest.data_structures;

import java.io.Serializable;

public class BEAN implements Serializable {
	public static void main(String[] args) {
		Employee1 e = new Employee1();
		e.setName("Kavya");
		e.setAge(22);
		e.setGender("Female");
		System.out.println(e.getName());
		System.out.println(e.getAge());
		System.out.println(e.getGender());
	}
}
class Employee1{
	private String name = null;
	private int age;
	private String gender;
	public Employee1() {
		//compulsory
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getGender() {
		return gender;
	}
}
