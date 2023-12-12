package com.kodnest.oops;

public interface StudentActivities {
	void study();
	void sleep();
	void eat();
}

class CivilStudent implements StudentActivities{

	@Override
	public void study() {
		System.out.println("Civil Student Studying");
		
	}

	@Override
	
	public void sleep() {
		System.out.println("Civil Student Sleeping");
		
	}

	@Override
	public void eat() {
		System.out.println("Civil Student Eating");
		
	}
	
}

class CommerceStudent implements StudentActivities{

	@Override
	public void study() {
		System.out.println("Commerce Student Studying");
		
	}

	@Override
	public void sleep() {
		System.out.println("Commerce Student Sleeping");
		
	}

	@Override
	public void eat() {
		System.out.println("Commerce Student Eating");
		
	}
	
}