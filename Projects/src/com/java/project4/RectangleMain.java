package com.java.project4;

public class RectangleMain {

	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		System.out.println("Area & perimeter of rectangle is ");
		r.setDetails();
		r.areaOfRectangle();
		r.perimeterOfRectangle();
		System.out.println("************************************");
		Square s = new Square();
		s.setDetails();
		s.areaOfSquare();
		s.perimeterOfSquare();
	}

}
