package com.test.chap03.test01;

public class KindOfVariable { //3번째 줄이 class영역의 시작임.
	//클래스 영역에 작성하는 변수 => 필드
	// 필드 == 멤버변수(클래스가 가지는 멤버라는 의미) == 전역변수(클래스 전역에서 사용할 수 있는 변수라는 의미)
	
	private int globalNum;
	
	public void testMethod(int num) {// 여기서부터 메소드 영역의 시작 
		//메소드 영역에 작성하는 변수 => 지역변수 
		//메소드 괄호 안에 선언하는 변수 => 매개변수
		int localNum; 
		
		System.out.println(localNum); //전역변수는 생성하면 자동으로 값이 초기화되지만, 지역변수는 자동으로 값이 초기화되지 않는다. 따라서 직접 해줘야한다.
		
	}//이 줄 부분이 메소드 영역의 끝
	
	
}//클래스 영역의 끝
