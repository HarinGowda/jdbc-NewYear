package com.js.controller;

import com.js.dao.BookCRUD;

public class DeleteBook {
public static void main(String[] args) {
	BookCRUD bc= new BookCRUD();
	int a=bc.deleteBookById(11);
	if(a>0) {
		System.out.println("deleted");
	}else {
		System.out.println("not deleted");
	}
}
}
