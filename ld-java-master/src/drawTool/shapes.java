package drawTool;

import java.util.Random;

public class shapes {
	public static void main(String[] args) {
		Shape s = null;
		String sp[] = { "Rectangle", "Circle", "Square", "Triangle" };
		int x = new Random().nextInt(sp.length);
		String c = sp[x];

		if (c == "Rectangle") {

			s = new Rectangle();
		}

		else if (c == "Circle") {
			s = new Circle();
		}

		else if (c == "Square") {
			s = new Square();
		} else {

			s = new Triangle();

		}
		s.draw();

	}
}

class Shape {
	void draw() {
		System.out.println("What shape you choose?");
	}
}

class Rectangle extends Shape {

	void draw() {
		super.draw();
		System.out.println("You have drawn Rectangle");
	}

}

class Triangle extends Shape {

	void draw() {
		super.draw();
		System.out.println("You have drawn Triangle");
	}

}

class Circle extends Shape {

	void draw() {
		super.draw();
		System.out.println("You have drawn Circle");
	}

}

class Square extends Shape {

	void draw() {
		super.draw();
		System.out.println("You have drawn Square");
	}

}
