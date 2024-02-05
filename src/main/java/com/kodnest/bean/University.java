package com.kodnest.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class University {
	int Uid;
	String Uname;
	@Autowired
	Student student;
	
	public University() {
		super();
		System.out.println("0-argument");
		// TODO Auto-generated constructor stub
	}
	public University(int uid, String uname, Student student) {
		super();
		System.out.println("1-argument");
		Uid = uid;
		Uname = uname;
		this.student = student;
	}
	
	@Override
	public String toString() {
		return "University [Uid=" + Uid + ", Uname=" + Uname + ", Student=" + student + "]";
	}
	public int getUid() {
		System.out.println("getter-Uid");
		return Uid;
	}
	public void setUid(int uid) {
		System.out.println("setter-Uid");
		Uid = uid;
	}
	public String getUname() {
		System.out.println("getter-Uname");
		return Uname;
	}
	public void setUname(String uname) {
		System.out.println("setter-Uname");
		Uname = uname;
	}
	public Student getStudent() {
		System.out.println("getter-Student");
		return student;
	}
	public void setStudent(Student student) {
		System.out.println("setter-Student");
		this.student = student;
	}
}
