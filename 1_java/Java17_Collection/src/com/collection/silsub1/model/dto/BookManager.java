package com.collection.silsub1.controller;

import java.util.ArrayList;
import java.util.Scanner;

import com.collection.silsub1.model.dto.Book;
import com.collection.silsub1.view.model.dao.BookDao;

public class BookManager {
	private BookDao bd = new BookDao();
	private Scanner sc = new Scanner(System.in);
	
	public BookManager() {}
	
	public void addBook(Book book) {
		try {
			book.setbNo(bd.getLastBookNo()+1);
		} catch (IndexOutOfBoundsException e) {
			book.setbNo(1);
		}
		bd.addBook(book);
	}
	
	public int deleteBook(int no) {
		return bd.deleteBook(no);
	}
	
	public int searchBook(String title) {
		return bd.searchBook(title);
	}
	
	
	public Book selectBook(int index) {
		return bd.selectBook(index);
	}
	
	public ArrayList<Book> selectAll() {
		return bd.selectAll();
	}
	
	public Book[] sortedBookList() {
		ArrayList<Book> list = bd.sortedBookList();
		Book[] bk = new Book[list.size()];
		for(int i=0; i<bk.length; i++) {
			bk[i] = list.get(i);
		}
		return bk;
		
	}
	
	public void printBookList(Book[] br) {
		for(Book tmp : br ) {
			System.out.println(tmp);
		}
	}
	
	
	
	
	
	
	
	
	
}


