package com.test01;

import java.util.Scanner;

public class ArrayTest01 {
	

	public void testArray() {
		int[] arr = new int[5];
		
		/*arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		*/
		
		for (int i = 0; i <5; i++) {
			arr[i] = (i+1)*10;
		}
		
		/*
		int sum = 0;
		sum += arr[0];
		sum += arr[1];
		sum += arr[2];
		sum += arr[3];
		sum += arr[4]; */
		
		int sum =0;
		for(int i = 0 ; i<5; i++) {
			sum += arr[i];
		}
		
		System.out.println("sum : " + sum);
	}
	
	public void testArray2() {
		//�迭�� ����
		//�ڷ���[] ������;
		//�ڷ��� ������[]; �� ����
		//int[] iarr;
		//char carr[];
		
		//�Ҵ�
		//iarr = new int[5];
		//carr = new char[10];
		
		//����� �Ҵ��� ���ÿ�
		int[] iarr = new int[5];
		char carr[] = new char[10];
		
		System.out.println(iarr);
		System.out.println(carr);
		
		System.out.println("iarr�� hashcode: " + iarr.hashCode());
		System.out.println("carr�� hashcode: " + carr.hashCode());
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Ҵ��� �迭�� ���� �Է�: ");
		int size = sc.nextInt();
		
		double[] darr = new double[size];
		
		System.out.println("darr�� hashcode: " + darr.hashCode());
		System.out.println("darr�� ����: " + darr.length);
		
		darr = new double[30];
		
		System.out.println("���� �� darr�� hashcode: " + darr.hashCode());
		System.out.println("���� �� darr�� ����: " + darr.length);
		
		//�迭�� ������ ���°�
		darr = null;
		System.out.println("���� �� darr�� ����: " + darr.length);
		
		//�迭�� �ѹ� ����� ���� ũ��� ������ �Ұ���. ���� �߰��ϴ°Ŵ� ����.
		
		
	}
	
	public void testArray3() {
		int[] iarr = new int[5];
		
		System.out.println(iarr[0]);
		System.out.println(iarr[1]);
		
		int[] iarr2 = {1,2,3,4,5};
		for (int i=0; i<5; i++) {
			System.out.println( iarr2[i]);
		}
		
		//String[] sarr = new String[10];
		//String str = new String(); �� �򰥸�
		
		String[] sarr = {"apple", "home", "soju", "phone" };
		
		for(int i=0; i<4; i++) {
			System.out.println(sarr[i]);
		}
	}
}