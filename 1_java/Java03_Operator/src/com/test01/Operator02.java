package com.test01;

public class Operator02 {
	// ++ : 1 증가
	// -- : 1 감소
	public static void main(String[] args) {
		Operator02 test = new Operator02();
		test.test1();
		

	}

	public void test1() {
		//전위 후위
		int age = 19;
		System.out.println("현재 나이는? " + age);
		
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
		int b = ++a; //a값이 여기서 아에 변화됨. 변화가 안되게 하려면 a+1을 하면 됨
		System.out.println("a : " + a + ", b : " + b);
		
		int c = 10;
		int d = c++; //후위 연산자여서 d에 c값을 넣어주고 그 후에 c 값이 증가
		System.out.println("c: " + c + ", d: " + d);
		
		
		////
		int num1 = 20;
		int result = num1++ * 3;
		System.out.println("result: " + result); //후위연산자는 다른 연산자 처리후 나중에 처리됨
		System.out.println("num1 : " + num1);
		
		int num2 = 20;
		int result2 = ++num2 * 3;
		System.out.println("result2: " + result2); //전위연산자는 우선처리되고 다른 연산자가 처리됨
		
	
	}
	
	
}
