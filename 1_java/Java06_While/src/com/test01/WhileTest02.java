package com.test01;

import java.util.Scanner;

public class WhileTest02 {

	public static void main(String[] args) {
		WhileTest02 wt = new WhileTest02();
		wt.testDoWhile2();

	}
	
	public void testDoWhile() {
		int i = 11;
		
		do {
			System.out.println(i);
			i++;
			
		}while(i<10);
		
		System.out.println("while 종료 후 : " +i);
	}
	
	public void testDoWhile2() {
		//키보드로 영어 문자여를 입력 받아 출력
		//"end" 입력 시 종료
		Scanner sc = new Scanner(System.in);
		String str = null;
		
		do {
			System.out.print("문자열 입력: ");
			str = sc.next();
			
			System.out.println("str : " + str);
		}while( !str.equals("end")); //while은 true여야 반복, false면 탈출
							  //do{}안에 선언한 String str은 밖에서 적용이 안됨. 따라서 do 밖에 str을 선언해둠
							  //문자열 끼리의 비교는 == , != 으로는 안됨. equals() 메소드를 이용해야함
	}
}
