package com.test01;

import java.util.Scanner;

public class IfTest03 {
 //else if ������ ���� ������ �� �� �ִ�.
	public void test() {
		int i = 10;
		int j = 20;
		
		if(i > j) {
			System.out.println(i + " �� " + j + " ���� Ů�ϴ�.");
		}else if(i ==j) {
			System.out.println(i+" �� "+j+" �� �����ϴ�.");
		}else {
			System.out.println(i+" �� "+j+" ���� �۽��ϴ�.");
		}
	}
	
	public void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���");
		int score = sc.nextInt();
		
		if (score >= 90) {
			System.out.println("A���");
		}else if (score < 90 && score >= 80) {
			System.out.println("B���");
		}else if (score < 80 && score >= 70) {
			System.out.println("C���");
		}else if (score < 70 && score >= 60) {
			System.out.println("D���");
		}else {
			System.out.println("F���");
		}
	}
	
	public void test3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���");
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
		
		System.out.printf("�л��� ������ %d �̰� ����� %s �Դϴ�.",score, grade);
	}
}
