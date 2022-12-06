package com.java.project7;

public class Author {
//	private String aName;
//	private int age;
//	public Author(String aName, int age) {
//		super();
//		this.aName = aName;
//		this.age = age;
//	}
//	public String getaName() {
//		return aName;
//	}
//	public void setaName(String aName) {
//		this.aName = aName;
//	}
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
	/*public Author() {
		super();
		// TODO Auto-generated constructor stub
	}*/
	private String authorName;
	private int age;

	// default Constructor
	public Author() {
		super();
	}

	// Paramaterized Constructor
	public Author(String authorName, int age) {
		super();
		this.authorName = authorName;
		this.setAge(age);
	}

	// ------------Getter and Setter ----------------//
	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	// ------------Getter and Setter ----------------//
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// ------------to string ----------------//
	public String toString() {
		return authorName + "  Age: " + age;
	}

}
