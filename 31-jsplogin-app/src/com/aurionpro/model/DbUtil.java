package com.aurionpro.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.sun.org.apache.regexp.internal.RE;
import com.sun.swing.internal.plaf.basic.resources.basic;

public class DbUtil {

	Connection connection = null;
	Statement statement = null;
	PreparedStatement preparedStatement = null;
	static DbUtil dbUtil = null;

	private DbUtil() {

	}

	public static DbUtil getDbUtil() {
		if (dbUtil == null) {
			return new DbUtil();
		}
		return dbUtil;
	}

	public void connectToDb() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/userdb", "root", "root");
			statement = connection.createStatement();
			System.out.println("Connected sucessfully");

		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("Error connecting to the database");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public ResultSet getAllUsers() {
		ResultSet dbUsers = null;
		try {
			dbUsers = statement.executeQuery("select * from users");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dbUsers;
	}
	
	public boolean validateUser(String username, String password) {
		ResultSet dbUsers = getAllUsers();
		try {
			while(dbUsers.next()) {
				if(dbUsers.getString("username").equals(username)) {
					if(dbUsers.getString("password").equals(password)) {
						return true;
					}
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;	
	}
}
