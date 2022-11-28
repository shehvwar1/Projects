package com.java.project4;

import java.util.Scanner;

//import javax.management.remote.SubjectDelegationPermission;

public class Student {
 private String name;
 protected int id;
  double grade;
  public int age;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public double getGrade() {
	return grade;
}
public void setGrade(double grade) {
	this.grade = grade;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public boolean isPassed(double grade)
{
	//boolean b = false;
	return true;
}
void setDetails()
{
	Scanner sc = new Scanner(System.in);
	System.err.println("Enter the name of Student");
	name = sc.next();
	System.out.println("Enter the id of student");
	id = sc.nextInt();
	//System.out.println("Enter the grade of Student");
	//grade = sc.nextDouble();
	System.out.println("Enter the age of student ");
	age = sc.nextInt();
}
 void getDetails()
 {
	 System.out.println("Name : " + this.name);
	 System.out.println("Id : " + this.id);
	 //System.out.println("Grade: " +  this.grade);
	 System.out.println("Age: " + this.age);
 }
}
class Undergrad extends Student{
	public Undergrad()
	{
		super();
	}
	void setDetails()
	{
		super.setDetails();
	}
	void getDetails()
	{
		super.getDetails();
	}
	public boolean isPassed(double grade)
	{
		if(grade >= 70)
		{
			System.out.println("Student is passed");
			return super.isPassed(grade);
		}
		else
		{
			System.out.println("Student is failed");
			return false;
		}
	}
}
class Grad extends Student{
	public Grad()
	{
		super();
	}
	void setDetails()
	{
		super.setDetails();
	}
	void getDetails()
	{
		super.getDetails();
	}
	public boolean isPassed(double grade)
	{
		if(grade >= 80)
		{
			System.out.println("Student is passed");
			return super.isPassed(grade);
		}
		else
		{
			System.out.println("Student is failed");
			return false;
		}
	}
}