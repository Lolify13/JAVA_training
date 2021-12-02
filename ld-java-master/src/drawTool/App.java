package drawTool;

public class App {
	
	public static void main(String[] args) {
		
		DrawingTool drawingTool = null;
		
		
		if(Math.random() >0.5) {
		drawingTool = new Pencil();
		}
		
		else {
			drawingTool = new Pen();
		}
		
		drawingTool.draw();
		
		
	}
}



class DrawingTool{

	void draw() {
		System.out.println("Drawing on pen or paper:");
	}
	
}


class Pen extends DrawingTool{
	
	void draw() {
		System.out.println("Non-erasable drawing");
	}
}

class Pencil extends DrawingTool{
	
	void draw() {
		System.out.println("Erasable drawing");
	}
}