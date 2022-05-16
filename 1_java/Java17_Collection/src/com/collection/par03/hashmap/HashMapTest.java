package com.collection.par03.hashmap;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
	public void testHashMap() {
		HashMap hmap = new HashMap();
		
		hmap.put("one", new Date());
		hmap.put(12, "red");
		hmap.put(34.56,333);
		
		System.out.println("hmap: " + hmap);
		
		hmap.put(11, "yellow");
		hmap.put(9, "yellow");
		System.out.println("hmap: " + hmap);
		
		//
		System.out.println("key 9에 대한 value: " + hmap.get(9));
		
		hmap.remove(9);
		System.out.println("hmap: " + hmap);
		
		System.out.println("저장된 객체 수 : " +hmap.size());
		
		
	}
	
	public void testHashMap2() {
		HashMap hmap = new HashMap();
		
		hmap.put("one", "variablle");
		hmap.put("two", "Operator");
		hmap.put("three", "if");
		hmap.put("four", "switch");
		hmap.put("five", "while");
		
		// 순차적으로 map요소들을 출력하는 법
		
		// 1. keyset() : key만 따로 set으로 만든다.
		Set keys = hmap.keySet();
		Iterator keyItor = keys.iterator();
		
		while(keyItor.hasNext()) {
			String key = (String)keyItor.next();
			String value = (String)hmap.get(key);
			System.out.println(key + " : " + value);
		}
		System.out.println();
		
		// 2. entryset() : entry만 따로 set으로 만든다. (entry는 key와 value의 묶음)
		Set set = hmap.entrySet();
		Iterator entryIter = set.iterator();
		
		while(entryIter.hasNext()) {
			Map.Entry entry = (Map.Entry)entryIter.next(); //자료형이 객체이므로 해당 객체로 형변환 해준다.
			System.out.println(entry.getKey() + " : " + entry.getValue());
			
		}
		System.out.println();
		
		//3. values() : Collection
		Collection values = hmap.values();
		
		//3-1 Iterator
		Iterator valueIter = values.iterator();
		while(valueIter.hasNext()) {
			System.out.println(valueIter.next());
		}
		System.out.println();
		
		//3-2 toArray()
		Object[] vArr = values.toArray();
		for(int i=0; i<vArr.length; i++ ) {
			System.out.println(i + " : " + vArr[i]);
		}
		
		
		
		
		
	}
	
	
	
	
	
}
