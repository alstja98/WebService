package com.test01;

import java.util.Scanner;

public class IfTest03 {
 //else if 구문은 다중 조건을 줄 수 있다.
	public void test() {
		int i = 10;
		int j = 20;
		
		if(i > j) {
			System.out.println(i + " 은 " + j + " 보다 큽니다.");
		}else if(i ==j) {
			System.out.println(i+" 은 "+j+" 와 같습니다.");
		}else {
			System.out.println(i+" 은 "+j+" 보다 작습니다.");
		}
	}
	
	public void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요");
		int score = sc.nextInt();
		
		if (score >= 90) {
			System.out.println("A등급");
		}else if (score < 90 && score >= 80) {
			System.out.println("B등급");
		}else if (score < 80 && score >= 70) {
			System.out.println("C등급");
		}else if (score < 70 && score >= 60) {
			System.out.println("D등급");
		}else {
			System.out.println("F등급");
		}
	}
	
	public void test3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요");
		int score = sc.nextInt();
		String grade = "";
				
		if (score >= 90) {
			if (score >= 95) {
				grade = "A+";
			}else {
				grade = "A";
			}
			
		}else if (score < 90 && score >= 80) {
			if (score >= 85 ) {
				grade = "B+";
			}else {
				grade = "B";
			}
		}else if (score < 80 && score >= 70) {
			if (score >= 75 ) {
				grade = "C+";
			}else {
				grade = "C";
			}
		}else if (score < 70 && score >= 60) {
			if (score >= 65 ) {
				grade = "D+";
			}else {
				grade = "D";
			}
		}else {
			grade = "F";
		}
		
		System.out.printf("학생의 점수는 %d 이고 등급은 %s 입니다.",score, grade);
	}
}
