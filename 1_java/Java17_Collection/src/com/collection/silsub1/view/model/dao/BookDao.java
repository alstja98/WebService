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
		//������ ���� ��ȣ ����
		return bookList.get(bookList.size()-1).getbNo();  //bookList.get(�������ε���).������ȣ��������();
	}
	
	public void addBook(Book book) {
		//���޹��� ������ü bookList�� �߰�
		bookList.add(book);
	}
	
	public int deleteBook(int no) {
		//���޹��� ���� ��ȣ�� ��ġ�ϴ� ���� bookList���� ����.
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
		//���޹��� ���� ������ �����ϴ� bookList�� �ε��� ����
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
		//���޹��� �ε����� �̿��Ͽ� bookList�� �ش� �ε��� Book��ü ����
		return bookList.get(index);
	}
	
	public ArrayList<Book> selectAll() {
		//��ü ���� ����Ʈ ����
		return bookList;
	}
	
	public ArrayList<Book> sortedBookList() {
		//ī�װ��� �������� ���� Ŭ������ �̿��Ͽ� ����Ʈ ���� �� ����
		ArrayList<Book> cList = new ArrayList<>();
		for(int i=0; i<bookList.size(); i++) {
			cList.add(bookList.get(i));
		}
		cList.sort(new AscCategory());
		return cList;
	}
	
	
	
	
	
	
}
