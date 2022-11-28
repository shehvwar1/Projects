package com.java.project3;

public class Circle {
	private double center;
	private double radius;
	private static int count =0;

	public static int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public Circle()
	{
		System.out.println("This is the default constructor");
	}
	public Circle(double center, double radius) {
		super();
		this.center = center;
		this.radius = radius;
		 count++;
	}
	public double getCenter() {
		return center;
	}
	public void setCenter(double center) {
		this.center = center;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}

}
