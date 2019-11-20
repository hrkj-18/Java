package com.accenture.lkm.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectToDatabase {

	public static void main(String[] args) {

		// JDBC

		// driver database specific - jar

		try {
			Class.forName("com.mysql.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/stream";
			Connection connection = DriverManager.getConnection(url, "root", "root");

			String insertQuery = "insert into person(name,age) values('Emp97', 22)";
			//String deleteQuery = "delete from emp where id = 99";

			Statement insertStmt = connection.createStatement();
			int insertedRows = insertStmt.executeUpdate(insertQuery);
			System.out.println("Inserted rows : " + insertedRows);

			//Statement deleteStmt = connection.createStatement();
			//int deletedRows = deleteStmt.executeUpdate(deleteQuery);
			//System.out.println("Deleted rows : " + deletedRows);

			insertStmt.close();
			//deleteStmt.close();
			connection.close();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
