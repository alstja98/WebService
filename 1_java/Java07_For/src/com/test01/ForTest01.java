package com.test01;

import java.util.Scanner;

public class ForTest01 {

	public static void main(String[] args) {
		ForTest01.testFor6();
	}
	
	public static void testFor() {
		//0~10출력
		for(int i=0; i<=10; i++) {
			System.out.println(i);
			
		}
	}
	
	public static void testFor2() {
		//역순
		for(int i=100; i>0; i--) {
			
			System.out.print(i + " ");
			if (i%10==1) {
				System.out.println();
			}
		}
	}
	
	public static void testFor03() {
		int i=1;
		for(;;) {
			System.out.print(i+" ");
			i++;
			if(i==10) {
				break;
			}
		}
	}
	
	
	public static void testFor4() {
		//정수하나를 입력받아 그 수가 양수일때만 그 수의 구구단을 출력
		//양수가 아니면 "반드시 1~9 사이의 양수를 입력" 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("1~9사이의 양수 하나 입력");
		int no = sc.nextInt();
		
		if(no>=1 && no<=9) {
			//구구단 출력
			for(int i = 1; i<=9; i++) {
				System.out.println(no*i);
			}
		}else {
			System.out.println("반드시 1~9사이의 양수를 입력하세요.");
		}
	}
	
	public static void testFor5() {
		//1~100사이의 난수를 구하고
		// 1부터 구한 난수까지의 합을 출력
		int random = (int)(Math.random()*100)+1; //random앞 (int)는 소수점을 날리는 기능. random은 0~0.99999..까지 값임.
		int sum = 0;
		for(int i=1; i<=random; i++) {
			sum += i;
		}
		System.out.println("1부터" + random + " 까지의 합계: " + sum);
		
	}
	
	public static void testFor6() {
		//키보드로 정수 두개 입력
		//작은수~큰수 까지의 합
		Scanner sc = new Scanner(System.in);
		System.out.print("작은수를 입력하세요");
		int i = sc.nextInt();
		System.out.print("큰수를 입력하세요.");
		int j = sc.nextInt();
		int sum = 0;
		for(int a = i; a<=j; a++) {
			sum += a;
					
		}
		System.out.println("작은수 " + i + "부터 큰수 "+ j + "까지의 합은 " + sum + "입니다.");
	}
}
