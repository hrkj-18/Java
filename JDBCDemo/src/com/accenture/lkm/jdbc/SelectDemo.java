package com.accenture.lkm.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectDemo {

	public static void main(String[] args) {

		// JDBC

		// driver database specific - jar

		try {
			Class.forName("com.mysql.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/stream";
			Connection connection = DriverManager.getConnection(url, "root", "root");

			String selectQuery = "select * from emp";

			Statement selectStmt = connection.createStatement();
			selectStmt.executeQuery(selectQuery);
			ResultSet result = selectStmt.executeQuery("select * from emp");
			System.out.println(result);

			while (result.next()) {
				int id = result.getInt("id");
				String name = result.getString(2);
				String location = result.getString(3);
				System.out.println(id + "  " + name + "  " + location);
			}

			selectStmt.close();
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
