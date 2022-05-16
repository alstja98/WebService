package com.silsub1;

import java.util.Scanner;

public class example {
	Scanner sc = new Scanner(System.in);
	
	public void printStar1() {
		System.out.print("양수를 입력하세요");
		int num = sc.nextInt();
		int a = 1;
		if (num > 0) {
			for (int i=1; i<=num; i++) {
				for(int j=1; j<=num; j++) {
					if (j==a) {
						System.out.print(a);
						break;
					}else {
						System.out.print("*");
					}
				}
				System.out.println();
				a++;
			}
		}else {
			System.out.println("양수가 아닙니다");
		}
		
	}
	
	public void printStar2() {
		System.out.print("숫자 하나를 입력하시오");
		int num = sc.nextInt();
		int a = 1;
		if(num >0 ) {
			for (int i=1; i<=num; i++ ) {
				for (int j=1; j<=num; j++) {
					if (a==j) {
						System.out.print("*");
						break;
					}else {
						System.out.print("*");
					}
					
				}
				a++;
				System.out.println();
			}
		}else if ( num <0){
			for (int i=1; i<=(-num); i++) {
				for (int j=(-num); j>=i; j-- ) {
					System.out.print("*");
					
				}
				System.out.println();
			}
			
		}else {
			System.out.print("출력기능이 없습니다.:");
		}
	}
	
	public void countInputCharacter() {
		System.out.print("문자열을 입력하세요.");
		String str = sc.nextLine();
		
		for(int i=0; i<str.length(); i++) {
			char temp = str.charAt(i);
			if ( !(temp >= 'a' && temp<= 'z' || temp >= 'A' && temp <= 'Z')) {
				System.out.println("영문자가 아닙니다.");
				return; // return은 countInputCharacter 메소드 자체를 끝내버린다. break는 기능문하나를 끝내는것.
			}
		}
		
		System.out.print("찾을 문자 입력: ");
		char ch = sc.next().charAt(0);
		
		int count=0;
		
		for (int i = 0; i < str.length(); i++) {
			if (ch == str.charAt(i)) {
				count++;
			}
			
		}
		System.out.println(count);
		
		//shift + tap 누르면 tap간격만큼 뒤로 간다.
		//ctrl + shift + f 누르면 코드가 깔끔히 정리된다.
		
		
	}
}
