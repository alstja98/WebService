package com.test01;

public class Variable01 {
	//Ÿ�� ������;
	//������ = ��;
	
	//Ÿ�� ������ = ��;
	public static void main(String[] args) {
		//������ ���α׷��� �����ϴ� �޼ҵ�
		Variable01 test = new Variable01();//Ŭ������ ������ = new Ŭ������ü����;
		//���� ���� ������ �Ʒ� ������ �޼ҵ带 ������ �غ� �Ѱ���
		test.declareVariable(); //������.�޼ҵ��();
		test.initVariable();
	}
	
	public void declareVariable() {
		//����� ���� ���� ����� �ϴ� �޼ҵ�
		
		//������
		//������
		byte bnum; //1byte ũ��
		short snum;  //2byteũ��
		int inum; //4byteũ��
		long lnum; //8byteũ��
		//�Ǽ���
		float fnum; //4byteũ��
		double dnum; //8byteũ��
		//����
		char ch; //
		//��
		boolean isTrue;
		//���ڿ�(������)
		String str; //String�� �빮�ڷ� �����ϴ� ������ �ڹٿ� String�̶��
					//���̺귯�� Ŭ������ ���� ������ �������� ���̱� ����
		//
		bnum = 1;
		snum = 2;
		inum = 4;
		lnum = 8L;
		
		fnum = 4.0f; //f�� ���̴� ������ �Ǽ��� �⺻���� double�̱⶧��
		dnum = 8.0;
		
		ch = 'A'; //���� ����ǥ�� ���� �ϳ��� �ǹ�
		str = "A"; //���� ����ǥ�� ���ڿ��� �ǹ�
		
		isTrue = false;
		
		
		//������ ����� �� ����ϱ�
		System.out.println("bnum�� ��: " + bnum);
		System.out.println("snum�� ��: " + snum);
		System.out.println("inum�� ��: " + inum);
		System.out.println("lnum�� ��: " + lnum);
		
		System.out.println("fnum�� ��: " + fnum);
		System.out.println("dnum�� ��: " + dnum);
		
		System.out.println("ch�� ��: " + ch);
		System.out.println("str�� ��: " + str);
		
		System.out.println("isTrue�� ��: " + isTrue);
		
	}
	
	public void initVariable() {
		//���� ����� ���ÿ� �ʱ�ȭ�ϴ� �޼ҵ�
		int inum = 4;
		double dnum = 8.0;
		char ch = 'A';
		String str = "�ȳ��ϼ���";
		
		System.out.println("inum�� ��: " + inum);
		System.out.println("dnum�� ��: " + dnum);
		System.out.println("ch�� ��: " + ch);
		System.out.println("str�� ��: " + str);
		
	}
	
	
	
}
