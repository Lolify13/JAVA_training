//it's me, kebs~
package com.gbs;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Banking {

	public Connection connect() throws SQLException {
		Connection myConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/JBEDB", "root", "mysql");
		return myConnection;
	}

	void createAccount() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("\nCREATE ACCOUNT\n=============================");
		System.out.print("\n\nUSERNAME : ");
		String username = scanner.nextLine();
		System.out.print("\nPASSWORD: ");
		String password = scanner.nextLine();
		System.out.print("\nCONTACT NO.: ");
		String contact = scanner.nextLine();
		System.out.print("\nAMOUNT TO BE DEPOSITED: ");
		Double amount = Double.parseDouble(scanner.nextLine());
		System.out.println("\nCREATING ACCOUNT PLEASE WAIT...\n=============================");

		try {

			Statement insertStatement = connect().createStatement();

			String queryString = "INSERT INTO USERS(USER_NAME,PASSWORD,CREATION_DATE,TOTAL_BALANCE,CONTACT_NUMBER) VALUES ("
					+ "'" + username + "','" + password + "',now()," + amount + ",'" + contact + "'" + ")";
			int rowCount = insertStatement.executeUpdate(queryString);
			if (rowCount != 0) {
				System.out.println("SUCCESSFULLY CREATED!");

			} else {
				System.out.println("No rows.");
			}

		} catch (SQLException sqlException) {
			System.out.println("DATABASE CONNECTION ISSUE " + sqlException);
		}

		selectCreatedAccount(username);

	}

	void login() {

		Scanner scanner = new Scanner(System.in);
		System.out.print("\nLOGIN\n=============================");
		System.out.print("\n\nUsername : ");
		String username = scanner.nextLine();
		System.out.print("\nPassword : ");
		String password = scanner.nextLine();
		System.out.println("\nLOGGING IN PLEASE WAIT...\n=============================");

		try {

			Statement selectStatement = connect().createStatement();

			String queryString = "SELECT * FROM USERS WHERE USER_NAME = '" + username + "'";
			ResultSet resultSet = selectStatement.executeQuery(queryString);

			while (resultSet.next()) {
				String pwString = resultSet.getString("PASSWORD");
				if (password.equals(pwString)) {
					System.out.println("WELCOME, " + username);
					int choice;
					do {
						System.out.println("\nBANKING MO TO");
						System.out.print("\nCheck Balance[1]\nDeposit[2]\nWithdraw[3]\nTransfer[4]\n\n\nChoice:");
						choice = Integer.parseInt(scanner.nextLine());
						Banking crud2 = new Banking();

						switch (choice) {
						case 1:
							selectBalance(username);
							break;
						case 2:
							deposit(username);
							break;
						case 3:
							withdraw(username);
							break;
						case 4:
							transfer(username);
							break;
						default:
							System.out.println("Invalid input!");
							break;
						}

					} while (choice >= 1);

				} else {
					System.out.println("Wrong user or password.");
				}

			}

		} catch (SQLException sqlException) {
			System.out.println("DATABASE CONNECTION ISSUE " + sqlException);
		}

	}

	void selectCreatedAccount(String username) {

		try {

			Statement selecStatement = connect().createStatement();

			String queryString = "SELECT * FROM USERS WHERE USER_NAME = '" + username + "'";
			ResultSet resultSet = selecStatement.executeQuery(queryString);

			while (resultSet.next()) {
				username = resultSet.getString("USER_NAME");
				String contact = resultSet.getString("CONTACT_NUMBER");
				Date date = resultSet.getDate("CREATION_DATE");
				Double amount = resultSet.getDouble("TOTAL_BALANCE");
				System.out.println("\nUSERNAME :" + username);
				System.out.println("\nCONTACT NO.:" + contact);
				System.out.println("\nBALANCE :" + amount);
				System.out.println("\nDATE CREATED :" + date);
				System.out.println("=============================");
			}

		} catch (SQLException sqlException) {
			System.out.println("DATABASE CONNECTION ISSUE " + sqlException);
		}
	}

	void selectBalance(String username) {
		try {

			Statement selecStatement = connect().createStatement();

			String queryString = "SELECT * FROM USERS WHERE USER_NAME = '" + username + "'";
			ResultSet resultSet = selecStatement.executeQuery(queryString);

			while (resultSet.next()) {
				Double amount = resultSet.getDouble("TOTAL_BALANCE");
				System.out.print("\nBALANCE CHECK\n=============================");
				System.out.println("\nUSERNAME : " + username);
				System.out.println("\nTOTAL BALANCE :" + amount);
				System.out.println("=============================");
			}

		} catch (SQLException sqlException) {
			System.out.println("DATABASE CONNECTION ISSUE " + sqlException);
		}

	}

	void deposit(String username) throws SQLException {
		double depo;
		Scanner scanner = new Scanner(System.in);
		System.out.print("\nDEPOSIT\n=============================");
		System.out.print("\n\nEnter Amount : ");
		double amount = 0;
		depo = scanner.nextDouble();

		Statement selecStatement = connect().createStatement();

		String queryString1 = "SELECT * FROM USERS WHERE USER_NAME = '" + username + "'";
		ResultSet resultSet = selecStatement.executeQuery(queryString1);

		while (resultSet.next()) {
			amount = resultSet.getDouble("TOTAL_BALANCE");
		}

		Statement insertStatement = connect().createStatement();

		String queryString = "UPDATE USERS SET TOTAL_BALANCE=" + (amount + depo) + " WHERE USER_NAME = '" + username
				+ "'";
		int rowCount = insertStatement.executeUpdate(queryString);
		if (rowCount != 0) {
			System.out.println("\n=============================\nDEPOSIT SUCCESS.");
			System.out.println("\nTOTAL BALANCE :" + (amount + depo));
			System.out.println("=============================");

		} else {
			System.out.println("No rows.");
		}

	}

	void withdraw(String username) throws SQLException {

		double withdraw;
		double amount = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("\nWITHDRAW\n=============================");
		System.out.print("\n\nEnter Amount : ");

		withdraw = scanner.nextDouble();

		Statement selecStatement = connect().createStatement();

		String queryString1 = "SELECT * FROM USERS WHERE USER_NAME = '" + username + "'";
		ResultSet resultSet = selecStatement.executeQuery(queryString1);

		while (resultSet.next()) {
			amount = resultSet.getDouble("TOTAL_BALANCE");
		}
		if (amount >= withdraw) {
			Statement insertStatement = connect().createStatement();

			String queryString = "UPDATE USERS SET TOTAL_BALANCE=" + (amount - withdraw) + " WHERE USER_NAME = '"
					+ username + "'";
			int rowCount = insertStatement.executeUpdate(queryString);
			if (rowCount != 0) {
				System.out.println("\n=============================\nWITHDRAW SUCCESS.");
				System.out.println("\nTOTAL BALANCE :" + (amount - withdraw));
				System.out.println("=============================");

			} else {
				System.out.println("No rows.");
			}

		} else {
			System.out.println("\n=============================\nTRANSACTION FAILED!");
			System.out.println("Insufficient Balance.");
			System.out.println("Current Account Balance: " + amount);
			System.out.println("=============================");
		}

	}

	void transfer(String username) {
		double send;
		double balance = 0, balancetrans = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("\nTRANSFER MONEY\n=============================");
		System.out.print("\n\nSEND TO: ");
		String username2 = scanner.nextLine();
		System.out.print("\n\nEnter Amount : ");
		send = scanner.nextDouble();

		try {

			Statement selectStatement = connect().createStatement();

			String queryString = "SELECT * FROM USERS WHERE USER_NAME = '" + username2 + "'";
			ResultSet resultSet = selectStatement.executeQuery(queryString);

			while (resultSet.next()) {
				balancetrans = resultSet.getDouble("TOTAL_BALANCE");
				String uname2 = resultSet.getString("USER_NAME");
				if (username2.equals(uname2)) {

					Statement selecStatement = connect().createStatement();

					String queryString1 = "SELECT * FROM USERS WHERE USER_NAME = '" + username + "'";
					ResultSet resultSet1 = selecStatement.executeQuery(queryString1);

					while (resultSet1.next()) {
						balance = resultSet1.getDouble("TOTAL_BALANCE");
					}
					if (balance >= send) {
						Statement insertStatement = connect().createStatement();
						Statement sendStatement = connect().createStatement();
						String queryString11 = "UPDATE USERS SET TOTAL_BALANCE=" + (balance - send)
								+ " WHERE USER_NAME = '" + username + "'";

						String queryString12 = "UPDATE USERS SET TOTAL_BALANCE=" + (balancetrans + send)
								+ " WHERE USER_NAME = '" + username2 + "'";
						sendStatement.executeUpdate(queryString12);

						int rowCount = insertStatement.executeUpdate(queryString11);
						if (rowCount != 0) {
							System.out.println("\n=============================\nTRANSFER SUCCESS.");
							System.out.println("SENT TO : " + username2);
							System.out.println("AMOUNT SEND : " + send);
							System.out.println("\nYOUR NEW BALANCE :" + (balance - send));
							System.out.println("=============================");

						} else {
							System.out.println("No rows.");
						}

					} else {
						System.out.println("\n=============================\nTRANSFER FAILED!");
						System.out.println("Insufficient Balance.");
						System.out.println("Current Account Balance: " + balance);
						System.out.println("=============================");
					}

				} else {
					System.out.println("USER NOT FOUND!");
					System.out.println("Cannot complete the transfer.");
				}

			}

		} catch (SQLException sqlException) {
			System.out.println("DATABASE CONNECTION ISSUE " + sqlException);
		}

	}

}