package com.kodnest.Hibernate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Demo {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Scanner scan = new Scanner(System.in);
	Student s = new Student();
	
	System.out.println("User enter the name");
	s.setName(scan.nextLine());
	System.out.println("User enter the age");
	s.setAge(scan.nextInt());
	
//	loading the Driver
	Class.forName("com.mysql.cj.jdbc.Driver");
	
//	Connection Information
	String url = "jdbc:mysql://localhost/kodnestjdbc";
	String username = "root";
	String password = "Ak47@dvgkar";
	
//	Establishing Connection
	Connection connection = DriverManager.getConnection(url, username, password);
	System.out.println(connection+" Connection Success");
	
//	Creation of Statement
	Statement stmt = connection.createStatement();
	
//	Create Table
//	String table = "create table students(NAME varchar(30), AGE int)";
//	stmt.execute(table);
//	System.out.println("Table created");
	
//	Insert value
	String sql = "insert into students values(?,?)";
	String name =s.getName();
	int age = s.getAge();
	
	
//	Creating the PreparedStatement
	PreparedStatement statement = connection.prepareStatement(sql);
	
	statement.setString(1, name);
	statement.setInt(2, age);
	int executeUpdate = statement.executeUpdate();
	if(executeUpdate>0) {
		System.out.println("Insertion Success");
	}
	else {
		System.out.println("Insertion Failed");
	}
}
}

class Student{
	public Student() {
		super();
	}
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	String name;
	int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}