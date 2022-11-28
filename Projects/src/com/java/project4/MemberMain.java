package com.java.project4;

public class MemberMain {

	public static void main(String[] args) {
		Member m = new Member();
		System.out.println("Member details are");
		m.setDetails();
		m.getDetails();
		Employee em = new Employee();
		System.out.println("Provide Employee details");
		em.setDetails();
		System.out.println("Employee details are");
		em.getDetails();
		
		Manager mgr = new Manager();
		System.out.println("Provide Manager details");
		mgr.setDetails();
		System.out.println("Manager details are");
		mgr.getDetails();
		

	}

}
