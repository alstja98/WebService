package com.test01;

import java.util.Scanner;

public class IfTest01 {
	public void testIf() {
		//�ܵ� if��
		//���ǹ��� ����� ���̸� { } �ȿ� �ڵ� ����
		//���ǹ��� ����� �����̸� { } �ȿ� �ڵ� �Ѿ
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �� �� �Է��ϼ���: ");
		int num = sc.nextInt();
		
		if(num % 2 == 0) { 
			System.out.println("�Է��Ͻ� ���ڴ� ¦���Դϴ�.");
			}
		
		//¦���� �ƴ��� ������ Ȯ��
		//"�Է��Ͻ� ���ڴ� Ȧ���Դϴ�."" ��� ���
		if( num % 2 == 1) {
			System.out.println("�Է��Ͻ� ���ڴ� Ȧ���Դϴ�.");
		}
		System.out.println("���α׷� ����");
		
		
		
		
		
	}
}
