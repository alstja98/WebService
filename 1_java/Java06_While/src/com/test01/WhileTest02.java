package com.test01;

import java.util.Scanner;

public class WhileTest02 {

	public static void main(String[] args) {
		WhileTest02 wt = new WhileTest02();
		wt.testDoWhile2();

	}
	
	public void testDoWhile() {
		int i = 11;
		
		do {
			System.out.println(i);
			i++;
			
		}while(i<10);
		
		System.out.println("while ���� �� : " +i);
	}
	
	public void testDoWhile2() {
		//Ű����� ���� ���ڿ��� �Է� �޾� ���
		//"end" �Է� �� ����
		Scanner sc = new Scanner(System.in);
		String str = null;
		
		do {
			System.out.print("���ڿ� �Է�: ");
			str = sc.next();
			
			System.out.println("str : " + str);
		}while( !str.equals("end")); //while�� true���� �ݺ�, false�� Ż��
							  //do{}�ȿ� ������ String str�� �ۿ��� ������ �ȵ�. ���� do �ۿ� str�� �����ص�
							  //���ڿ� ������ �񱳴� == , != ���δ� �ȵ�. equals() �޼ҵ带 �̿��ؾ���
	}
}
