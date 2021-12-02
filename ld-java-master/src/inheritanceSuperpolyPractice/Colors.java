package inheritanceSuperpolyPractice;

public class Colors extends Color {
	String sample;
	
	public void displayColorDetails() {
		super.displayColorDetails();
		System.out.println("Description: "+sample);
	}
	
	Colors(String pDesc , int pR, int pG, int pB, String pSample){
		
		super(pDesc, pR, pG, pB);
		sample = pSample;
		
	}
}
