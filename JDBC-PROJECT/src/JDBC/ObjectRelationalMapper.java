package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Random;

public class ObjectRelationalMapper {

	public static void main(String[] args) throws SQLException {
		// INITIALIZATION OF QUERY STRINGS
		String queries[] = { "SELECT * FROM PRODUCTS", "SELECT * FROM PRODUCTS WHERE PRODUCT_ID = 1",
				"SELECT * FROM PRODUCTS WHERE PRODUCT_NAME = 'SWW'" };

		int rnd = new Random().nextInt(queries.length);
		String queryString = queries[rnd];
		
		ArrayList<Product> productsArrayList = getProducts(queryString);
		// FOR EACH LOOP
		System.out.println("QUERY: " + queryString);
		for (Product product : productsArrayList) {
			product.displayDetails();
		}
	}
	// STRING PARAMETER ON METHOD
	public static ArrayList<Product> getProducts(String queryString) throws SQLException {
		// DB CONNECTION
		Connection myConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/JBEDB", "root", "mysql");
		Statement selecStatement = myConnection.createStatement();

		ResultSet resultSet = selecStatement.executeQuery(queryString);
		// PASSING ROWS FROM DB TO ARRAY LIST
		ArrayList<Product> productsArrayList = new ArrayList<Product>();
		while (resultSet.next()) {
			Product product = new Product(resultSet.getInt("PRODUCT_ID"), resultSet.getString("PRODUCT_NAME"),
					resultSet.getFloat("PRICE"));
			productsArrayList.add(product);
		}

		return productsArrayList;

	}

}

class Product {
	public int productId;
	public String productName;
	public float price;
	// CONSTRUCTOR
	public Product(int productId, String productName, float price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}
	// DISPLAY FUNCTION
	public void displayDetails() {
		
		System.out.println(productId + "  >  " + productName + "  >  " + price);
	}

}
