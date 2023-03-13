package com.js.controller;

import java.util.Scanner;

import com.js.dao.BookCRUD;
import com.js.dto.Book;

public class updateBook {
public static void main(String[] args) {
	Book b=new Book();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the id");
	int id=sc.nextInt();
	b.setBook_name(sc.next());
	b.setAuthor_name(sc.next());
	b.setNo_of_pages(sc.nextInt());
	b.setPrice(sc.nextDouble());
	BookCRUD bs= new BookCRUD();
	int a=bs.updateBook(id,b);
	if(a>0) {
		System.out.println("book udated successfully");
	}else {
		System.out.println("book  is not updated");
	}
}
}