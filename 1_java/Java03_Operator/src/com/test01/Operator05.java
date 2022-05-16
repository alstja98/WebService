package com.test01;

import java.util.Scanner;

public class Operator05 {

	public static void main(String[] args) {
		new Operator05().opTest1();

	}
	
	public void opTest1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력");
		int num = sc.nextInt();
		
		System.out.println("1부터 100사이의 숫자인지 확인: " + (num >=1 && num <=100));
		
		//영어 대문자인지 확인
		System.out.print("문자 입력: ");
		char ch = sc.next().charAt(0);
		
		System.out.println("영어 대문자인지 확인: " + ( ch >= 'A' && ch <= 'Z' ));
		
		////
		System.out.print("계속 하시겠습니까?(Y/N) : ");
		char ch2 = sc.next().charAt(0);
		
		System.out.println("영문자 y인지 확인: " + ( ch2 == 'Y' || ch2 == 'y'));
		
		
	}
	
}
