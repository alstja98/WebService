package com.test01;

public class Variable04 {
	//���
	public static void main(String[] args) {
		int age;
		final int AGE;
		
		age = 19;
		AGE = 19;
		
		System.out.println("age: " + age);
		System.out.println("AGE: " + AGE);
		
		//���� �����غ���
		age = 20;
		AGE = 20; // final�� ����̱� ������ ���� �����Ҽ� ����.
	}

}
