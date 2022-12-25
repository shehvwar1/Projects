package com.java.Book.BookProject.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@Getter @Setter
@Data
@NoArgsConstructor 
//@ToString
@AllArgsConstructor
public class Book {
	private int bookId;
	private String bookName;
	private String author;
	private String description;
	private String bookUrl;
	private double price;
	
}
