package IAP;

import java.util.Scanner;

public class Calculator {
	
	static double plusMethod(double num1, double num2) {
		return num1 + num2;
	}
	static double minusMethod(double num1, double num2) {
		return num1 - num2;
	}
	static double multiplyMethod(double num1, double num2) {
		return num1 * num2;
	}
	static double divideMethod(double num1, double num2) {
		return num1 / num2;
	}
	
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		double num=0, entry;
		int a,operation;
		char option;
		do {
		
		double num1, num2, result = 0;
		int operator;
		Scanner in = new Scanner(System.in);
		
		System.out.println("[1] Addition\n[2] Subtraction\n[3] Multiplication\n[4] Divison\n[5] Exit\nEnter number: ");
		operator = in.nextInt();
		
		System.out.println("Enter the first number: "); num1 = in.nextDouble();
		System.out.println("Enter the second number: "); num2 = in.nextDouble();
		
		switch(operator) {
				case 1: result = plusMethod(num1, num2); break;
				case 2: result = minusMethod(num1, num2); break;
				case 3: result = multiplyMethod(num1, num2); break;
				case 4: result = divideMethod(num1, num2); break;
				case 5: System.out.println("Thank you!");System.exit(0); break;
				default: System.out.println("Invalid Input! Choose [1-5] only!");
		}
		System.out.println("The result is: " + result +"\n");
		System.out.println("Would you like to try again?\n[y] or [n]: ");
		option = in.next().charAt(0);
	}while(option=='y');
}
}
