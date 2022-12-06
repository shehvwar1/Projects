package com.java.project7;

public class AuthorExample {
	//Instance Variable
	private String aName;
	//default Constructor
	public AuthorExample() {
		super();
	}
	//Constructor using Fields
	public AuthorExample(String aName) {
		super();
		this.aName = aName;
	}
	//Getter Setter
	public String getaName() {
		return aName;
	}

	public void setaName(String aName) {
		this.aName = aName;
	}

	public String toString()
	{
		return aName;
	}

	

}
