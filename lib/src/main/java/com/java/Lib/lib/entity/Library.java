package com.java.Lib.lib.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="library")
public class Library {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
 private int lId;
	@Column
 private String staffName;
	@OneToMany(mappedBy = "library")
 private List<Book> book;
 
 
public int getlId() {
	return lId;
}
public Library(int lId, String staffName, List<Book> book) {
	super();
	this.lId = lId;
	this.staffName = staffName;
	this.book = book;
}
public Library() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Library [lId=" + lId + ", staffName=" + staffName + ", book=" + book + "]";
}
public void setlId(int lId) {
	this.lId = lId;
}
public String getStaffName() {
	return staffName;
}
public void setStaffName(String staffName) {
	this.staffName = staffName;
}
public List<Book> getBook() {
	return book;
}
public void setBook(List<Book> book) {
	this.book = book;
}
}
