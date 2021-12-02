package inheritanceSuperpolyPractice;

public class Color {

	String description;
	int r;
	int g;
	int b;
	
	
	Color(){
		description = "";
		r = 0;
		g = 0;
		b = 0;
	}
	
	Color(String pDesc , int pR, int pG, int pB){
		
		description = pDesc;
		r = pR;
		g = pG;
		b = pB;
		
	}
	
	public void displayColorDetails() {
		
		System.out.println("Color Details");
		System.out.println("Color: " + description);
		System.out.println("R: "+r);
		System.out.println("G: "+g);
		System.out.println("B: "+b);
	}
	
}
