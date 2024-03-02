package com.kodnest.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ProjectConnection {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("JDBC");
		
//		loading the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
//		Connection Information
		String url = "jdbc:mysql://localhost/kodnestjdbc";
		String username = "root";
		String password = "Ak47@dvgkar";
		
//		Establishing Connection
		Connection connection = DriverManager.getConnection(url, username, password);
		System.out.println(connection+" Connection Success");
		
		Statement stmt = connection.createStatement();
		stmt.execute("create table student(ID int, NAME varchar(30))");
		System.out.println("Success");
	}
}
