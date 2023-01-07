package com.java.Lib.lib.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="book")
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int bId;
	@Column
private String bName;
	@ManyToOne
private Library library;

@Override
public String toString() {
	return "Book [bId=" + bId + ", bName=" + bName + ", library=" + library + "]";
}
public Book(int bId, String bName, Library library) {
	super();
	this.bId = bId;
	this.bName = bName;
	this.library = library;
}
public int getbId() {
	return bId;
}
public void setbId(int bId) {
	this.bId = bId;
}
public String getbName() {
	return bName;
}
public void setbName(String bName) {
	this.bName = bName;
}
public Library getLibrary() {
	return library;
}
public void setLibrary(Library library) {
	this.library = library;
}
public Book() {
	super();
	// TODO Auto-generated constructor stub
}
}
