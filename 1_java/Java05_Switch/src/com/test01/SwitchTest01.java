package com.test01;

import java.util.Scanner;

public class SwitchTest01 {
	//Switch
	//���ǽ��� ���� ���� Case���� ã�� ����� ����
	//����� ���� ���� �� �ַ� ���
	
	public void test() {
		int i = 1;
		
		switch(i) {
		case 1: //i���� 1�� ��� ���⼭���� �Ʒ� �ڵ� ���� ���
			System.out.println("1�Դϴ�!");
			break ; //�̰� �־����� �Ʒ� ���̽� ��¹��� �������� �ʰ� ����ġ���� ���������� ��.
		
		case 2:	//i���� 2�� ��� ���⼭���� �Ʒ� �ڵ� ���� ���
			System.out.println("2�Դϴ�!");
			break ;
			
		case 3: //i���� 3�� ��� ���⼭���� �Ʒ� �ڵ� ���� ���
			System.out.println("3�Դϴ�!");
			break ;
			 
		default : //i���� 1,2,3�� �ƴ� ��� ���⼭���� �Ʒ� �ڵ� ���� ���
			System.out.println("1,2,3 ��� �ƴմϴ�!");
		}
		
		///////////////////
		char ch = 'a';
		
		switch(ch) {
		case 'a' :
			System.out.println("a!!");
			break;
		case 'b' :
			System.out.println("b!!");
			break;
		case 'c' :
			System.out.println("c!!");
			break;
		default:
			System.out.println("no!!");
		}
		
		////////////////////
		String str = "��";
		
		switch(str) {
		case "��":
			System.out.println("���̴�!");
			break;
		case "��":
			System.out.println("���̴�!");
			break;
		case "���":
			System.out.println("����!");
			break;
		default :
			System.out.println("���̴�!");
			
		}
		
		///////////////
		int no =2 ;
		
		switch(no) {
		case 1:
		case 3:  // case 1,3: �̷� ����� �ȵǱ� ������ �̷��� �ۼ���.
			System.out.println("Ȧ���Դϴ�.");
			break;
		case 2:
		case 4:
			System.out.println("¦���Դϴ�.");
			break;
		default:
			System.out.println("�ٸ�����!");
		}
	}
	
	public void test2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���");
		int num = sc.nextInt();
		
		switch(num) {
		case 12:
		case 1:
		case 2:
			System.out.println("�ܿ�");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("��");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("����");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("����");
			break;
		
		}
	}
	
	public void test3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ΰ��� �����ȣ�� �Է��Ͻÿ�");
		int a = sc.nextInt();
		int b = sc.nextInt();
		char c = sc.next().charAt(0);
		
		switch(c) {
		case '+':
			int sum;
			sum = a+b;
			System.out.println("���� " + sum + "�Դϴ�.");
			break;
		case '-':
			int minus;
			minus = a-b;
			System.out.println("���� " + minus + "�Դϴ�.");
			break;
		case '*':
			int mul;
			mul = a*b;
			System.out.println("���� " + mul + "�Դϴ�.");
			break;
		case '/':
			int nanugi;
			nanugi = a+b;
			System.out.println("������� " + nanugi + "�Դϴ�.");
			break;
		
		}
	}
}
