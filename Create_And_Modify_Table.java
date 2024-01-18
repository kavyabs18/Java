package com.kodnest.JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Create_And_Modify_Table {
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

//		Creation of Statement
		Statement stmt = connection.createStatement();

//		Create Table
//		stmt.execute("create table student(ID int, NAME varchar(30))");
		
		
//		Insert Records
		String a = "INSERT INTO STUDENT VALUES(1, 'JOHN')";
//		int executeUpdate = stmt.executeUpdate(a);
//		System.out.println("Success "+executeUpdate);
		
		
//		Update Records
		String b = "UPDATE STUDENT SET NAME='JACK' WHERE ID=2";
//		int executeUpdate = stmt.executeUpdate(b);
//		System.out.println("Success"+executeUpdate);
		
		
//		Delete Records
		String c = "Delete from student where id=5";
//		boolean execute = stmt.execute(c);
//		System.out.println("Success "+execute);
		
//		Display Records
		String d = "Select * from student where id=1";
		ResultSet rs = stmt.executeQuery(d);
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2));			
		}
	}
}
