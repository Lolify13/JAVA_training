package exceptionsPractice;

import java.util.Scanner;


public class PracticeExceptions {

	public static void main(String[] args) {
		String cookies[] = { "Violet", "Red", "Green", "Blue", "Orange" };

		Calculator casioCalculator = null;
		int total;
		Scanner choiceScanner = new Scanner(System.in);

		try {
			System.out.println(cookies[1]);
			casioCalculator = new Calculator();
			casioCalculator.add(10, 5);
			total = 1 / 1;
			System.out.println(total);
		} catch  (Exception exception) {
			
			if (exception instanceof ArrayIndexOutOfBoundsException){
				System.out.println("Check the index.");
				String messageString = exception.getMessage();
				System.out.println("More Info: " + messageString);
			}
			else if (exception instanceof NullPointerException) {
				System.out.println("Check if you have created and instance of Calculator using new keyword...");
			}
			else if (exception instanceof ArithmeticException) {
				System.out.println("Don't dibay dibay to zero.");
			}
		}
			finally {
			System.out.println("Are you enjoying the service? Y/N: ");
			String choys = choiceScanner.next();

			if (choys.equalsIgnoreCase("y")) {
				System.out.println("Happy To Serve!!");

			} else {
				System.out.println("Fuck off!");
			}

			choiceScanner.close();
		}

		System.out.println("TRANSACTIONS COMPLETE");

	}
}

class Calculator {
	void add(int num1, int num2) {
		int result = num1 + num2;
		System.out.println(result);

	}
}