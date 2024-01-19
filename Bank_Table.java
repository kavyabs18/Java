package com.kodnest.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Bank_Table {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("JDBC");
		
//		loading the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
//		Connection Information
		String url = "jdbc:mysql://localhost/kodnestjdbc";
		String username = "root";
		String password = "Ak47@dvgkar";
		
		
//		insert records
//		String sql1 = "insert into bank values(1, 'James', 10000)";
//		String sql2 = "insert into bank values(2, 'Jack', 20000)";
//		String sql3 = "insert into bank values(3, 'Ria', 30000)";
//		String sql4 = "insert into bank values(4, 'Riyan', 40000)";
//		String sql5 = "insert into bank values(5, 'Anish', 50000)";
		
//		update records
		String sql1 = "update bank set balance=balance-5000 where ac_no=1";
		String sql2 = "update bank set balance=balance+5000 where ac_no=2";
		
		Connection connection=null;
		try {
//			Establishing Connection
			connection = DriverManager.getConnection(url, username, password);
			connection.setAutoCommit(false);
			
//			Statement Creation
			Statement stmt = connection.createStatement();
			stmt.addBatch(sql1);
			stmt.addBatch(sql2);
			stmt.executeBatch();
			connection.commit();
			System.out.println("Transaction Success");
		}
		catch (Exception e) {
			connection.rollback();
			System.out.println("Transaction Failed");
		}
	}
}
