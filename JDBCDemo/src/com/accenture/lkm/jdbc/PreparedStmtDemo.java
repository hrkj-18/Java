package com.accenture.lkm.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStmtDemo {

	public static void main(String[] args) {
		// JDBC

		// driver database specific - jar
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter id : ");
		int id = sc.nextInt();

		System.out.println("Enter name : ");
		String name = sc.next();

		System.out.println("Enter location : ");
		String location = sc.next();

		try {
			Class.forName("com.mysql.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/stream";
			Connection connection = DriverManager.getConnection(url, "root", "root");

			String insertQuery = "insert into emp values(?,?,?)";

			PreparedStatement insertStmt = connection.prepareStatement(insertQuery);

			insertStmt.setInt(1, id);
			insertStmt.setString(2, name);
			insertStmt.setString(3, location);

			int insertedRows = insertStmt.executeUpdate();

			System.out.println("Inserted rows : " + insertedRows);

			sc.close();
			insertStmt.close();
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
