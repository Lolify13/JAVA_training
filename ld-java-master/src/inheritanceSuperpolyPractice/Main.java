package inheritanceSuperpolyPractice;

import java.util.Random;



public class Main {
	public static void main(String[] args) {
		Color color = null;
		
		String colors[] = {"RED","BLUE","YELLOW","ORANGE","GREEN"};
		
		
		int rnd = new Random().nextInt(colors.length);
		String c = colors[rnd];

	
		if(c== "RED") {
			color  = new Colors(c, 255, 0, 0, "RED LIKE CHERRIES");
		}
		
		else if (c =="BLUE") {
			color  = new Colors(c, 0, 0, 255, "BLUE LIKE SKY");
		}
		else if (c =="YELLOW") {
			color  = new Colors(c, 255, 255, 0, "YELLOW LIKE MANGOES");
		}
		else if (c =="ORANGE") {
			color  = new Colors(c, 255, 165, 0, "ORANGE LIKE ORANGE");
		}
		else {
			color  = new Colors(c, 0, 255, 0, "GREEN LIKE WEEDS");
		}	
			
		  color.displayColorDetails();
	}

	
}
