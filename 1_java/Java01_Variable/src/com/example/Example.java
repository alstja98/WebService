package com.example;

import java.util.Scanner;

public class Example {
	public void example1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 두개 입력: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println("더하기 결과 : " + (num1 + num2));
		System.out.println("빼기 결과 : " + (num1 - num2));
		System.out.println("곱하기 결과 : " + (num1 * num2));
		System.out.println("나누기한 몫 : " + (num1 / num2));
		System.out.println("나누기한 나머지 : " + (num1 % num2));
		
	}
	
	public void example2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로 세로 입력: ");
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		
		System.out.println("면적 : " + (num1 * num2));
		System.out.println("둘레 : " + (num1 + num2)*2);
		
		
	}
	
	public void example3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하시오 : ");
		String str = sc.nextLine();
		
		System.out.println("첫번쨰 문자 : " + str.charAt(0));
		System.out.println("두번쨰 문자 : " + str.charAt(1));
		System.out.println("세번쨰 문자 : " + str.charAt(2));
		System.out.println("입력된 글자 갯수 : " + str.length());
		
	}

}
