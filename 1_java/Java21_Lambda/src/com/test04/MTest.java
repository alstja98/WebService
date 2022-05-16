package com.test04;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MTest {

	public static void main(String[] args) {
		createStream2();
	}
	
	public static void pipeline() {
		//stream을 한개만 실행 하는 것이 아닌, 여러개를 파이프라인으로 함수들을 붙여 실행가능.
		List<String> class504 = Arrays.asList("원현준","양성식","조유정","최승호","이태영","김승우","양성희");
		List<String> s = class504.stream().filter(name -> name.contains("성")).sorted().collect(Collectors.toList());
		System.out.println(s);
		
		class504.stream().filter( name -> name.contains("승")).sorted().map(w->w.replace(w.substring(1,w.length()),"*".repeat(w.length()-1)) ).collect(Collectors.toList()).forEach(System.out::println);
		
		System.out.println(class504.stream().filter(name->name.contains("승")).sorted().collect(Collectors.toList()));
	}
	
	public static void createStream2() {
		String[] arr = new String[] {"1","2","3","4","5","6"};
		Stream<String> stream01 = Arrays.stream(arr);
		stream01.forEach(System.out::println);
		
		List<String> list01 = Arrays.asList(arr);
		list01.forEach(System.out::println);
	}
	
	public static void createStream() {
		//builder : 스트림에 직접적으로 원하는 값 넣을 수있다.
		//build() 메소드를 호출하여 스트림을 리턴
		Stream<String> stream01 = Stream.<String>builder().add("홍길동").add("이순신").add("유관순").build();
		stream01.forEach(System.out::println);
		
		//empty : 비어있는 스트림 생성
		Stream<String> stream02 = Stream.empty();
		System.out.println(stream02.toArray().length);
		
		//generate : 람다 사용 가능(Supplier),
		Stream<Integer> stream03 = Stream.generate( () -> 100 ).limit(5);
		stream03.forEach(System.out::println);
		
		//iterator : 초기값과 해당 값을 다루는 람다를 이용해서 스트림에 들어갈 요소를 만든다.
		Stream<Integer> stream04 = Stream.iterate(1, (i)->++i).limit(5);
		stream04.forEach(System.out::println);
		
		//range
		//IntStream range01 = IntStream.range(1, 5);
		IntStream range01 = IntStream.rangeClosed(1,5);
		range01.forEachOrdered((i)->System.out.print(i+" "));
		
	}
}
