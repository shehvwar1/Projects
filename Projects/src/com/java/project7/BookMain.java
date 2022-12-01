package com.java.project7;

public class BookMain {
	static void display(BookStore bs) {
		System.out.println("Book type : " + bs.getbName());
		System.out.println("Book Author name : " + bs.getAr());
		System.out.println("Book price : " + bs.getPrice());
		System.out.println("Year of publictaion of Book: " + bs.getYearOfPublication());

	}

	public static void main(String[] args) {
		BookStore bs = new BookStore("Novel", "22=10-2022",199.00, new Author("Subuhi shehvwar", 25));
		display(bs);

	}

}
