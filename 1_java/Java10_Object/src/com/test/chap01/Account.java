package com.test.chap01;

public class Account {
	//������� ���� (�ʵ�)(�ܺο��� ���� �Ұ���)
	private String name = "��â��";
	private String accNo = "123-456-7890";
	private String pwd = "1234";
	private int bankCode = 20;
	private int balance = 0;
	
	//������(��ü�� �����ϱ� ���� ������ �޼ҵ�)
	public Account() {
		//void�� ���� Ÿ��. 
	}
	
	//�Ա�
	public void in(int money) {
		if(money >0) {
			balance += money;
			System.out.println(name + "���� ���¿� " + money + "���� �Ա� �Ǿ����ϴ�.");
		}else {
			System.out.println("�߸��� �ݾ��� �Է��ߵ�.");
		}
	}
	
	//���
	public void out(int money) {
		if(money < balance) {
			balance -= money;
			System.out.println(name + "���� ���¿� " + money + "���� ��� �Ǿ����ϴ�.");
		}else {
			System.out.println("������.");
		}
	}
	
	//�ܾ���ȸ
	public void display() {
		int no = 0;
		System.out.println(name + "���� ���¿� �ܾ��� " + balance + "�� �Դϴ�.");
	}
	
	
	
}
