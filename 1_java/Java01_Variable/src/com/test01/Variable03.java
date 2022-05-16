package com.test01;

public class Variable03 {
	//변수 선언&초기화
	//키보드로 입력받아 변수에 저장된 값 변경
	public static void main(String[] args) {
		//변수 선언&초기화
		String name = "오민섬";
		char gender = 'M';
		int age = 25;
		
		System.out.println("name: " + name);
		System.out.println("gender: " + gender);
		System.out.println("age: " + age);
		
		//키보드로 입력받아 변수에 저장된 값 변경
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.print("이름 입력: ");
		name = sc.nextLine(); //name은 이미 선언된 변수니까 앞에 String을 붙이면 안됨
		
		System.out.print("성별 입력: ");
		gender = sc.next().charAt(0); //next()는 띄어쓰기를 받아들이지 못함
									  //문자 하나를 받는 next함수가 없어서 문자열을 받아 가공하는 방법을 씀
		System.out.print("나이 입력: ");
		age = sc.nextInt();
		
		
		System.out.println(name);
		System.out.println(gender);
		System.out.println(age);
		
		sc.close();
		
		
	}

}
