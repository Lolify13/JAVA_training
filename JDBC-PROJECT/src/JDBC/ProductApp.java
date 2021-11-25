package JDBC;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductApp {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		ProductApp productApp = new ProductApp();
		productApp.runCRUD();
}
	

	public void runCRUD() {
		int choice = 0;
		do {
			Scanner scanner = new Scanner(System.in);
			System.out.println("\nCRUD");
			System.out.print("\nSelect[1]\nInsert[2]\nDelete[3]\nUpdate[4]\n\nChoice:");
			choice = Integer.parseInt(scanner.nextLine());

			CRUD crud = new CRUD();

			switch (choice) {
			case 1:
				crud.select();
				break;
			case 2:
				crud.insert();
				break;
			case 3:
				crud.delete();
				break;
			case 4:
				crud.update();
				break;

			default:
				System.out.println("Invalid input!");
				break;
			}

		} while (choice >= 0 && choice <= 4);

	}

}
