package com.test01;

import java.util.Scanner;

public class IfTest02 {
	//if~else
	//둘 중 하나를 선택하는 조건문,
	public void test() {
		int i = 20;
		
		if(i<10) { 
			System.out.println(i + " 은 10보다 작습니다.");
		}else {
			System.out.println(i + " 은 10보다 크거나 같습니다.");
		}
	}
	
	public void test2() {
		//숫자를 하나 입력받아 홀수 짝수인지 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요.");
		int num = sc.nextInt();
		if (num%2 == 0) {
			System.out.println(num + " 은 짝수입니다.");
		}else {
			System.out.println(num + " 은 홀수입니다.");
		}
	}
	
	public void test3() {
		////50보다 큰수라면 짝수인지, 홀수인지 출력
		////50보다 작은수라면 작다 라고 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("0보다 큰 정수 입력: ");
		int num = sc.nextInt();
		if (num >= 50) {
			if (num%2 == 0) {
				System.out.println(num + " 은 짝수입니다");
			}else {
				System.out.println(num + " 은 홀수입니다");
			}
		}else {
			System.out.println("50보다 작은수입니다.");
		}
	}
	
	public void test4() { 
		//숫자 하나 입력 받아 양수인지 음수인지 출력. 단, 0이면 "0입니다."라고 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요. ");
		int num = sc.nextInt();
		
		if (num == 0) {
			System.out.println("0입니다.");
		}else {
			if (num >0) {
				System.out.println("양수입니다.");
			}else {
				System.out.println("음수입니다.");
			}
			
		}
		
	}
}
