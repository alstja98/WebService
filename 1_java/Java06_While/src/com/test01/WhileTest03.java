package com.test01;

public class WhileTest03 {

	public static void main(String[] args) {
		WhileTest03 wt = new WhileTest03();
		
		//1~100�� ���ڸ� �������� ���
		//wt.prn01();
		//1~100�� ���� ��, 2�� ����� ���
		//wt.prn02();
		//1~100�� ���� ��, 7�� ����� ������ ���� ���
		wt.prn03();

	}
	
	public void prn01() {
		int i = 100;
		while(i > 0) {
			System.out.println(i);
			i -= 1;
		}
		
	}
	
	public void prn02() {
		int i = 1;
		while (i<=100) {
			if(i%2==0) {
				System.out.println(i);
				
			}
			i++;		
		}
		
	}
	
	public void prn03() {
		int i = 1;
		int j = 0;
		int sum = 0;
		while (i<=100) {
			if(i%7==0) {
				j++;
				sum += i;
				
			}
			i++;
		}
		System.out.println("7�� ����� ������"+j+"�̰� ������"+sum+"�Դϴ�.");
	}
	
	
}
