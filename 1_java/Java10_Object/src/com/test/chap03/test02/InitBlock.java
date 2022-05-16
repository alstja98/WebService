package com.test.chap03.test02;

public class InitBlock {
	private String name="������";
	private int price=200;
	private static String brand="����";
	
	{ //�ʱ�ȭ���
		name = "������";
		price = 300;
		brand = "�Ｚ";
		System.out.println("�ʱ�ȭ��");
	}
	
	static {
		name = "����" 	//nonstatic �̾ �ȵ�.
		brand= "LG";		
	}
	//������
	//�⺻ ������
	public InitBlock() {}
	//�Ű����� �ִ� ������
	public InitBlock(String name, int price, String brand) {
		this.name = name;
		this.price = price;
		InitBlock.brand = brand;
	}
	
	public void information() {
		System.out.println(name + ","+ price + "," + brand);
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
}
