package com.test01;

import java.util.Scanner;

public class ForTest02 {

	public static void main(String[] args) {
		ForTest02.testFor4();
	}
	
	public static void testFor1() {
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				System.out.println("i= "+i+", j= " + j);
			}
		}
	}
	
	public static void testFor2() {
		//������ 2�ܺ��� 9�ܱ��� ���
		for(int i=2; i<10; i++) {
			for(int j=1; j<10; j++) {
				System.out.println(i + " * " + j + " = " + i*j);
			}
			System.out.println();
		}
	}
	
	public static void testFor3() {
		
		for(int r=1; r<=5; r++) {
			
			for (int c=1; c<=5; c++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void testFor4() {
		//�� �ٿ� ��ǥ���ڸ� �Էµ� �ټ��� ĭ����ŭ ���
		Scanner sc = new Scanner(System.in);
		System.out.print("��� ���� ���� �Է��Ͻÿ�");
		int low = sc.nextInt();

		for (int i=1; i<=low; i++) {
			for (int j=1; j<=low; j++) {
				if (i==j) {
					System.out.print(j);
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}

