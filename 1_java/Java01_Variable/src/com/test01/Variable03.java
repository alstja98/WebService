package com.test01;

public class Variable03 {
	//���� ����&�ʱ�ȭ
	//Ű����� �Է¹޾� ������ ����� �� ����
	public static void main(String[] args) {
		//���� ����&�ʱ�ȭ
		String name = "���μ�";
		char gender = 'M';
		int age = 25;
		
		System.out.println("name: " + name);
		System.out.println("gender: " + gender);
		System.out.println("age: " + age);
		
		//Ű����� �Է¹޾� ������ ����� �� ����
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.print("�̸� �Է�: ");
		name = sc.nextLine(); //name�� �̹� ����� �����ϱ� �տ� String�� ���̸� �ȵ�
		
		System.out.print("���� �Է�: ");
		gender = sc.next().charAt(0); //next()�� ���⸦ �޾Ƶ����� ����
									  //���� �ϳ��� �޴� next�Լ��� ��� ���ڿ��� �޾� �����ϴ� ����� ��
		System.out.print("���� �Է�: ");
		age = sc.nextInt();
		
		
		System.out.println(name);
		System.out.println(gender);
		System.out.println(age);
		
		sc.close();
		
		
	}

}
