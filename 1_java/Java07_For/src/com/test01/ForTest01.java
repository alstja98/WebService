package com.test01;

import java.util.Scanner;

public class ForTest01 {

	public static void main(String[] args) {
		ForTest01.testFor6();
	}
	
	public static void testFor() {
		//0~10���
		for(int i=0; i<=10; i++) {
			System.out.println(i);
			
		}
	}
	
	public static void testFor2() {
		//����
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
		//�����ϳ��� �Է¹޾� �� ���� ����϶��� �� ���� �������� ���
		//����� �ƴϸ� "�ݵ�� 1~9 ������ ����� �Է�" ���
		Scanner sc = new Scanner(System.in);
		System.out.print("1~9������ ��� �ϳ� �Է�");
		int no = sc.nextInt();
		
		if(no>=1 && no<=9) {
			//������ ���
			for(int i = 1; i<=9; i++) {
				System.out.println(no*i);
			}
		}else {
			System.out.println("�ݵ�� 1~9������ ����� �Է��ϼ���.");
		}
	}
	
	public static void testFor5() {
		//1~100������ ������ ���ϰ�
		// 1���� ���� ���������� ���� ���
		int random = (int)(Math.random()*100)+1; //random�� (int)�� �Ҽ����� ������ ���. random�� 0~0.99999..���� ����.
		int sum = 0;
		for(int i=1; i<=random; i++) {
			sum += i;
		}
		System.out.println("1����" + random + " ������ �հ�: " + sum);
		
	}
	
	public static void testFor6() {
		//Ű����� ���� �ΰ� �Է�
		//������~ū�� ������ ��
		Scanner sc = new Scanner(System.in);
		System.out.print("�������� �Է��ϼ���");
		int i = sc.nextInt();
		System.out.print("ū���� �Է��ϼ���.");
		int j = sc.nextInt();
		int sum = 0;
		for(int a = i; a<=j; a++) {
			sum += a;
					
		}
		System.out.println("������ " + i + "���� ū�� "+ j + "������ ���� " + sum + "�Դϴ�.");
	}
}
