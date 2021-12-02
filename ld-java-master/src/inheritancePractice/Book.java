package inheritancePractice;

public class Book {

	String title;
	String author;
	float price;

// default constructor
	Book() {
		title = "";
		author = "";
		price = 0.0f;
	}

// overloaded constructor

	Book(String ptitle, String pauthor, float pprice) {

		title = ptitle;
		author = pauthor;
		price = pprice;
	}

// overridden method	
	public void displayBookDetails() {
		System.out.println("Book Details");
		System.out.println("Title: " + title);
		System.out.println("Author: " + author);
		System.out.println("Price: " + price);

	}

}
