package com.java.project7;

public class BookMain {
	static void display(BookStore b) {
		//private Author a;
		//static void display(Book b) {
			System.out.println("Book name : " + b.getBookName());
			System.out.println("Book Author name : " + b.getAur());
			System.out.println("Book price : " + b.getPrice());
			System.out.println("Year of publictaion of Book: " + b.getYearOfPublication());

	}

	public static void main(String[] args) {
		BookStore bs =  new BookStore("StoryBooks", 2022, 99.50, new Author("Abhishek", 22));
		display(bs); // calling display method

	}

}
