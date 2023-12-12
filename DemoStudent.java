package com.kodnest.oops;

public class DemoStudent {
	public static void main(String[] args) {
		StudentActivities s;
		s = new CivilStudent();
		s.study();
		s.sleep();
		
		s = new CommerceStudent();
		s.study();
		s.sleep();
	}
}
