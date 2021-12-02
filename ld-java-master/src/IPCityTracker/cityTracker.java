package IPCityTracker;

import java.util.ArrayList;
import java.util.Scanner;

public class cityTracker {
	public static void main(String[] args) {
		int loop = 0;
		Scanner s = new Scanner(System.in);
		ArrayList<String> cities = new ArrayList<String>();
		String cityString, update;
		cities.add("Manila");
		cities.add("Marikina");
		cities.add("Pasig");
		cities.add("Quezon");
		cities.add("Mandaluyong");

		System.out.println("CITY TRACKER\nView List Ascending[1]\nView List Descending[2]\n");
		System.out.print("Choice: ");
		int choice = s.nextInt();

		if (choice == 1) {
			System.out.println("---------------------------");
			System.out.println("Ascending List of cities\n");
			asc(cities);
			do {
				System.out.println("---------------------------");
				System.out.println("WHAT DO YOU WANT TO DO??");
				System.out.println("Add a City[1]");
				System.out.println("Delete a City[2]");
				System.out.println("Update a City[3]");
				System.out.println("Search a City[4]");
				System.out.println("Exit[5]");
				System.out.print("Choice: ");
				choice = s.nextInt();

				if (choice == 1) {
					Scanner x = new Scanner(System.in);
					System.out.println("---------------------------");
					System.out.print("Enter a city to be added: ");

					cityString = x.nextLine();
					System.out.println("\nAdded Succesfully!");
					cities.add(cityString);
					System.out.println("\nList of cities\n");
					asc(cities);
				}

				else if (choice == 2) {
					Scanner x = new Scanner(System.in);
					System.out.println("---------------------------");
					System.out.print("Enter a city to be deleted: ");

					cityString = x.nextLine();
					System.out.println("\nDeleted Succesfully!");
					System.out.println("\nList of cities\n");
					if (cities.contains(cityString)) {
						cities.remove(new String(cityString));
						asc(cities);
					} else {
						System.out.println("Not found in the list.");
					}

				} else if (choice == 3) {
					Scanner x = new Scanner(System.in);
					System.out.println("---------------------------");
					System.out.print("Enter a city to be updated: ");

					cityString = x.nextLine();

					if (cities.contains(cityString)) {
						Scanner y = new Scanner(System.in);
						System.out.print("Enter the city: ");
						update = y.nextLine();
						System.out.println("\nUpdated Succesfully!");
						System.out.println("\nList of cities\n");
						cities.set(cities.indexOf(cityString), update);
						asc(cities);
					} else {
						System.out.println("Not found in the list.");
					}

				} else if (choice == 4) {
					Scanner x = new Scanner(System.in);
					System.out.println("---------------------------");
					System.out.print("Enter a city to be search: ");

					cityString = x.nextLine();

					if (cities.contains(cityString)) {
						System.out.println(cityString + " City found!");
					} else {
						System.out.println(cityString + " City not found!!");
					}
				}

				else if (choice == 5) {
					System.out.println("Thank you!");
					loop = 1;
				}

				else {
					System.out.println("Invalid! Try Again");

				}

			} while (loop == 0);

		}

		else if (choice == 2) {
			System.out.println("---------------------------");
			System.out.println("Descending List of cities\n");
			desc(cities);

			do {
				System.out.println("---------------------------");
				System.out.println("WHAT DO YOU WANT TO DO??");
				System.out.println("Add a City[1]");
				System.out.println("Delete a City[2]");
				System.out.println("Update a City[3]");
				System.out.println("Search a City[4]");
				System.out.println("Exit[5]");
				System.out.print("Choice: ");
				choice = s.nextInt();

				if (choice == 1) {
					Scanner x = new Scanner(System.in);
					System.out.println("---------------------------");
					System.out.print("Enter a city to be added: ");

					cityString = x.nextLine();
					System.out.println("\nAdded Succesfully!");
					cities.add(cityString);
					System.out.println("\nList of cities\n");
					desc(cities);
				}

				else if (choice == 2) {
					Scanner x = new Scanner(System.in);
					System.out.println("---------------------------");
					System.out.print("Enter a city to be deleted: ");

					cityString = x.nextLine();
					System.out.println("\nDeleted Succesfully!");
					System.out.println("\nList of cities\n");
					if (cities.contains(cityString)) {
						cities.remove(new String(cityString));
						desc(cities);
					} else {
						System.out.println("Not found in the list.");
					}

				} else if (choice == 3) {
					Scanner x = new Scanner(System.in);
					System.out.println("---------------------------");
					System.out.print("Enter a city to be updated: ");

					cityString = x.nextLine();

					if (cities.contains(cityString)) {
						Scanner y = new Scanner(System.in);
						System.out.print("Enter the city: ");
						update = y.nextLine();
						System.out.println("\nUpdated Succesfully!");
						System.out.println("\nList of cities\n");
						cities.set(cities.indexOf(cityString), update);
						desc(cities);
					} else {
						System.out.println("Not found in the list.");
					}

				} else if (choice == 4) {
					Scanner x = new Scanner(System.in);
					System.out.println("---------------------------");
					System.out.print("Enter a city to be search: ");

					cityString = x.nextLine();

					if (cities.contains(cityString)) {
						System.out.println(cityString + " City found!");
					} else {
						System.out.println(cityString + " City not found!!");
					}
				}

				else if (choice == 5) {
					System.out.println("Thank you!");
					loop = 1;
				}

				else {
					System.out.println("Invalid! Try Again");

				}

			} while (loop == 0);

		}

		else {
			System.out.println("Invalid input!");

		}

	}

	static void asc(ArrayList<String> cities) {

		for (int i = 0; i < cities.size(); i++) {
			String c = cities.get(i);
			System.out.println(c);
		}
		
		
	}

	static void desc(ArrayList<String> cities) {

		for (int i = cities.size() - 1; i >= 0; i--) {
			String c = cities.get(i);
			System.out.println(c);

		}
	}

}
