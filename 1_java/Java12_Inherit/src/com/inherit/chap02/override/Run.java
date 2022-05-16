package com.inherit.chap02.override;

public class Run {

	public static void main(String[] args) {
		Book b1 = new Book("������ ����", "������", 100);
		Book b2 = new Book("�ڹ��� ����", "���ڹ�", 200);
		
		System.out.println("b1 = " + b1.toString());
		System.out.println("b2 = " + b2.toString());
	
		//��
		System.out.println("b1�� b2�� ���� ��ü?: " + b1.equals(b2)); //false
		
		Book b3 = b1;
		System.out.println("b1�� b3�� ���� ��ü?: " + b1.equals(b3)); //true
		
		//b1�� ���� ������ ��ü ����
		Book b4 = new Book("������ ����", "������", 100);
		System.out.println("b1�� b4�� ���� ��ü?: " + b1.equals(b4)); //false  //Book.java �ڿ� ���� ������ true�� �����ϴ� �ڵ� �߰��ϸ� true
		
		
		
		
	}

}
