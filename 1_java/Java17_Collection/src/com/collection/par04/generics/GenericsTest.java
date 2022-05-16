package com.collection.par04.generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GenericsTest {
	public void test1() {
		List list = new ArrayList();
		
		list.add(new String("Orange"));
		list.add(new Book());
		list.add(new Car());
		list.add(new Student());
		
		System.out.println("저장된 객체 수 : " + list.size());
		System.out.println("list: " + list);
		
		for(int i=0; i<list.size(); i++) {
			Object obj = list.get(i);
			System.out.println(obj); //toString의 결과 출력됨
			//각 객체들의 메소드를 실행하려면? instanceof를 사용
			if (obj instanceof Book) {
				((Book) obj).printBook();
			}
			if(obj instanceof Student) {
				((Student) obj).score();
			}
			if(obj instanceof Car) {
				((Car) obj).printCar();
			}
		}
	}
	
	public void test2() {
		ArrayList<Book> list = new ArrayList<Book>();  //list는 book객체만 담을수 있는 arraylist를 담는다
		ArrayList list2 = new ArrayList();
		
		list.add(new Book());
		list.add(new Book());

		
		list2.add(new Book());
		list2.add(new Book());
		list2.add("test book"); //오류뜸
		
		for(Book b: list) {
			b.printBook(); //제너릭스를 설정하면 꺼내올때도 형변환이 필요없다.
		}
		
		for(Object ob: list2) {
			((Book)ob).printBook();
		}

	}
	
	public void test3() {
		HashMap<String, Book> map = new HashMap<String, Book>(); //map에서 제너릭스 설정할때는 key와 value 둘다 설정해야함
		map.put("one", new Book("java"));
		map.put("two", new Book("html"));
		map.put("three", new Book("spring"));
		
		System.out.println(map);
		
		// entryset(), Iterator
		Set<Map.Entry<String, Book>> entry = map.entrySet();
		Iterator<Map.Entry<String, Book>> iter = entry.iterator();
		
		while(iter.hasNext()) {
			Map.Entry<String,Book> ent = iter.next();
			String key = ent.getKey();
			Book value = ent.getValue();
			System.out.println(key+":"+value);
		}
	}
}

class Book{
	private String title;
	public Book() {}
	public Book(String title) {
		this.title = title;
	}
	
	public void printBook() {
		System.out.println("printBook() call ... " );
	}
	
	@Override
	public String toString() {
		return "Book";
	}

}

class Student{
	public Student() {}
	public void score() {
		System.out.println("score() call ... " );
	}
	
	@Override
	public String toString() {
		return "Student";
	}
}

class Car{
	public Car() {}
	public void printCar() {
		System.out.println("printCar() call...");
	}
	
	@Override
	public String toString() {
		return "car";
	}
}
