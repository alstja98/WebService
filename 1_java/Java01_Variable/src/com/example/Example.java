package com.example;

import java.util.Scanner;

public class Example {
	public void example1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �ΰ� �Է�: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println("���ϱ� ��� : " + (num1 + num2));
		System.out.println("���� ��� : " + (num1 - num2));
		System.out.println("���ϱ� ��� : " + (num1 * num2));
		System.out.println("�������� �� : " + (num1 / num2));
		System.out.println("�������� ������ : " + (num1 % num2));
		
	}
	
	public void example2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ���� �Է�: ");
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		
		System.out.println("���� : " + (num1 * num2));
		System.out.println("�ѷ� : " + (num1 + num2)*2);
		
		
	}
	
	public void example3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ��� �Է��Ͻÿ� : ");
		String str = sc.nextLine();
		
		System.out.println("ù���� ���� : " + str.charAt(0));
		System.out.println("�ι��� ���� : " + str.charAt(1));
		System.out.println("������ ���� : " + str.charAt(2));
		System.out.println("�Էµ� ���� ���� : " + str.length());
		
	}

}
