package com.test01;

import java.util.Scanner;

public class WhileTest01 {

	public static void main(String[] args) {
		WhileTest01 wt = new WhileTest01();
		wt.testWhile4_1();

	}
	
	public void testWhile() {
		//�ʱ��
		int i = 0;
		while(i<8) {
			System.out.println(i + "��° �ݺ��� ������");
			
			i++;
		}
	}
	
	public void testWhile2() {
		//���ڿ��� �Է¹޾� �ε������� ����(char)�� ���
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ� �Է�: ");
		String str = sc.next();
		
		int i = 0;
		
		while (i< str.length()) {
			char ch = str.charAt(i);
			System.out.println(i + " : "+ ch);
			i++;
		}
				
	}
	
	public void testWhile3() {
		//1���� �Է¹��� �� ������ ���� ������
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է��ϼ���.");
		int i = sc.nextInt();
		int j = 1;
		while (j <= i) {
			sum += j ;
			j++ ;
		}
		System.out.println("1���� " + i + "���� ���� ���� "+ sum + "�Դϴ�.");
		
	}
	
	public void testWhile4() {
		int i=1;
		while(true) {
			System.out.println(i);
			i++;
			
			if(i==10) {
				break; //���尡��� �ݺ����� Ż����.
			}
		}
	}
	
	public void testWhile4_1() {
		//Ű����� ������ �Է¹޴´�.
		//�Է¹��� ���ڰ� 4�̸� while�� ����.
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��Ͻÿ�.");
		int i = sc.nextInt();
		
		while ( i != 4) {
			System.out.println("�Է¹��� ���ڰ� 4�� �ƴմϴ�.�ٽ��Է��ϼ���.");
			i = sc.nextInt();
			if (i==4) {
				System.out.println("�Է¹������ڰ� 4�Դϴ�. �����մϴ�.");
				break;
			}
		}
		//�� ����� ����
		/*while(true) {
			System.out.print("�����Է�:");
			int i = sc.nextInt();
			
			if(i == 4) {
				System.out.println("4�� �ԷµǾ���. ����");
				break;
			}
		}*/
	}
}
