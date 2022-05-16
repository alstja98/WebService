package com.test01;

import java.util.Scanner;

public class WhileTest01 {

	public static void main(String[] args) {
		WhileTest01 wt = new WhileTest01();
		wt.testWhile4_1();

	}
	
	public void testWhile() {
		//초기식
		int i = 0;
		while(i<8) {
			System.out.println(i + "번째 반복문 수행중");
			
			i++;
		}
	}
	
	public void testWhile2() {
		//문자열을 입력받아 인덱스별로 문자(char)를 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력: ");
		String str = sc.next();
		
		int i = 0;
		
		while (i< str.length()) {
			char ch = str.charAt(i);
			System.out.println(i + " : "+ ch);
			i++;
		}
				
	}
	
	public void testWhile3() {
		//1부터 입력받은 수 까지의 합을 구하자
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("수를 입력하세요.");
		int i = sc.nextInt();
		int j = 1;
		while (j <= i) {
			sum += j ;
			j++ ;
		}
		System.out.println("1부터 " + i + "까지 합한 수는 "+ sum + "입니다.");
		
	}
	
	public void testWhile4() {
		int i=1;
		while(true) {
			System.out.println(i);
			i++;
			
			if(i==10) {
				break; //가장가까운 반복문을 탈출함.
			}
		}
	}
	
	public void testWhile4_1() {
		//키보드로 정수를 입력받는다.
		//입력받은 숫자가 4이면 while문 종료.
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하시오.");
		int i = sc.nextInt();
		
		while ( i != 4) {
			System.out.println("입력받은 숫자가 4가 아닙니다.다시입력하세요.");
			i = sc.nextInt();
			if (i==4) {
				System.out.println("입력받은숫자가 4입니다. 종료합니다.");
				break;
			}
		}
		//더 깔끔한 답은
		/*while(true) {
			System.out.print("숫자입력:");
			int i = sc.nextInt();
			
			if(i == 4) {
				System.out.println("4가 입력되었따. 종료");
				break;
			}
		}*/
	}
}
