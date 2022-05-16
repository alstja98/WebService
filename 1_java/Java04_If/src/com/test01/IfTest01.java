package com.test01;

import java.util.Scanner;

public class IfTest01 {
	public void testIf() {
		//단독 if문
		//조건문의 결과가 참이면 { } 안에 코드 실행
		//조건문의 결과가 거짓이면 { } 안에 코드 넘어감
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 한 개 입력하세요: ");
		int num = sc.nextInt();
		
		if(num % 2 == 0) { 
			System.out.println("입력하신 숫자는 짝수입니다.");
			}
		
		//짝수가 아닌지 조건을 확인
		//"입력하신 숫자는 홀수입니다."" 라고 출력
		if( num % 2 == 1) {
			System.out.println("입력하신 숫자는 홀수입니다.");
		}
		System.out.println("프로그램 종료");
		
		
		
		
		
	}
}
