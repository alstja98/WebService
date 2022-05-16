package com.test01;
import java.util.Scanner;

public class Variable02 {
	// Scanner 클래스 -> 키보드로 원하는 변수 입력받기
	public static void main(String[] args) {
		//준비
		Variable02 test = new Variable02();
		
		//실행
		test.inputTest();
		
	}
	
	public void inputTest() {
		//준비
		Scanner sc = new Scanner(System.in);
		//클래스명 변수명 = new 클래스객체
		
		System.out.print("name: ");
		String name = sc.nextLine(); //키보드로 입력을 받아와서 name에 저장
		
		System.out.print("age: ");
		int age = sc.nextInt();
		
		System.out.print("height: ");
		double height = sc.nextDouble();
		
		
		System.out.println("name is " + name);
		System.out.println("age is " + age);
		System.out.println("height is "+ height);
		
		sc.close(); //더이상 스캐너를 안쓸거여서 없애버림. 깜박해도 문제는 잘 없음
	}
	
}
