package com.java.project3;

public class StudentMain {

	public static void main(String[] args) {
		Student s = new Student();
		Student s1 = new Student();
		System.out.println("Provide the student1 information");
		s.setDetails();
		
		System.out.println("Provide the student2 information");
		s1.setDetails();
		System.out.println("The student details are as follows");
		s.getDetails();
		System.out.println("The student details are as follows");
		s1.getDetails();
		System.out.println("objects created are " + Student.getCount());

	}

}
