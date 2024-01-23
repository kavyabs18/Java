package com.kodnest.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Display_Using_Scanner {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		loading the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
//		Connection Information
		String url = "jdbc:mysql://localhost/kodnestjdbc";
		String username = "root";
		String password = "Ak47@dvgkar";
		
// 		ID for which you want to retrieve the record
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the ID");
		int targetId = scan.nextInt();
		
// 		SQL query to retrieve a record by ID
		String sql = "Select * from student where id=?";
		
		try(
//		Establishing Connection
		Connection connection = DriverManager.getConnection(url, username, password);
		
//		PrepareStatement() invocation
		PreparedStatement statement = connection.prepareStatement(sql);
		){
// 			Setting the ID parameter
			statement.setInt(1, targetId);
//			Executing the query and getting the result set
			try(ResultSet rs = statement.executeQuery()){
				// Displaying the record
				if(rs.next()) {
					int id = rs.getInt("ID");
					String name = rs.getString("NAME");
					System.out.println("Student ID = "+id+" Name = "+name);;			
				}
				else {
					System.out.println("Not record found with id : "+targetId);
				}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		}
	}
}