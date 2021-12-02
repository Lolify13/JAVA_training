package IAP;

import java.util.Scanner;


public class multiplicationOverloading {
	
	//void multi(int num1, int num2) {
	//	int result = num1 * num2;
	//	System.out.println("Multiplication of 2 Integers \n");
	//	System.out.println(num1+ " * " +num2+ " = " + result+ "\n");
	//}
	void multi(int num1, int num2, int num3) {
		int result = num1 * num2 * num3;
		System.out.println("Multiplication of 3 Integers \n");
		System.out.println(num1+ " * " +num2+ " * " + num3 +" = " + result+"\n");
	}
	
	//void multi(float num1, float num2) {
		//float result = num1 * num2;
	//	System.out.println("Multiplication of 2 Floats \n");
	//	System.out.println(num1+ " * " +num2+ " = " + result+ "\n");
	//}
	void multi(float num1, float num2, float num3) {
		float result = num1 * num2 * num3;
		System.out.println("Multiplication of 3 Floats \n");
		System.out.println(num1+ " * " +num2+ " * " + num3 +" = " + result+"\n");
	}
	
	//void multi(double num1, double num2) {
	//	double result = num1 * num2;
	//	System.out.println("Multiplication of 2 Doubles \n");
	//	System.out.println(num1+ " * " +num2+" = " + result+"\n");
	//}
	
	 void multi(double num1, double num2, double num3) {
		double result = num1 * num2 * num3;
		System.out.println("Multiplication of 3 Doubles \n");
		System.out.println(num1+ " * " +num2+ " * " + num3 +" = " + result+"\n");
	}
	
	void multi(int num1, float num2, double num3) {
		float result = num1 * num2;
		System.out.println("Multiplication of an Integer and a Float \n");
		System.out.println(num1+ " * " +num2+" = " + result+"\n");
		return;
	}
	//void multi(boolean b, boolean c) {
		//double result = b * c;
		//System.out.println("Multiplication of an Integer and a Double \n");
	//	System.out.println(b+ " * " +c+" = " + result+"\n");
	//	
	//}
	
	void multi(boolean num1, boolean num2) {
		boolean result = num1 & num2;
		System.out.println("Multiplication of 2 Booleans \n");
		System.out.println(num1+ " * " +num2+" = " + result+"\n");
		
	}
	
	public static void main(String[] args) {
		multiplicationOverloading multiCalcu = new multiplicationOverloading();
		
		//multiCalcu.multi(123, 4);
		multiCalcu.multi(13, 25, 7);
		//multiCalcu.multi(1.4f, 4.0f);
		multiCalcu.multi(5.1f, 3.1f, 1.5f);
		//multiCalcu.multi(2.5, 4.5);
		multiCalcu.multi(2.3, 4.2, 1.7);
		//multiCalcu.multi(5, 1.5f);
		//multiCalcu.multi(10, 2.5);
		multiCalcu.multi(true, false );
	
		
	      Scanner input= new Scanner(System.in);
	     
	      System.out.println("ENTER 3 DOUBLE NUMBERS");
	
	      multiCalcu.multi(input.nextDouble(), input.nextDouble(), input.nextDouble());
		
	      System.out.println("ENTER 3 INTEGER NUMBERS");
	
	      multiCalcu.multi(input.nextInt(), input.nextInt(), input.nextInt());
		
	      System.out.println("ENTER 2 BOOLEANS");
	
		multiCalcu.multi(input.nextBoolean(), input.nextBoolean());
		
		
	  
	      input.close();
	}
}


