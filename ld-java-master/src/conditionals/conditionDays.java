package conditionals;

import java.util.Scanner;

public class conditionDays {

	public static void main(String[] args) {
		String choys = null;
		String day[] = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("Enter a number: ");
			int num = scanner.nextInt();
			if (num >=1 && num <= 7) {
				System.out.println(day[num-1]);
			}
			 else {
				System.out.println("Invalid!");
			}

			System.out.println("\nDo you wish to continue? Y/N: ");
			choys = scanner.next();

		} while (choys.equalsIgnoreCase("Y"));
		System.out.println("\nDone!");
		scanner.close();
		System.exit(0);
		
	}
}
