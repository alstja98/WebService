package com.practice;

import java.util.Scanner;

public class Example {
	public void sample1() { 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수: ");
		int kor = sc.nextInt();
		
		System.out.print("영어 점수: ");
		int eng = sc.nextInt();
		
		System.out.print("수학 점수: ");
		int math = sc.nextInt();
		
		int total;
		total = kor + eng + math;
		
		int everage;
		everage = total/3;
		
		System.out.println("합계 :" + total);
		System.out.println("평균 :" + everage);
				
		System.out.println((kor>=40 && eng>=40 && math>=40 && everage>=60)? "합격":"불합격");
	}
	
	public void sample2() {
		Scanner sc = new Scanner(System.in);
		
		String name;
		System.out.print("학생이름 : ");
		name = sc.nextLine();
		
		int year;
		System.out.print("학년 : ");
		year = sc.nextInt();
		
		int s_class;
		System.out.print("반 : ");
		s_class = sc.nextInt();
		
		int number;
		System.out.print("번호 : ");
		number = sc.nextInt();
		
		char mf;
		System.out.print("성별(M/F)");
		mf = sc.next().charAt(0);
		String res = (mf == 'M')? "남학생":"여학생";
			
				
		double score;
		System.out.print("성적 : ");
		score = sc.nextDouble();
		
		System.out.println(year + "학년 " + s_class + "반 " + res + name + "은 " + "성적이 " + score + "이다.");
		
				
	}
		public void sample4() {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("정수를 하나 입력하시오 : ");
			int num = sc.nextInt();
			
			String result = (num%2==0)?"짝수다":"홀수다";
			System.out.println(result);
			
		}
		
		
	

}
