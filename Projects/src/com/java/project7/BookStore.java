package com.java.project7;

public class BookStore {
	
//	private String bName;
//	private String yearOfPublication;
//	private double price;
//	private Author ar;
//	public BookStore(String bName, String yearOfPublication, double price, Author ar) {
//		super();
//		this.bName = bName;
//		this.yearOfPublication = yearOfPublication;
//		this.price = price;
//		this.setAr(ar); 
//	}
//	public BookStore() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	
//	public String getbName() {
//		return bName;
//	}
//	public void setbName(String bName) {
//		this.bName = bName;
//	}
//	public String getYearOfPublication() {
//		return yearOfPublication;
//	}
//	public void setYearOfPublication(String yearOfPublication) {
//		this.yearOfPublication = yearOfPublication;
//	}
//	public double getPrice() {
//		return price;
//	}
//	public void setPrice(double price) {
//		this.price = price;
//	}
//	public Author getAr() {
//		return ar;
//	}
//	public void setAr(Author ar) {
//		this.ar = ar;
//	}
	// Instance variable
		private String bookName;
		private int yearOfPublication;
		private double price;
		private Author aur; // creating ref of Author
		// default Constructor

		public BookStore() {
			super();
		}

		// Paramaterized Constructor
		public BookStore(String bookName, int yearOfPublication, double price, Author aur) {
			super();
			this.bookName = bookName;
			this.yearOfPublication = yearOfPublication;
			this.price = price;
			this.setAur(aur);
		}

		// ------------Getter and Setter ----------------//
		public String getBookName() {
			return bookName;
		}

		public void setBookName(String bookName) {
			this.bookName = bookName;
		}

		// ------------Getter and Setter ----------------//
		public int getYearOfPublication() {
			return yearOfPublication;
		}

		public void setYearOfPublication(int yearOfPublication) {
			this.yearOfPublication = yearOfPublication;
		}

		// ------------Getter and Setter ----------------//
		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		// ------------Getter and Setter ----------------//
		public Author getAur() {
			return aur;
		}

		public void setAur(Author aur) {
			this.aur = aur;
		}


}
