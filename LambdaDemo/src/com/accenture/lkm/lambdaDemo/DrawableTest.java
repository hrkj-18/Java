package com.accenture.lkm.lambdaDemo;

public class DrawableTest {

	// method to draw a shape by calling Drawable draw method
	void drawShape(Drawable drawable, int a, int b) {
		drawable.draw(a, b);
	}

	public static void main(String[] args) {

		DrawableTest drawableTest = new DrawableTest();

		// Circle implementation of Drawable interface
		Drawable circle = (a, b) -> {
			System.out.println("Drawing circle @" + a + ", " + b);
		};

		// Rectangle implementation of Drawable interface
		Drawable rectangle = (a, b) -> {
			System.out.println("Drawing rectangle @" + a + ", " + b);
		};

		// Traingle implementation of Drawable interface
		Drawable traingle = (a, b) -> {
			System.out.println("Drawing traingle@" + a + ", " + b);
		};

		// need circle implementation so passing circle reference in drawShape method
		drawableTest.drawShape(circle, 1, 2);

		// need rectangle implementation so passing rectangle reference in drawShape
		// method
		drawableTest.drawShape(rectangle, -5, -9);

		// need traingle implementation so passing traingle reference in drawShape
		// method
		drawableTest.drawShape(traingle, 3, 4);
		drawableTest.drawShape((a, b) -> System.out.println("Drawing square @" + a + ", " + b), 9, 8);
	}

}
