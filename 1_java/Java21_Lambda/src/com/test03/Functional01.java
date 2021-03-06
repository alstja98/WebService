package com.test03;

import java.util.function.UnaryOperator;

public class Functional01 {

	public static void main(String[] args) {
		unaryTest();
	}
	
	public static void  unaryTest() {
		//UnaryOperator : 매개변수 인자 하나, 동일한 type 객체를 리턴
		//apply() 
		UnaryOperator<String> hello = (name) -> "Hello, " + name;
		
		System.out.println(hello.apply("Lambda"));

	}

}
