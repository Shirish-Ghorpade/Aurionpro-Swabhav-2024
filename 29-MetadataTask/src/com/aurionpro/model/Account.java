package com.aurionpro.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Scanner;

public class Account {
	Connection connection = null;
	PreparedStatement preparedStatement = null;
	Scanner scanner = new Scanner(System.in);

	public void connectToDB() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "root");
			System.out.println("Success !!!!!!!!!");
			
			preparedStatement  = connection.prepareStatement("select * from accounts");
			ResultSet result = preparedStatement.executeQuery();
			
			ResultSetMetaData rsmd = result.getMetaData();

			//getting the column type
			String column_name = rsmd.getColumnTypeName(1);
			
			//getting the column type
			String column_name1 = rsmd.getColumnTypeName(2);
			
			System.out.println(column_name);
			System.out.println(column_name1);

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
