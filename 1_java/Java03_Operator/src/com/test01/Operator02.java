package com.test01;

public class Operator02 {
	// ++ : 1 ����
	// -- : 1 ����
	public static void main(String[] args) {
		Operator02 test = new Operator02();
		test.test1();
		

	}

	public void test1() {
		//���� ����
		int age = 19;
		System.out.println("���� ���̴�? " + age);
		
		++age;
		System.out.println("++age : " + age);
		
		age++;
		System.out.println("age++ : " + age);
		
		--age;
		System.out.println("--age : " + age);
		
		age--;
		System.out.println("age-- : " + age);
		
		////
		int a = 10;
		int b = ++a; //a���� ���⼭ �ƿ� ��ȭ��. ��ȭ�� �ȵǰ� �Ϸ��� a+1�� �ϸ� ��
		System.out.println("a : " + a + ", b : " + b);
		
		int c = 10;
		int d = c++; //���� �����ڿ��� d�� c���� �־��ְ� �� �Ŀ� c ���� ����
		System.out.println("c: " + c + ", d: " + d);
		
		
		////
		int num1 = 20;
		int result = num1++ * 3;
		System.out.println("result: " + result); //���������ڴ� �ٸ� ������ ó���� ���߿� ó����
		System.out.println("num1 : " + num1);
		
		int num2 = 20;
		int result2 = ++num2 * 3;
		System.out.println("result2: " + result2); //���������ڴ� �켱ó���ǰ� �ٸ� �����ڰ� ó����
		
	
	}
	
	
}
