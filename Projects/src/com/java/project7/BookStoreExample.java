package com.java.project7;

import java.util.ArrayList;
import java.util.Scanner;

public class BookStoreExample {
	private String bTitle;
	private int price;
	private String yop;
	private AuthorExample aur;
	public String getbTitle() {
		return bTitle;
	}
	public void setbTitle(String bTitle) {
		this.bTitle = bTitle;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getYop() {
		return yop;
	}
	public void setYop(String yop) {
		this.yop = yop;
	}
	public AuthorExample getAur() {
		return aur;
	}
	public void setAur(AuthorExample aur) {
		this.aur = aur;
	}
	public BookStoreExample(String bTitle, int price, String yop, AuthorExample aur) {
		super();
		this.bTitle = bTitle;
		this.price = price;
		this.yop = yop;
		this.setAur(aur);
	}
	public BookStoreExample() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String toString()
	{
		return  bTitle + " " + price + " " + yop + " " + aur ;
		
	}
	
//	void addBook()
//	{
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the Book Title");
//		bTitle = sc.next();
//		System.out.println("Enter the price");
//		price = sc.nextInt();
//		System.out.println("Enter year of publication");
//		yop = sc.next();
//		System.out.println("Enter author name");
//		//aur = sc.next();
//		ArrayList al = new ArrayList();
//        
//
//	}
}
