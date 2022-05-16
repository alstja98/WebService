package com.test01;

public class MethodTest02 {

	public static void main(String[] args) {
		//static : class.method();
		MethodTest01.publicMethod();
		MethodTest01.protectedMethod();
		MethodTest01.defaultMethod();
		//MethodTest01.privateMethod(); //같은 클래스 내에 속하지 않은 메소드여서 실행불가능함.
		
		//non static : class 변수명 = new class();
		//변수명.method()
		MethodTest01 test = new MethodTest01();
		test.NonStaticMethod();

	}

}
