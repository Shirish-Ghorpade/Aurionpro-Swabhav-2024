package com.aurionpro.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DbConnection {
	Connection connection = null;
	Statement statement = null;
	PreparedStatement preparedStatement = null;
	Scanner scanner = new Scanner(System.in);

	public void connectToDb() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db10", "root", "root");
			statement = connection.createStatement();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

	public void getStudentDetails() {
		try {
			ResultSet result = statement.executeQuery("select * from students");

			while (result.next()) {
				System.out.println(result.getInt("roll_no") + " " + result.getString(2) + " " + result.getDouble(3));
			}

			System.out.println("Success");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void addStudent() {
		System.out.println("----------------------------ADD STUDENT------------------------");
		System.out.println("Enter the roll number");
		int rollNumber = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter the name");
		String name = scanner.nextLine();
		System.out.println("Enter the percentage");
		double percentage = scanner.nextDouble();
		try {
			preparedStatement = connection.prepareStatement("Insert into students values (?,?,?)");
			preparedStatement.setInt(1, rollNumber);
			preparedStatement.setString(2, name);
			preparedStatement.setDouble(3, percentage);
			preparedStatement.execute();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public void updateStudent() {
		System.out.println("---------------------UPDATE STUDENT DATA---------------------");
		System.out.println("Enter the roll number");
		int rollNumber = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter the updated name");
		String name = scanner.nextLine();
		try {
			preparedStatement = connection.prepareStatement("update students set name = ? where roll_no = ?");
			preparedStatement.setString(1, name);
			preparedStatement.setInt(2, rollNumber);
			preparedStatement.execute();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
