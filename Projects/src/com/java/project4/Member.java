package com.java.project4;

import java.util.Scanner;

public class Member {
	private String name;
	private int age;
	private int phoneNumber;
	private String address;
	private double salary;
	public void printSalary() {
		System.out.println("salary of member is " + this.salary );
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
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	void setDetails()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the memeber name");
		name = sc.next();
		System.out.println("Enter the member age");
		age = sc.nextInt();
		System.out.println("Enter the member phone number");
		phoneNumber = sc.nextInt();
		System.out.println("Enter the member address");
		address = sc.next();
	}
	void getDetails()
	{
		System.out.println("Name is " + this.name);
		System.out.println("Age is " + this.age);
		System.out.println("Phone number is " + this.phoneNumber);
		System.out.println("Address is  " + this.address);
	}
}
	class Employee extends Member
	{
		private String specialization;
		private String department;
		public String getSpecialization() {
			return specialization;
		}
		public void setSpecialization(String specialization) {
			this.specialization = specialization;
		}
		public String getDepartment() {
			return department;
		}
		public void setDepartment(String department) {
			this.department = department;
		}
		void setDetails()
		{
			super.setDetails();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the employee specialization");
			specialization = sc.next();
			System.out.println("Enter the employee department");
			department = sc.next();
		}
		void getDetails()
		{
			super.getDetails();
			System.out.println("Specializaton is " + this.specialization);
			System.out.println("Department is " + this.department);
			//System.out.println("Salary is" + super.printSalary());
		}
}
	class Manager extends Member
	{
		private String specialization;
		private String department;
		public String getSpecialization() {
			return specialization;
		}
		public void setSpecialization(String specialization) {
			this.specialization = specialization;
		}
		public String getDepartment() {
			return department;
		}
		public void setDepartment(String department) {
			this.department = department;
		}
		void setDetails()
		{
			super.setDetails();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Manager specialization");
			specialization = sc.next();
			System.out.println("Enter the Manager department");
			department = sc.next();
		}
		void getDetails()
		{
			super.getDetails();
			System.out.println("Specializaton is " + this.specialization);
			System.out.println("Department is " + this.department);
		}
}
