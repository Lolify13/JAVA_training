package ex.oops;

import java.util.Scanner;

class Products {
	String productName;
	float productPrice;
	String productBrand;
	String productColor;
	
	void acceptDetails () {
	Scanner keyScanner1 = new Scanner(System.in);
			
	System.out.println("Enter Name: ");	
	String msgName = keyScanner1.nextLine();
	productName = msgName;
			
	System.out.println("Enter Price: ");	
	String msgPrice = keyScanner1.nextLine();
	productPrice = Float.parseFloat(msgPrice);
			
	System.out.println("Enter Brand: ");	
	String msgBrand = keyScanner1.nextLine();
	productBrand = msgBrand;
			
	System.out.println("Enter Color: ");	
	String msgColor = keyScanner1.nextLine();
	productColor = msgColor;
	
	keyScanner1.close();
	}
	void printDetails () {
	System.out.println("\n" + "Your product is." + "\n");	
	System.out.println("Name: " + productName);
	System.out.println("Price: " + productPrice);
	System.out.println("Brand: " + productBrand);
	System.out.println("Color: " + productColor);
	}
}

public class exScanner {
public static void main(String[] args) {
	Products viewProducts = new Products();
	viewProducts.acceptDetails();
	viewProducts.printDetails();
}
	
}

