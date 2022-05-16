package com.test01;

public class MethodTest01 {

	public static void main(String[] args) {
		//static method �� �غ������ �ʿ���� ������ ������.
		//Ŭ������.�޼ҵ��();
		MethodTest01.publicMethod();
		MethodTest01.protectedMethod();
		MethodTest01.defaultMethod();
		MethodTest01.privateMethod();
		
		MethodTest01 test = new MethodTest01();
		test.NonStaticMethod();
	}
	
	//��𼭳� ����, ( + )
	public static void publicMethod() {
		System.out.println("public method");
	}
	
	
	
	//����� ��� -> ��ӵ� ������ ( # )
	//����� �ƴ� ��� -> ���� ��Ű�� �ȿ���
	protected static void protectedMethod() {
		System.out.println("protected method");
	}
	
	
	//���� ��Ű�� ������ (default)
	static void defaultMethod() { 
		System.out.println("default method");
	}
	
	
	//���� Ŭ���� �������� ( - )
	private static void privateMethod() { 
		System.out.println("private method");
	}
	
	
	// 
	public void NonStaticMethod() {
		System.out.println("non static method");
	}
	
}
