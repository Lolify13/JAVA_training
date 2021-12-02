//instant practice

package dem.oops;

public class Products {
// ATTRIBUTE / FIELDS / VARIABLES / PROPERTIES
	int productId;
	int productPrice;
	String productName;
	String productDetails;
	String productBrand;
	String productColor;
	String productConnectivity;
	
	
	
// METHOD / FUNCTION	
	void displayDetails(){
		System.out.println(productId);
		System.out.println(productPrice);
		System.out.println(productName);
		System.out.println(productDetails);
		System.out.println(productBrand);
		System.out.println(productColor);
		System.out.println(productConnectivity);
	}
	
	public static void main(String[] args) {
// creating the first product
	Products prodObject1 = new Products();
// assigning the details
	prodObject1.productId = 2;
	prodObject1.productPrice = 149;
	prodObject1.productName = "SteelSeries Apex 7 TKL Compact Mechanical Gaming Keyboard ";
	prodObject1.productDetails="Durable Mechanical Gaming Switches - Guaranteed for 50 million keypresses using whichever ultra-fast switch type you prefer: red, blue, or brown.";
	prodObject1.productBrand = "SteelSeries";
	prodObject1.productColor = "Ghost";
	prodObject1.productConnectivity = "Wired";
// print the details
	prodObject1.displayDetails();
	
// creating the 2nd product
	Products prodObject2 = new Products();
// assigning the details
	prodObject2.productId = 1;
	prodObject2.productPrice = 18;
	prodObject2.productName = "Logitech M510";
	prodObject2.productDetails="Your hand can relax in comfort hour after hour with this ergonomically designed mouse. Its contoured shape with soft rubber grips, gently curved sides and broad palm area give you the support you need for effortless control all day long.";
	prodObject2.productBrand = "Logitech";
	prodObject2.productColor = "Black";
	prodObject2.productConnectivity = "Wireless";
// print the details
	prodObject2.displayDetails();
	}

}
