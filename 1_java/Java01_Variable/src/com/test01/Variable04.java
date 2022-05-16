package com.test01;

public class Variable04 {
	//상수
	public static void main(String[] args) {
		int age;
		final int AGE;
		
		age = 19;
		AGE = 19;
		
		System.out.println("age: " + age);
		System.out.println("AGE: " + AGE);
		
		//값을 변경해보자
		age = 20;
		AGE = 20; // final은 상수이기 때문에 값을 변경할수 없다.
	}

}
