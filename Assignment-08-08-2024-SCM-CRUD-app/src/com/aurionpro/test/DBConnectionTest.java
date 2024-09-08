package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.DBConnection;

public class DBConnectionTest {
	public static void main(String[] args) {

		DBConnection dbConnection = new DBConnection();
		dbConnection.connectToDB();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome to the Supply Chain Management System");

		boolean exitOption = false;
		while (!exitOption) {
			System.out.println("CRUD on supplier");
			System.out.println("1. Add supplier data");
			System.out.println("2. Get supplier data");
			System.out.println("3. Update supplier data");
			System.out.println("4. Delete supplier data");
			System.out.println("5. Exit");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				dbConnection.addSupplier();
				break;
			case 2:
				dbConnection.getDetailsOfSupplier();
				break;
			case 3:
				dbConnection.updateSupplier();
				break;
			case 4:
				dbConnection.deleteSupplier();
				break;
			case 5:
				exitOption = true;
				break;
			default:
				System.out.println("Invalid");
				break;
			}
		}
		exitOption = false;
		while (!exitOption) {
			System.out.println("CRUD on Product");

			System.out.println("1. Add product data");
			System.out.println("2. Get product data");
			System.out.println("3. Update product data");
			System.out.println("4. Delete product data");
			System.out.println("5. Exit");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				dbConnection.addProduct();
				break;
			case 2:
				dbConnection.getDetailsOfProduct();
				break;
			case 3:
				dbConnection.updateProduct();
				break;
			case 4:
				dbConnection.deleteProduct();
				break;
			case 5:
				exitOption = true;
				break;
			default:
				System.out.println("invalid");
				break;
			}
		}
		exitOption = false;
		while (!exitOption) {

			System.out.println("CRUD on Order");
			System.out.println("1. Add order data");
			System.out.println("2. Get order data");
			System.out.println("3. Update order data");
			System.out.println("4. Delete order data");
			System.out.println("5. Exit");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				dbConnection.addOrder();
				break;
			case 2:
				dbConnection.getDetailsOfOrder();
				break;
			case 3:
				dbConnection.updateOrder();
				break;
			case 4:
				dbConnection.deleteOrder();
				break;
			case 5:
				exitOption = true;
				break;
			default:
				System.out.println("invalid");
				break;
			}
		}
		exitOption = false;
		while (!exitOption) {

			System.out.println("CRUD on Order details");
			System.out.println("1. Add order details data");
			System.out.println("2. Get order details data");
			System.out.println("3. Update order details data");
			System.out.println("4. Delete order details data");
			System.out.println("5. Exit");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				dbConnection.addOrderDetail();
				break;
			case 2:
				dbConnection.getDetailsOfOrderDetail();
				break;
			case 3:
				dbConnection.updateOrderDetail();
				break;
			case 4:
				dbConnection.deleteOrderDetails();
				break;
			case 5:
				exitOption = true;
				break;
			default:
				System.out.println("invalid");
				break;
			}
		}
		exitOption = false;
		while (!exitOption) {
			System.out.println("CRUD on inventory");
			System.out.println("1. Add Inventory data");
			System.out.println("2. Get Inventory data");
			System.out.println("3. Update Inventory data");
			System.out.println("4. Delete Inventory data");
			System.out.println("5. Exit");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				dbConnection.addInventory();
				break;
			case 2:
				dbConnection.getDetailsOfInventory();
				break;
			case 3:
				dbConnection.updateInventory();
				break;
			case 4:
				dbConnection.deleteInventory();
				break;
			case 5:
				exitOption = true;
				break;
			default:
				System.out.println("invalid");
				break;
			}
		}
		//
		// System.out.println("List all products along with their supplier names");
		// System.out.println("Get all orders with their details (including product
		// names and quantities)");
		// System.out.println("Find all suppliers who have supplied a specific
		// product");
		// System.out.println("List all products and their current inventory levels");
		// System.out.println("Find all orders placed within the last month");
		// System.out.println("Get total quantity ordered for each product");
		// System.out.println("Retrieve all orders along with the total amount spent for
		// each order");
		// System.out.println("Find products supplied by more than one supplier");
		// System.out.println("Get the average inventory level for each product");
		// System.out.println("List suppliers who have not supplied any products");
		//
	}
}
