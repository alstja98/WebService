package com.test01;

import java.util.Scanner;

public class Operator01 {

	public static void main(String[] args) {
		Operator01.testMethod();

	}
	
	public static void testMethod() {
		// !논리값 : 논리값을 반대로 바꾸는 연산자
		// !true => false 
		System.out.println("true의 부정 : " + !true);
		System.out.println("False의 부정 : " + !false);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 하나 입력: ");
		int num = sc.nextInt();
		
		System.out.println("입력한 정수가 양수인가? " + (num > 0));
		System.out.println("입력한 정수가 양수인가? " + (num < 0));
		
		
	}

}
