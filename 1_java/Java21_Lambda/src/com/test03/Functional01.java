package com.test03;

import java.util.function.UnaryOperator;

public class Functional01 {

	public static void main(String[] args) {
		unaryTest();
	}
	
	public static void  unaryTest() {
		//UnaryOperator : �Ű����� ���� �ϳ�, ������ type ��ü�� ����
		//apply() 
		UnaryOperator<String> hello = (name) -> "Hello, " + name;
		
		System.out.println(hello.apply("Lambda"));

	}

}