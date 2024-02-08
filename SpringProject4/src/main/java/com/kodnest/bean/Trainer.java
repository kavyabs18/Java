package com.kodnest.bean;

public class Trainer {
	int Id;
	String Name;
	
	public Trainer() {
		super();
		System.out.println("Constructor without parameter");
		// TODO Auto-generated constructor stub
	}
	public Trainer(int id, String name) {
		super();
		System.out.println("Constructor with parameter");
		Id = id;
		Name = name;
	}
	
	@Override
	public String toString() {
		return "Trainer [Id=" + Id + ", Name=" + Name + "]";
	}
	public int getId() {
		System.out.println("getter-Id");
		return Id;
	}
	public void setId(int id) {
		System.out.println("setter-Id");
		Id = id;
	}
	public String getName() {
		System.out.println("getter-Name");
		return Name;
	}
	public void setName(String name) {
		System.out.println("setter-Name");
		Name = name;
	}
}
