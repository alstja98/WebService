package com.test01;

import java.util.Scanner;

public class IfTest02 {
	//if~else
	//�� �� �ϳ��� �����ϴ� ���ǹ�,
	public void test() {
		int i = 20;
		
		if(i<10) { 
			System.out.println(i + " �� 10���� �۽��ϴ�.");
		}else {
			System.out.println(i + " �� 10���� ũ�ų� �����ϴ�.");
		}
	}
	
	public void test2() {
		//���ڸ� �ϳ� �Է¹޾� Ȧ�� ¦������ ���
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է��ϼ���.");
		int num = sc.nextInt();
		if (num%2 == 0) {
			System.out.println(num + " �� ¦���Դϴ�.");
		}else {
			System.out.println(num + " �� Ȧ���Դϴ�.");
		}
	}
	
	public void test3() {
		////50���� ū����� ¦������, Ȧ������ ���
		////50���� ��������� �۴� ��� ���
		
		Scanner sc = new Scanner(System.in);
		System.out.print("0���� ū ���� �Է�: ");
		int num = sc.nextInt();
		if (num >= 50) {
			if (num%2 == 0) {
				System.out.println(num + " �� ¦���Դϴ�");
			}else {
				System.out.println(num + " �� Ȧ���Դϴ�");
			}
		}else {
			System.out.println("50���� �������Դϴ�.");
		}
	}
	
	public void test4() { 
		//���� �ϳ� �Է� �޾� ������� �������� ���. ��, 0�̸� "0�Դϴ�."��� ���
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ���. ");
		int num = sc.nextInt();
		
		if (num == 0) {
			System.out.println("0�Դϴ�.");
		}else {
			if (num >0) {
				System.out.println("����Դϴ�.");
			}else {
				System.out.println("�����Դϴ�.");
			}
			
		}
		
	}
}
