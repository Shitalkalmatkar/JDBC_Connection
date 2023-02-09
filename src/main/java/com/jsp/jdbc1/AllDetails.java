package com.jsp.jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AllDetails {
	public static void main(String[] args) {

		// ToDo Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/jspider";
		String username = "root";
		String password = "root";
		String sql = "SELECT * FROM student";

		// ToDo Auto generated method stub

		try {
			// load register the driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Establish connection
			Connection connection = DriverManager.getConnection(url, username, password);

			// Create Statement
			Statement statement = connection.createStatement();

			// Execute statement
			ResultSet resultset = statement.executeQuery(sql);
			while (resultset.next()) {
				System.out.println(resultset.getInt(1));
				System.out.println(resultset.getString(2));
				System.out.println(resultset.getString(3));
				System.out.println("======================================");
			}

			// Close the Statement
			connection.close();
			System.out.println("all good");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
