package com.gbs;

import java.sql.SQLException;
import java.util.Scanner;


public class GBSApp {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		GBSApp Main = new GBSApp();
		Main.runCRUD();
}
	

	public void runCRUD() {
		int choice = 0;
		do {
			Scanner scanner = new Scanner(System.in);
			System.out.println("\nBANKING MO TO");
			System.out.print("\nCreate new Account[1]\nLogin Account[2]\n\n\nChoice:");
			choice = Integer.parseInt(scanner.nextLine());

			Banking crud = new Banking();

			switch (choice) {
			case 1:
				crud.createAccount();
				break;
			case 2:
				crud.login();

				break;
	
			default:
				System.out.println("Invalid input!");
				break;
			}

		} while (choice >= 1 && choice <= 2);

	}
}
