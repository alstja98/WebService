package com.test01;

public class MethodTest01 {

	public static void main(String[] args) {
		//static method 는 준비과정이 필요없이 실행이 가능함.
		//클래스명.메소드명();
		MethodTest01.publicMethod();
		MethodTest01.protectedMethod();
		MethodTest01.defaultMethod();
		MethodTest01.privateMethod();
		
		MethodTest01 test = new MethodTest01();
		test.NonStaticMethod();
	}
	
	//어디서나 접근, ( + )
	public static void publicMethod() {
		System.out.println("public method");
	}
	
	
	
	//상속일 경우 -> 상속된 곳에서 ( # )
	//상속이 아닌 경우 -> 같은 패키지 안에서
	protected static void protectedMethod() {
		System.out.println("protected method");
	}
	
	
	//같은 패키지 내에서 (default)
	static void defaultMethod() { 
		System.out.println("default method");
	}
	
	
	//현재 클래스 내에서만 ( - )
	private static void privateMethod() { 
		System.out.println("private method");
	}
	
	
	// 
	public void NonStaticMethod() {
		System.out.println("non static method");
	}
	
}
