package com.aurionpro.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class BatchProcessing {
	Connection connection = null;
	Statement statement = null;
	PreparedStatement preparedStatement = null;
	Scanner scanner = new Scanner(System.in);

	public void connectToDB() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db10", "root", "root");
			System.out.println("Sucess !!!!!!!!!");
			connection.setAutoCommit(false);

			preparedStatement = connection.prepareStatement("INSERT INTO students VALUES(?, ?, ?)");
			while (true) {
				System.out.println("Enter the roll number");
				int rollNo = scanner.nextInt();
				System.out.println("Enter your name");
				scanner.nextLine();
				String name = scanner.nextLine();
				System.out.println("Enter the percentage");
				double percentage = scanner.nextDouble();
				preparedStatement.setInt(1, rollNo);
				preparedStatement.setString(2, name);
				preparedStatement.setDouble(3, percentage);
				preparedStatement.addBatch();

				scanner.nextLine();
				System.out.println("Enter Y/N to continue");
				String choice = scanner.nextLine();
				if (choice.toLowerCase().equals("n")) {
					break;
				}
			}
			int[] batchResult = preparedStatement.executeBatch();
			connection.commit();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		/*
		 * 
		 * statement = connection.createStatement();
		 * 
		 * statement.addBatch("INSERT INTO students VALUES(10, 'Rohan', 80.9)");
		 * statement.addBatch("INSERT INTO students VALUES(11, 'Rohit', 85.9)");
		 * statement.addBatch("INSERT INTO students VALUES(12, 'mohit', 90.9)");
		 * 
		 * int[] result = statement.executeBatch(); connection.commit();
		 * System.out.println("Batch execute sucessfully");
		 * 
		 * } catch (ClassNotFoundException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); } catch (SQLException e) { // TODO Auto-generated catch
		 * block e.printStackTrace(); }
		 */

	}
}
