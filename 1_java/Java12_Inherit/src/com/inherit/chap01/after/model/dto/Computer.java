package com.inherit.chap01.after.model.dto;

import java.util.Date;

public class Computer extends Product {
	private String cpu;
	private int hdd;
	private int ram;
	private String os;
	
	//������
	public Computer() {
		super();  //�θ�Ŭ���� ���� �����, computerŬ���� ����
	}

	public Computer(String brand, String productNumber, String productCode, String productName, int price, Date date,
			String cpu, int hdd, int ram, String os) {
		super(brand, productNumber, productCode, productName, price, date);
		this.cpu = cpu;
		this.hdd = hdd;
		this.ram = ram;
		this.os = os;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public int getHdd() {
		return hdd;
	}

	public void setHdd(int hdd) {
		this.hdd = hdd;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	//�θ� �ʵ� �ʱⰪ, �� �ʵ� �ʱⰪ �ϴ� ������
	
	
	//getter&setter
	
	//information
	@Override
	public String information() {
		return super.information() + ", " + cpu + ", " + hdd + ", " + ram +", " + os;
	}
}
