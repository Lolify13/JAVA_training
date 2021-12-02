package ex.collections;

public class CookiesArray {
	public static void main(String[] args) {
		String cookies[] = { "violet", "indigo", "blue", "green", "yellow", "orange", "red" };
		// INCREMENT
		for (int i = 0; i < cookies.length; i++) {

			System.out.println("Enjoy the " + cookies[i] + " cookie");
		}
       // SEARCH COOKIE
		String searchCookie = "greeny";
		for (int i = 0; i < cookies.length; i = i + 1) {
		    String cook = cookies[i] ;
			if( cook == (searchCookie)) {
			System.out.println("\n" + searchCookie + " cookie found!!");
			break;
			}
			if( i == cookies.length - 1){
			System.out.println("\n" +searchCookie + " cookie not found!!");	
		
			}
		}
		System.out.println("\nProgram Complete!!\n\n");
		// DECRIMENT
		for (int i = cookies.length - 1 ; i>=0; i--) {

			System.out.println("Enjoy the " + cookies[i] + " cookie");
		}
	
	
	
	}
	}

