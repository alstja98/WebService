package com.inherit.chap02.override;

public class Book {
	private String title;
	private String writer;
	private int price;
	
	public Book() {}

	public Book(String title, String writer, int price) {
		super();
		this.title = title;
		this.writer = writer;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return title + ", " + writer + ", " + price;
	}
	
	@Override
	public boolean equals(Object obj) {
		//객체의 주소가 같으면 같은 객체
		if(this == obj) {
			return true;
		}
		//전달받은 객체가 null
		if(obj == null) {
			return false;
		}
		
		//필드값 비교
		Book other = (Book)obj;
		
		//title비교
		if(title==null) {
			if(other.title != null) {
				return false;
			}
			//두 객체의 title값이 서로 다르면 false 리턴
		}else if(!title.equals(other.title)) {
			return false;
		}
		
		//writer비교
		if(writer == null) {
			if(other.writer != null) {
				return false;
			}
		}else if ( !writer.equals(other.writer)) {
			return false;
		}
		
		//price비교
		if(price != other.price) {
			return false;
		}
		
		//모든 조건 통과하면 두 객체는 같은 객체
		return true;
	}
	
	
	
	@Override
	public int hashCode() {
		return (writer+price+title).hashCode();  //우리가 눈으로 확인하는 여러 객체들의 해쉬코드를 같게 맞춤. //실제 객체들의 해쉬코드는 다름.
	}
}
