package com.test01;

public class Variable06 {

	public static void main(String[] args) {
		//(�ٲ��ڷ���)��, (�ٲ��ڷ���)����
		Variable06 test = new Variable06();
		test.test1();
		test.test2();
		test.test3();
	}
	
	public void test1() {
		boolean flag = true;
		//flag = (boolean)100;  //boolean�� ��������ȯ�� �ȵǰ� true, false�� �����ϴ�.
		
		//�ڵ�����ȯ(����������ȯ, upcasting)
		int num = 'A';  //�ƽ�Ű�ڵ�� �ڵ� ����ȯ�� �Ǿ ��°��� 65�� ����.
		System.out.println("num: " + num);
		
		char ch = 97;	//�ƽ�Ű�ڵ�� �ڵ� ����ȯ�� �Ǿ ��°��� a�� ����.
		System.out.println("ch : " + ch);
		
		char ch2 = (char)num; 
		System.out.println("ch2 : " + ch2);
		
		int num2 = -97;
		char ch3 = (char)num2;
		System.out.println("ch3 : " + ch3);
		
		
	}
	
	public void test2() {
		
		int inum = 10;
		long lnum = 100;
		
		int isum = (int)(inum + lnum); //������ ���� inum+lnum�� longŸ���̶�°� �˼�����.
								//���� ���� �ڷ��� + ū �ڷ����� ū�ڷ������� ������ �ȴٴ� �� �˼�����.
								//���� (int)�� �տ� �־� ���� �ڷ�����ȯ ����
		System.out.println("isum: " + isum);
	}
	
	public void test3() {
		//���� -> �Ǽ� �δ� �ڵ�����ȯ�� �ȴ�.
		long lnum = 100;
		float fnum = lnum;
		
		System.out.println("fnum : " + fnum);
		
		// �Ǽ� -> ���� �δ� �ڵ�����ȯ�� �Ͼ�� �ʴ´�. ���� ��������ȯ�� ���ش�.
		double dnum = 10.5;
		int inum = (int)dnum;
		
		System.out.println("inum: " + inum);
		System.out.println("dnum: " + (double)inum); // 10.5�� �� �Ҽ����� �������
	}
}
