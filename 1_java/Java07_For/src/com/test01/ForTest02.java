package com.test01;

import java.util.Scanner;

public class ForTest02 {

	public static void main(String[] args) {
		ForTest02.testFor4();
	}
	
	public static void testFor1() {
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				System.out.println("i= "+i+", j= " + j);
			}
		}
	}
	
	public static void testFor2() {
		//구구단 2단부터 9단까지 출력
		for(int i=2; i<10; i++) {
			for(int j=1; j<10; j++) {
				System.out.println(i + " * " + j + " = " + i*j);
			}
			System.out.println();
		}
	}
	
	public static void testFor3() {
		
		for(int r=1; r<=5; r++) {
			
			for (int c=1; c<=5; c++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void testFor4() {
		//한 줄에 별표문자를 입력된 줄수와 칸수만큼 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("행과 열의 수를 입력하시오");
		int low = sc.nextInt();

		for (int i=1; i<=low; i++) {
			for (int j=1; j<=low; j++) {
				if (i==j) {
					System.out.print(j);
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}


