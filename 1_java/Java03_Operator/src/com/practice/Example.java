package com.practice;

import java.util.Scanner;

public class Example {
	public void sample1() { 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ����: ");
		int kor = sc.nextInt();
		
		System.out.print("���� ����: ");
		int eng = sc.nextInt();
		
		System.out.print("���� ����: ");
		int math = sc.nextInt();
		
		int total;
		total = kor + eng + math;
		
		int everage;
		everage = total/3;
		
		System.out.println("�հ� :" + total);
		System.out.println("��� :" + everage);
				
		System.out.println((kor>=40 && eng>=40 && math>=40 && everage>=60)? "�հ�":"���հ�");
	}
	
	public void sample2() {
		Scanner sc = new Scanner(System.in);
		
		String name;
		System.out.print("�л��̸� : ");
		name = sc.nextLine();
		
		int year;
		System.out.print("�г� : ");
		year = sc.nextInt();
		
		int s_class;
		System.out.print("�� : ");
		s_class = sc.nextInt();
		
		int number;
		System.out.print("��ȣ : ");
		number = sc.nextInt();
		
		char mf;
		System.out.print("����(M/F)");
		mf = sc.next().charAt(0);
		String res = (mf == 'M')? "���л�":"���л�";
			
				
		double score;
		System.out.print("���� : ");
		score = sc.nextDouble();
		
		System.out.println(year + "�г� " + s_class + "�� " + res + name + "�� " + "������ " + score + "�̴�.");
		
				
	}
		public void sample4() {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("������ �ϳ� �Է��Ͻÿ� : ");
			int num = sc.nextInt();
			
			String result = (num%2==0)?"¦����":"Ȧ����";
			System.out.println(result);
			
		}
		
		
	

}
