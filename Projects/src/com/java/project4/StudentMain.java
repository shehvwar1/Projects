package com.java.project4;

public class StudentMain {

	public static void main(String[] args) {
		Undergrad ud = new Undergrad();
		ud.setDetails();
		ud.getDetails();
		ud.isPassed(45.0);
		System.out.println("Grad details are");
		Grad g = new Grad();
		g.setDetails();
		g.getDetails();
		g.isPassed(30.0);

	}

}
