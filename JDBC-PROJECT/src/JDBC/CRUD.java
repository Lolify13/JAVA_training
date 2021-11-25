package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CRUD {
	public Connection connect() throws SQLException {
		Connection myConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/JBEDB", "root", "mysql");
		return myConnection;
	}
	void insert() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("\n\nINSERT PRODUCT\nPID : ");
		int productId = Integer.parseInt(scanner.nextLine());
		System.out.print("\nNAME : ");
		String productName = scanner.nextLine();
		System.out.print("\nPRICE : ");
		float price = Float.parseFloat(scanner.nextLine());

		try {

			

			Statement insertStatement = connect().createStatement();

			System.out.println("EXECUTING QUERY");

			String queryString = "INSERT INTO PRODUCTS VALUES (" + productId + ",'" + productName + "'," + price + ")";
			int rowCount = insertStatement.executeUpdate(queryString);
			if (rowCount != 0) {
				System.out.println("Inserted: " + rowCount);

			} else {
				System.out.println("No rows.");
			}

		} catch (SQLException sqlException) {
			System.out.println("DATABASE CONNECTION ISSUE " + sqlException);
		}

	}

	void delete() {

		Scanner scanner = new Scanner(System.in);
		System.out.print("\n\nDELETE PRODUCT\nProduct to delete (ID) : ");
		int productId = Integer.parseInt(scanner.nextLine());
		try {

			Statement deleteStatement = connect().createStatement();

			String queryString = "DELETE FROM PRODUCTS WHERE PRODUCT_ID = " + productId;
			int rowCount = deleteStatement.executeUpdate(queryString);

			if (rowCount != 0) {
				System.out.println("SUCCESSFULLY DELETED " + rowCount + " ROW/S");
			} else {
				System.out.println("No Rows Deleted!");
			}
		} catch (SQLException sqlException) {
			System.out.println("DATABASE CONNECTION ISSUE " + sqlException);
		}
	}

	void update() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("\n\nUPDATE PRODUCT NAME\nPID : ");
		int productId = Integer.parseInt(scanner.nextLine());
		System.out.print("\nNEW NAME : ");
		String newproductName = scanner.nextLine();

		try {

			Statement updateStatement = connect().createStatement();

			System.out.println("EXECUTING QUERY");
			String queryString = "UPDATE PRODUCTS SET PRODUCT_NAME = '" + newproductName +"' WHERE PRODUCT_ID = '" +productId+ "'" ;
			int rowCount = updateStatement.executeUpdate(queryString);

			if (rowCount != 0) {
				System.out.println("Updated : " + rowCount);
			} else {
				System.out.println("No Rows Upated!");
			}

		} catch (SQLException sqlException) {
			System.out.println("DATABASE CONNECTION ISSUE " + sqlException);
		}

	}

	void select() {

		try {

			Statement selecStatement = connect().createStatement();

			ResultSet resultSet = selecStatement.executeQuery("SELECT * FROM PRODUCTS");
			System.out.println("\n\nPRODUCTS TABLE \n");

			while (resultSet.next()) {
				int productId = resultSet.getInt("PRODUCT_ID");
				String productName = resultSet.getString("PRODUCT_NAME");
				float price = resultSet.getFloat("PRICE");
				System.out.println(productId + " " + productName + " - " + price);
			}

		} catch (SQLException sqlException) {
			System.out.println("DATABASE CONNECTION ISSUE " + sqlException);
		}
	}

}
