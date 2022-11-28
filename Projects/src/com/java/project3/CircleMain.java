package com.java.project3;

public class CircleMain {

	public static void main(String[] args) {
		Circle c = new Circle();
		Circle c1 = new Circle(3.5, 9);
		Circle c2 = new Circle(3.5, 9);
		System.out.println("cirle-center is " + c1.getCenter() + "circle-radius is " + c1.getRadius()  );
		System.out.println("cirle-center is " + c2.getCenter() + "circle-radius is " + c2.getRadius()  );
		System.out.println("No of objects created are " + Circle.getCount());

	}

}
