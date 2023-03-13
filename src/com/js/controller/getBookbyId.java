package com.js.controller;

import com.js.dao.BookCRUD;
import com.js.dto.Book;

public class getBookbyId {
public static void main(String[] args) {
	BookCRUD bc=new BookCRUD();
	Book b=bc.getBookById(10);
	if(b!=null) {
		System.out.println(b);
	}
	else {
		System.out.println("no book with given id");
	}
}
}
