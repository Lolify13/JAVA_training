package inheritancePractice;

public class AudioBook extends Book {
	
	int year;
	float duration;
	
// constructor
	
	AudioBook(String ptitle, String pauthor, float pprice, int pyear, float pduration) {
		super(ptitle, pauthor, pprice);
		year = pyear;
		duration = pduration;
	}
	
	public void displayBookDetails() {
		super.displayBookDetails();
		System.out.println("Year: " + year);
		System.out.println("Duration: " + duration);
	}

}
