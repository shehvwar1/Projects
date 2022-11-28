package com.java.project4;

import java.util.Scanner;

public class Rectangle {
	private double length;
	public Rectangle() {
		super();
		//this.length = length;
		//this.breadth = breadth;
	}
	private double breadth;
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getBreadth() {
		return breadth;
	}
	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}
	void setDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of rectangle");
		length = sc.nextDouble();
		System.out.println("Enter the breadth of rectangle");
		breadth = sc.nextDouble();
	}
	void getDetails()
	{
		System.out.println("length is " + this.length);
		System.out.println("breadth is " + this.breadth);
	}
	void areaOfRectangle() {
		double area = length*breadth;
		System.out.println("Area of rectangle " + area);
	}
	void perimeterOfRectangle()
	{
		double perimeter = 2*(length+breadth);
		System.out.println("perimeter of rectangle is " + perimeter);
	}

}
class Square extends Rectangle{
	
	private double side;
	public Square() {
		super();
		// TODO Auto-generated constructor stub
	}
	public double getSide() {
		return side;
	}
	public void setSide(double side) {
		this.side = side;
	}
	void setDetails()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the side value of Square");
		side = sc.nextDouble();
	}
	void getDetails()
	{
		System.out.println("Side of square is " + this.side);
	}
	void areaOfSquare()
	{
		double area = side*side;
		System.out.println("area of square is" + area);
		
	}
	void perimeterOfSquare()
	{
		double perimeter = 4*side;
		System.out.println("perimeter of square is " + perimeter );
	}
}