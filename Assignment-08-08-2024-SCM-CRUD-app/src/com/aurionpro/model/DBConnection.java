package com.aurionpro.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DBConnection {
	Connection connection = null;
	PreparedStatement preparedStatement = null;
	Scanner scanner = new Scanner(System.in);

	public void connectToDB() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/scm", "root", "root");
			System.out.println("Sucess !!!!!!!!!");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void addSupplier() {
		System.out.println("````````````````````ADD SUPPLIER`````````````````````````");
		System.out.println("Enter the supplier ID");
		int supplierId = scanner.nextInt();
		System.out.println("Enter the name");
		scanner.nextLine();
		String name = scanner.nextLine();
		System.out.println("Enter the contact information");
		String contactInfo = scanner.next();
		System.out.println("Enter the Address");
		scanner.nextLine();
		String address = scanner.nextLine();

		try {
			preparedStatement = connection.prepareStatement("insert into suppliers values (?,?,?,?)");
			preparedStatement.setInt(1, supplierId);
			preparedStatement.setString(2, name);
			preparedStatement.setString(3, contactInfo);
			preparedStatement.setString(4, address);
			preparedStatement.execute();
			System.out.println("Supplier data is added sucessfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void getDetailsOfSupplier() {
		System.out.println("```````````````````````DEATILS OF SUPPLIER````````````````````````````");
		try {
			preparedStatement = connection.prepareStatement("select * from suppliers");
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				System.out.println(resultSet.getInt("supplierId") + "\t" + resultSet.getString("name") + "\t"
						+ resultSet.getString("contactInfo") + "\t" + resultSet.getString("address"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void updateSupplier() {
		System.out.println("`````````````````````UPDATE SUPPLIER````````````````````````");
		System.out.println("Enter the option : ");
		System.out.println("1. Update supplier name");
		System.out.println("2. Update supplier contact information");
		System.out.println("3. Update supplier address");

		int choice = scanner.nextInt();

		System.out.println("Enter the unique supplier id");
		int responseSupplierId = scanner.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Enter the updated name");
			String responseName = scanner.nextLine();
			try {
				preparedStatement = connection.prepareStatement("Update suppliers set name = ? where supplierId = ?");
				preparedStatement.setString(1, responseName);
				preparedStatement.setInt(2, responseSupplierId);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case 2:
			System.out.println("Enter the updated contact information");
			String responseContactInfo = scanner.nextLine();
			try {
				preparedStatement = connection
						.prepareStatement("Update suppliers set contactInfo = ? where supplierId = ?");
				preparedStatement.setString(1, responseContactInfo);
				preparedStatement.setInt(2, responseSupplierId);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case 3:
			System.out.println("Enter the updated address");
			String responseAddress = scanner.nextLine();
			try {
				preparedStatement = connection
						.prepareStatement("Update suppliers set address = ? where supplierId = ?");
				preparedStatement.setString(1, responseAddress);
				preparedStatement.setInt(2, responseSupplierId);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		default:
			System.out.println("Invalid Input");
			break;
		}
	}

	public void deleteSupplier() {
		System.out.println("``````````````````````DELETE SUPPLIER``````````````````````````");
		System.out.println("Enter the supplier id that you want to delete");
		int responseSupplierId = scanner.nextInt();
		try {
			preparedStatement = connection.prepareStatement("delete from supplier where supplierId = ?");
			preparedStatement.setInt(1, responseSupplierId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void addProduct() {
		System.out.println("````````````````````ADD PRODUCT`````````````````````````");
		System.out.println("Enter the product ID");
		int productId = scanner.nextInt();
		System.out.println("Enter the name");
		scanner.nextLine();
		String name = scanner.nextLine();
		System.out.println("Enter the description");
		String description = scanner.nextLine();
		System.out.println("Enter the Supplier id");
		int ProductSupplierId = scanner.nextInt();

		try {
			preparedStatement = connection.prepareStatement("insert into products values (?,?,?,?)");
			preparedStatement.setInt(1, productId);
			preparedStatement.setString(2, name);
			preparedStatement.setString(3, description);
			preparedStatement.setInt(4, ProductSupplierId);
			preparedStatement.execute();
			System.out.println("Product data is added sucessfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void getDetailsOfProduct() {
		System.out.println("```````````````````````DEATILS OF PRODUCT````````````````````````````");
		try {
			preparedStatement = connection.prepareStatement("select * from products");
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				System.out.println(resultSet.getInt("productId") + "\t" + resultSet.getString("name") + "\t"
						+ resultSet.getString("description") + resultSet.getInt("ProductSupplierId"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void updateProduct() {
		System.out.println("`````````````````````UPDATE PRODUCT````````````````````````");
		System.out.println("Enter the option : ");
		System.out.println("1. Update product name");
		System.out.println("2. Update product description");
		System.out.println("3. Update Supplier id ");

		int choice = scanner.nextInt();

		System.out.println("Enter the unique product id");
		int responseProductId = scanner.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Enter the updated name");
			String responseName = scanner.nextLine();
			try {
				preparedStatement = connection.prepareStatement("Update products set name = ? where ProductId = ?");
				preparedStatement.setString(1, responseName);
				preparedStatement.setInt(2, responseProductId);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case 2:
			System.out.println("Enter the updated description");
			String responseDescription = scanner.nextLine();
			try {
				preparedStatement = connection
						.prepareStatement("Update suppliers set description = ? where productId = ?");
				preparedStatement.setString(1, responseDescription);
				preparedStatement.setInt(2, responseProductId);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case 3:
			System.out.println("Enter the updated supplier id ");
			String responseSupplierId = scanner.nextLine();
			try {
				preparedStatement = connection
						.prepareStatement("Update suppliers set ProductSupplierId = ? where supplierId = ?");
				preparedStatement.setString(1, responseSupplierId);
				preparedStatement.setInt(2, responseProductId);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		default:
			System.out.println("Invalid Input");
			break;
		}
	}

	public void deleteProduct() {
		System.out.println("``````````````````````DELETE PRODUCT``````````````````````````");
		System.out.println("Enter the supplier id that you want to delete");
		int responseProductId = scanner.nextInt();
		try {
			preparedStatement = connection.prepareStatement("delete from product where productId = ?");
			preparedStatement.setInt(1, responseProductId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void addOrder() {
		System.out.println("````````````````````ADD Order`````````````````````````");
		System.out.println("Enter the Order ID");
		int orderId = scanner.nextInt();
		System.out.println("Enter the Order date");
		scanner.nextLine();
		String orderDate = scanner.nextLine();
		System.out.println("Enter the supplier ID");
		int orderSupplierId = scanner.nextInt();

		try {
			preparedStatement = connection.prepareStatement("insert into products values (?,?, ?)");
			preparedStatement.setInt(1, orderId);
			preparedStatement.setString(2, orderDate);
			preparedStatement.setInt(3, orderSupplierId);
			preparedStatement.execute();
			System.out.println("Order data is added sucessfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void getDetailsOfOrder() {
		System.out.println("```````````````````````DEATILS OF Order````````````````````````````");
		try {
			preparedStatement = connection.prepareStatement("select * from Orders");
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				System.out.println(resultSet.getInt("OrderId") + "\t" + resultSet.getString("OrderDate") + "\t"
						+ resultSet.getInt("OrderSupplierId"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void updateOrder() {
		System.out.println("`````````````````````UPDATE Order````````````````````````");
		System.out.println("Enter the option : ");
		System.out.println("1. Update order date");
		System.out.println("2. Update Supplier id");

		int choice = scanner.nextInt();

		System.out.println("Enter the unique Order id");
		int responseOrderId = scanner.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Enter the updated Order date");
			String responseDate = scanner.nextLine();
			try {
				preparedStatement = connection.prepareStatement("Update Orders set name = ? where OrderId = ?");
				preparedStatement.setInt(1, responseOrderId);
				preparedStatement.setString(2, responseDate);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case 2:
			System.out.println("Enter the Supplier id ");
			int responseSupplier = scanner.nextInt();
			try {
				preparedStatement = connection
						.prepareStatement("Update suppliers set orderSupplierId = ? where productId = ?");
				preparedStatement.setInt(1, responseSupplier);
				preparedStatement.setInt(2, responseOrderId);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		default:
			System.out.println("Invalid Input");
			break;
		}
	}

	public void deleteOrder() {
		System.out.println("``````````````````````DELETE Order``````````````````````````");
		System.out.println("Enter the Order id that you want to delete");
		int responseOrderId = scanner.nextInt();
		try {
			preparedStatement = connection.prepareStatement("delete from Order where OrderId = ?");
			preparedStatement.setInt(1, responseOrderId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void addOrderDetail() {
		System.out.println("````````````````````ADD OrderDetail`````````````````````````");
		System.out.println("Enter the OrderDetail ID");
		int OrderDetailId = scanner.nextInt();
		System.out.println("Enter the Order ID");
		int orderId = scanner.nextInt();
		System.out.println("Enter the product ID");
		int productId = scanner.nextInt();
		System.out.println("Enter the quantity");
		int quantity = scanner.nextInt();
		System.out.println("Enter the price");
		int price = scanner.nextInt();

		try {
			preparedStatement = connection.prepareStatement("insert into OrderDetail values (?,?,?,?,?)");
			preparedStatement.setInt(1, OrderDetailId);
			preparedStatement.setInt(2, orderId);
			preparedStatement.setInt(3, productId);
			preparedStatement.setInt(4, quantity);
			preparedStatement.setInt(5, price);
			preparedStatement.execute();
			System.out.println("OrderDetail data is added sucessfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void getDetailsOfOrderDetail() {
		System.out.println("```````````````````````DEATILS OF OrderDetail````````````````````````````");
		try {
			preparedStatement = connection.prepareStatement("select * from order_detail");
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				System.out.println(resultSet.getInt("OrderDetailId") + "\t" + resultSet.getInt("OrderId") + "\t"
						+ resultSet.getInt("productId") + resultSet.getInt("Quantity") + resultSet.getInt("Price"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void updateOrderDetail() {
		System.out.println("`````````````````````UPDATE OrderDetail````````````````````````");
		System.out.println("Enter the option : ");
		System.out.println("1. Update quantity");
		System.out.println("2. Update price");
		System.out.println("3. Update product id");
		System.out.println("4. Update order id");

		int choice = scanner.nextInt();

		System.out.println("Enter the unique OrderDetail id");
		int responseOrderDetailId = scanner.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Enter the updated quantity");
			int responseQuantity = scanner.nextInt();
			try {
				preparedStatement = connection
						.prepareStatement("Update order_details set name = ? where OrderDetailId = ?");
				preparedStatement.setInt(1, responseQuantity);
				preparedStatement.setInt(2, responseOrderDetailId);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case 2:
			System.out.println("Enter the updated price");
			int responsePrice = scanner.nextInt();
			try {
				preparedStatement = connection
						.prepareStatement("Update order_details set price = ? where orderDetailsId = ?");
				preparedStatement.setInt(1, responsePrice);
				preparedStatement.setInt(2, responseOrderDetailId);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case 3:
			System.out.println("Enter the updated orderId");
			int  orderId= scanner.nextInt();
			try {
				preparedStatement = connection
						.prepareStatement("Update order_details set orderId = ? where orderDetailsId = ?");
				preparedStatement.setInt(1, orderId);
				preparedStatement.setInt(2, responseOrderDetailId);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case 4:
			System.out.println("Enter the productId ");
			int productId = scanner.nextInt();
			try {
				preparedStatement = connection
						.prepareStatement("");
				preparedStatement.setInt(1, productId);
				preparedStatement.setInt(2, responseOrderDetailId);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		default:
			System.out.println("Invalid Input");
			break;
		}
	}

	public void deleteOrderDetails() {
		System.out.println("``````````````````````DELETE OrderDetails``````````````````````````");
		System.out.println("Enter the order details id that you want to delete");
		int responseOrderDetailId = scanner.nextInt();
		try {
			preparedStatement = connection.prepareStatement("delete from order_details where orderDetailId = ?");
			preparedStatement.setInt(1, responseOrderDetailId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void addInventory() {
		System.out.println("````````````````````ADD inventory`````````````````````````");
		System.out.println("Enter the inventory ID");
		int inventoryId = scanner.nextInt();
		System.out.println("Enter the inventory product ID");
		int inventoryProductId = scanner.nextInt();
		System.out.println("Enter the Quantity Level");
		int quantityOnHand = scanner.nextInt();

		try {
			preparedStatement = connection.prepareStatement("insert into products values (?,?,?)");
			preparedStatement.setInt(1, inventoryId);
			preparedStatement.setInt(2, inventoryProductId);
			preparedStatement.setInt(3, quantityOnHand);
			preparedStatement.execute();
			System.out.println("Inventory data is added sucessfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void getDetailsOfInventory() {
		System.out.println("```````````````````````DEATILS OF Inventory````````````````````````````");
		try {
			preparedStatement = connection.prepareStatement("select * from inventory");
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				System.out.println(resultSet.getInt("InventoryId") + "\t" + resultSet.getInt("InventoryProductId")
						+ "\t" + resultSet.getString("QuantityOnHand"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void updateInventory() {
		System.out.println("`````````````````````UPDATE inventory````````````````````````");
		System.out.println("Enter the option : ");
		System.out.println("1. Update Quantity level");

		int choice = scanner.nextInt();

		System.out.println("Enter the unique inventory id");
		int responseInventoryId = scanner.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Enter the updated quantity level");
			int responseQuantityLevel = scanner.nextInt();
			try {
				preparedStatement = connection
						.prepareStatement("Update inventory set QuantityOnHand = ? where InventoryId = ?");
				preparedStatement.setInt(1, responseQuantityLevel);
				preparedStatement.setInt(2, responseInventoryId);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		default:
			System.out.println("Invalid Input");
			break;
		}
	}

	public void deleteInventory() {
		System.out.println("``````````````````````DELETE inventory``````````````````````````");
		System.out.println("Enter the inventory id that you want to delete");
		int responseInventoryId = scanner.nextInt();
		try {
			preparedStatement = connection.prepareStatement("delete from inventory where inventoryId = ?");
			preparedStatement.setInt(1, responseInventoryId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void allProductsAlongSupplierName() {
		try {
			preparedStatement = connection.prepareStatement(
					"select p.*, s.name as SupplierName from products as p left join suppliers as s on p.ProductSupplierID = s.SupplierID");
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				System.out.println(resultSet.getInt(1) + "\t" + resultSet.getString(2) + "\t" + resultSet.getString(3)
						+ resultSet.getInt(4) + "\t" + resultSet.getString(5));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void allOrdersWithDetails() {
		try {
			preparedStatement = connection.prepareStatement(
					"select o.*, p.name as ProductName, od.quantity as Quantity from orders as o left join order_details od on "
							+ "o.OrderID=od.OrderID left join products p on p.ProductID=od.ProductID; ");
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				System.out.println(resultSet.getInt(1) + "\t" + resultSet.getDate(2) + "\t" + resultSet.getInt(3)
						+ resultSet.getString(4) + "\t" + resultSet.getInt(5));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
