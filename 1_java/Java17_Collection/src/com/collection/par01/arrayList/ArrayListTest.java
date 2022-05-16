package com.collection.par01.arrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class ArrayListTest {
	
	public void testArrayList() {
		//ArrayList
		ArrayList alist = new ArrayList();
		List list = new ArrayList(); //상위클래스
		Collection clist = new ArrayList(); //최상위클래스
		
		//list는 객체만 저장. autoboxing
		alist.add("apple");
		alist.add(123);
		alist.add(45.67);
		alist.add(new Date());
		
		System.out.println("alist: " + alist);
		
		for (int i=0; i<alist.size(); i++) {
			System.out.println(i + " : " + alist.get(i));
		}
		
		alist.add("apple");
		
		alist.add(1,"banana");
		
		alist.remove(2);
		System.out.println("alist: " + alist);
		
		alist.set(1,  true); //수정
		System.out.println("alist: " + alist);
	}

	public void testArrayList2() {
		ArrayList list = new ArrayList();
		list.add("apple");
		list.add("orange");
		list.add("mango");
		list.add("grape");
		list.add("melon");
		
		System.out.println("list: " + list);
		
		//오름차순 정렬
		Collections.sort(list);
		System.out.println("listsort: " + list);
		
		
	}
}
