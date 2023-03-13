package com.js.controller;

import java.util.ArrayList;

import com.js.dao.BookCRUD;
import com.js.dto.Book;

public class batchExecution {
public static void main(String[] args) {
	ArrayList<Book>books=new ArrayList<>();
	Book b1=new Book();
	b1.setBook_id(20);
	b1.setBook_name("python");
	b1.setAuthor_name("pramod");
	b1.setNo_of_pages(250);
	b1.setPrice(259.9);
	
	Book b2=new Book();
	b2.setBook_id(21);
	b2.setBook_name("python");
	b2.setAuthor_name("pramod");
	b2.setNo_of_pages(250);
	b2.setPrice(259.9);
	
	Book b3=new Book();
	b3.setBook_id(22);
	b3.setBook_name("python");
	b3.setAuthor_name("pramod");
	b3.setNo_of_pages(250);
	b3.setPrice(259.9);
	
	Book b4=new Book();
	b4.setBook_id(23);
	b4.setBook_name("python");
	b4.setAuthor_name("pramod");
	b4.setNo_of_pages(250);
	b4.setPrice(259.9);
	
	books.add(b1);
	books.add(b2);
	books.add(b3);
	books.add(b4);
	BookCRUD bc=new BookCRUD();
	boolean b=bc.batchExcetion(books);
	if(b) {
		System.out.println("done");
	}else {
		System.out.println("not done");
	}
	
}
}
