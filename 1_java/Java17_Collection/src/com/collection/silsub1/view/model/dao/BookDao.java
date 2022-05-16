package com.collection.silsub1.view.model.dao;

import java.util.ArrayList;

import com.collection.silsub1.model.dto.Book;
import com.collection.silsub1.view.model.comparator.AscCategory;

public class BookDao {
	private ArrayList<Book> bookList;
	
	public BookDao() {
		bookList = new ArrayList<Book>();
	}
	
	public BookDao(ArrayList<Book> list) {
		bookList = list;
	}
	
	public int getLastBookNo() {
		//마지막 도서 번호 리턴
		return bookList.get(bookList.size()-1).getbNo();  //bookList.get(마지막인덱스).도서번호가져오기();
	}
	
	public void addBook(Book book) {
		//전달받은 도서객체 bookList에 추가
		bookList.add(book);
	}
	
	public int deleteBook(int no) {
		//전달받은 도서 번호와 일치하는 도서 bookList에서 삭제.
		int res =0;
		for(int i=0; i<bookList.size(); i++) {
			if(bookList.get(i).getbNo() == no) {
				bookList.remove(i);
				res = 1;
			}
		}
		return res;
	}
	
	public int searchBook(String title) {
		//전달받은 도서 제목을 포함하는 bookList의 인덱스 리턴
		int index = -1;
		for(int i=0; i<bookList.size(); i++) {
			if(bookList.get(i).getTitle().contains(title)) {
				index = i;
				break;
			}
		}
		return index;
	}
	
	public Book selectBook(int index) {
		//전달받은 인덱스를 이용하여 bookList의 해당 인덱스 Book객체 리턴
		return bookList.get(index);
	}
	
	public ArrayList<Book> selectAll() {
		//전체 도서 리스트 리턴
		return bookList;
	}
	
	public ArrayList<Book> sortedBookList() {
		//카테고리순 오름차순 정렬 클래스를 이용하여 리스트 정렬 후 리턴
		ArrayList<Book> cList = new ArrayList<>();
		for(int i=0; i<bookList.size(); i++) {
			cList.add(bookList.get(i));
		}
		cList.sort(new AscCategory());
		return cList;
	}
	
	
	
	
	
	
}
