package com.java.project7;

public class BookStore {
	private String bName;
	private String yearOfPublication;
	private double price;
	private Author ar;
	public BookStore(String bName, String yearOfPublication, double price, Author ar) {
		super();
		this.bName = bName;
		this.yearOfPublication = yearOfPublication;
		this.price = price;
		this.ar = ar;
	}
	
	public String getbName() {
		return bName;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}
	public String getYearOfPublication() {
		return yearOfPublication;
	}
	public void setYearOfPublication(String yearOfPublication) {
		this.yearOfPublication = yearOfPublication;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Author getAr() {
		return ar;
	}
	public void setAr(Author ar) {
		this.ar = ar;
	}


}
