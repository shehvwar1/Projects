package com.java.project3;

import java.util.Scanner;

public class Student {
	private String name;
	private int age;
	private double weight;
	private static int count=0;
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Student.count = count;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public void setDetails()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Provide the student name");
		name = sc.next();
		System.out.println("provide the student age");
		age = sc.nextInt();
		System.out.println("provide the student weight");
		weight = sc.nextDouble();
	}
	public void getDetails()
	{
		System.out.println("Name of student is " + this.name);
		System.out.println("age of student is " + this.age);
		System.out.println("Weight of student is " + this.weight);
		count++;
	}

}
