package com.test01;
import java.util.Scanner;

public class Variable02 {
	// Scanner Ŭ���� -> Ű����� ���ϴ� ���� �Է¹ޱ�
	public static void main(String[] args) {
		//�غ�
		Variable02 test = new Variable02();
		
		//����
		test.inputTest();
		
	}
	
	public void inputTest() {
		//�غ�
		Scanner sc = new Scanner(System.in);
		//Ŭ������ ������ = new Ŭ������ü
		
		System.out.print("name: ");
		String name = sc.nextLine(); //Ű����� �Է��� �޾ƿͼ� name�� ����
		
		System.out.print("age: ");
		int age = sc.nextInt();
		
		System.out.print("height: ");
		double height = sc.nextDouble();
		
		
		System.out.println("name is " + name);
		System.out.println("age is " + age);
		System.out.println("height is "+ height);
		
		sc.close(); //���̻� ��ĳ�ʸ� �Ⱦ��ſ��� ���ֹ���. �����ص� ������ �� ����
	}
	
}
