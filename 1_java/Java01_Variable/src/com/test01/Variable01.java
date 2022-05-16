package com.test01;

public class Variable01 {
	//타입 변수명;
	//변수명 = 값;
	
	//타입 변수명 = 값;
	public static void main(String[] args) {
		//메인은 프로그램을 실행하는 메소드
		Variable01 test = new Variable01();//클래스명 변수명 = new 클래스명객체생성;
		//위와 같은 과정은 아래 설정한 메소드를 실행할 준비를 한것임
		test.declareVariable(); //변수명.메소드명();
		test.initVariable();
	}
	
	public void declareVariable() {
		//여기는 변수 선언 기능을 하는 메소드
		
		//숫자형
		//정수형
		byte bnum; //1byte 크기
		short snum;  //2byte크기
		int inum; //4byte크기
		long lnum; //8byte크기
		//실수형
		float fnum; //4byte크기
		double dnum; //8byte크기
		//문자
		char ch; //
		//논리
		boolean isTrue;
		//문자열(참조형)
		String str; //String이 대문자로 시작하는 이유는 자바에 String이라는
					//라이브러리 클래스가 따로 존재해 가져오는 것이기 때문
		//
		bnum = 1;
		snum = 2;
		inum = 4;
		lnum = 8L;
		
		fnum = 4.0f; //f를 붙이는 이유는 실수의 기본형이 double이기때문
		dnum = 8.0;
		
		ch = 'A'; //단일 따옴표는 문자 하나를 의미
		str = "A"; //더블 따옴표는 문자열을 의미
		
		isTrue = false;
		
		
		//변수에 저장된 값 출력하기
		System.out.println("bnum의 값: " + bnum);
		System.out.println("snum의 값: " + snum);
		System.out.println("inum의 값: " + inum);
		System.out.println("lnum의 값: " + lnum);
		
		System.out.println("fnum의 값: " + fnum);
		System.out.println("dnum의 값: " + dnum);
		
		System.out.println("ch의 값: " + ch);
		System.out.println("str의 값: " + str);
		
		System.out.println("isTrue의 값: " + isTrue);
		
	}
	
	public void initVariable() {
		//변수 선언과 동시에 초기화하는 메소드
		int inum = 4;
		double dnum = 8.0;
		char ch = 'A';
		String str = "안녕하세요";
		
		System.out.println("inum의 값: " + inum);
		System.out.println("dnum의 값: " + dnum);
		System.out.println("ch의 값: " + ch);
		System.out.println("str의 값: " + str);
		
	}
	
	
	
}
