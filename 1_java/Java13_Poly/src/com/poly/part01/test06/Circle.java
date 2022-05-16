package com.poly.part01.test06;

import java.util.Scanner;

public class Circle extends AreaImpl {
	
	@Override
	public void make() {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է�: ");
		int r = sc.nextInt();
		
		double res = r*r*Math.PI;
		
		super.setResult(String.format("%.2f", res)); //format�޼ҵ�� �ٸ� �ڷ����� string���� ��ȯ����. .2f�� �Ҽ��� 2�ڸ�������.
	}
	
	@Override
	public void print() {
		System.out.print("���� ");
		super.print();
	}
		
	
	

}
