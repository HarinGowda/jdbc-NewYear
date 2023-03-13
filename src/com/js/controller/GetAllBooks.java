package com.js.controller;

import java.util.ArrayList;

import com.js.dao.BookCRUD;
import com.js.dto.Book;

public class GetAllBooks {
public static void main(String[] args) {
	BookCRUD bc=new BookCRUD();
	ArrayList<Book> al=bc.getAllBooks();
	if(al.size()>0) {
		for(Book b:al) {
			System.out.println(b);
			System.out.println("++++++++++++++");
		}
	}else
	{
		System.out.println("no books in database");
	}
	
}
}
