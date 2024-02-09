package com.kodnest.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBC_CRUD_operations {
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
		System.out.println("User enter the value");
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("User please enter the number to start program");
			System.out.println("=============================");
			System.out.println("1 -  Insert");
			System.out.println("2 -  Update");
			System.out.println("3 -  Delete");
			System.out.println("4 -  Display");
			System.out.println("Any other number to stop the program");
			System.out.println("=============================");
			int n = scan.nextInt();
			switch (n) {
				case 1: System.out.println("Enter the ID");
						int id = scan.nextInt();
						scan.nextLine(); 	//buffer statement
						System.out.println("Enter the Name");
						String name = scan.nextLine();
						ModifyTable.Insert(url,username,password,id,name);
						break;
			
				case 2: System.out.println("User enter new Name to Update");
						String newname = scan.next();
						scan.nextLine();
						System.out.println("User enter the ID where to Update");
						int newid = scan.nextInt();
						ModifyTable.Update(url,username,password,newname,newid);
						break;
			
				case 3: System.out.println("Enter the ID");
						int id1 = scan.nextInt();
						ModifyTable.Delete(url,username,password,id1);
						break;
						
				case 4: System.out.println("Enter the ID");
						int targetId = scan.nextInt(); // Replace with the desired ID
						ModifyTable.Display(url, username, password,targetId);
						break;
						
				default: return;
			}
		}
	}
}

class ModifyTable {
	public static void Insert(String url, String username, String password, int id, String name) throws SQLException, ClassNotFoundException {
		
//		Executing the SQL Statements
//		Insert Records
		String sql = "INSERT INTO STUDENTS VALUES(?, ?)";
		
		
//		Establishing Connection
		Connection connection = DriverManager.getConnection(url, username, password);
		
//		Creating the Statement
		PreparedStatement statement = connection.prepareStatement(sql);
		
		statement.setInt(1, id);
		statement.setString(2, name);
		int executeUpdate = statement.executeUpdate();
		if(executeUpdate>0) {
			System.out.println("Insertion Success");			
		}
		else {
			System.out.println("Insertion Failed");
		}
	}
	
	public static void Update(String url, String username, String password, String newname, int newid) throws ClassNotFoundException, SQLException {
		
//		Update Record
		String sql = "UPDATE STUDENTS SET NAME=? WHERE ID=?";
		
//		Establishing Connection
		Connection connection = DriverManager.getConnection(url, username, password);
		
//		Creating the Statement
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setInt(2, newid);
		statement.setString(1, newname);
		
		int executeUpdate = statement.executeUpdate();
		if(executeUpdate>0) {
			System.out.println("Updation Success");			
		}
		else {
			System.out.println("Updation Failed");
		}
	}

	public static void Delete(String url, String username, String password, int id) throws ClassNotFoundException, SQLException {
//		Delete Records
		String sql = "DELETE FROM STUDENTS where id=?";
		
//		Establishing Connection
		Connection connection = DriverManager.getConnection(url, username, password);
		
		
//		Creating the Statement
		PreparedStatement statement = connection.prepareStatement(sql);
		
		statement.setInt(1, id);
		int executeUpdate = statement.executeUpdate();
		if(executeUpdate>0) {
			System.out.println("Deletion Success");			
		}
		else {
			System.out.println("Deletion Failed");
		}
	}
	
	public static void Display(String url, String username, String password, int targetId) throws ClassNotFoundException, SQLException {

       // ID for which you want to retrieve the record

       // SQL query to retrieve a record by ID
       String query = "SELECT * FROM students WHERE id = ?";

       try (
           // Establishing the connection
           Connection connection = DriverManager.getConnection(url, username, password);
           
           // Creating a PreparedStatement
           PreparedStatement preparedStatement = connection.prepareStatement(query)
       ) {
           // Setting the ID parameter
           preparedStatement.setInt(1, targetId);
           
           // Executing the query and getting the result set
           try (ResultSet resultSet = preparedStatement.executeQuery()) {
               // Displaying the record
               if (resultSet.next()) {
                   int id = resultSet.getInt("id");
                   String name = resultSet.getString("name");
                   //int age = resultSet.getInt("age");

                   System.out.println("ID: " + id + ", Name: " + name );
               } else {
                   System.out.println("No record found with ID: " + targetId);
               }
           }
       } catch (SQLException e) {
           e.printStackTrace();
       }
	}
}
