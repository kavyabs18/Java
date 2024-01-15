package com.kodnest.data_structures;

public class POJO {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setName("Kavya");
		e.setAge(22);
		e.setGender("Female");
		System.out.println(e.name);
		System.out.println(e.age);
		System.out.println(e.getGender());
	}
}
class Employee{
	String name = null;
	public int age;
	private String gender;
	public Employee() {
		//Not Compulsory
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
