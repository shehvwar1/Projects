package com.java.Book.BookProject.dao;

import com.java.Book.BookProject.entity.Book;

public interface BookDAO {
// void createTable();
// void displayAll();
// void insertRecoord();
// void searchRecord();
// void updateRecord();
// void deleteRecord();
//void insertRecoord();
//void insertRecoord();

//void insertRecoord(int bookId, String bookName);

void insertRecord(int bookId, String bookName, String author, String description, String bookUrl, double price);
void updateRecord(int bookId, String bookName, String author, String description, String bookUrl, double price);
void deleteRecord(int bookId);
void displayAll();
void searchRecordByItsPrice(double price);
}
