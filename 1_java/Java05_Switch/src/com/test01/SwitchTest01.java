package com.test01;

import java.util.Scanner;

public class SwitchTest01 {
	//Switch
	//조건식의 값에 따라 Case에서 찾아 명령을 수행
	//경우의 수가 많을 때 주로 사용
	
	public void test() {
		int i = 1;
		
		switch(i) {
		case 1: //i값이 1인 경우 여기서부터 아래 코드 전부 출력
			System.out.println("1입니다!");
			break ; //이걸 넣어줘어야 아래 케이스 출력문을 실행하지 않고 스위치문을 빠져나가게 됨.
		
		case 2:	//i값이 2인 경우 여기서부터 아래 코드 전부 출력
			System.out.println("2입니다!");
			break ;
			
		case 3: //i값이 3인 경우 여기서부터 아래 코드 전부 출력
			System.out.println("3입니다!");
			break ;
			 
		default : //i값이 1,2,3이 아닌 경우 여기서부터 아래 코드 전부 출력
			System.out.println("1,2,3 모두 아닙니다!");
		}
		
		///////////////////
		char ch = 'a';
		
		switch(ch) {
		case 'a' :
			System.out.println("a!!");
			break;
		case 'b' :
			System.out.println("b!!");
			break;
		case 'c' :
			System.out.println("c!!");
			break;
		default:
			System.out.println("no!!");
		}
		
		////////////////////
		String str = "빵";
		
		switch(str) {
		case "밥":
			System.out.println("밥이다!");
			break;
		case "빵":
			System.out.println("빵이다!");
			break;
		case "고기":
			System.out.println("고기다!");
			break;
		default :
			System.out.println("물이다!");
			
		}
		
		///////////////
		int no =2 ;
		
		switch(no) {
		case 1:
		case 3:  // case 1,3: 이런 방법이 안되기 때문에 이렇게 작성함.
			System.out.println("홀수입니다.");
			break;
		case 2:
		case 4:
			System.out.println("짝수입니다.");
			break;
		default:
			System.out.println("다른숫자!");
		}
	}
	
	public void test2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요");
		int num = sc.nextInt();
		
		switch(num) {
		case 12:
		case 1:
		case 2:
			System.out.println("겨울");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("봄");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("가을");
			break;
		
		}
	}
	
	public void test3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 두개와 연산기호를 입력하시오");
		int a = sc.nextInt();
		int b = sc.nextInt();
		char c = sc.next().charAt(0);
		
		switch(c) {
		case '+':
			int sum;
			sum = a+b;
			System.out.println("합은 " + sum + "입니다.");
			break;
		case '-':
			int minus;
			minus = a-b;
			System.out.println("차는 " + minus + "입니다.");
			break;
		case '*':
			int mul;
			mul = a*b;
			System.out.println("곱은 " + mul + "입니다.");
			break;
		case '/':
			int nanugi;
			nanugi = a+b;
			System.out.println("나누기는 " + nanugi + "입니다.");
			break;
		
		}
	}
}
