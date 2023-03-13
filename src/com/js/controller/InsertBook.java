package com.js.controller;

import com.js.dao.BookCRUD;
import com.js.dto.Book;

public class InsertBook {
public static void main(String[] args) {
	Book b=new Book();
	b.setBook_id(4);
	b.setBook_name("avengers");
	b.setAuthor_name("rock");
	b.setNo_of_pages(364);
	b.setPrice(9999);
	
	BookCRUD bc=new BookCRUD();
	int a=bc.insertBook(b);
	if(a>0) {
		System.out.println("Book is inserted successfully");
	}
	else {
		System.out.println("failed to insert");
	}
}
}
