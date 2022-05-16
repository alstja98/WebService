package com.inherit.chap01.after.model.dto;

import java.util.Date;

public class Computer extends Product {
	private String cpu;
	private int hdd;
	private int ram;
	private String os;
	
	//생성자
	public Computer() {
		super();  //부모클래스 먼저 만들고, computer클래스 만듦
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

	//부모 필드 초기값, 내 필드 초기값 하는 생성자
	
	
	//getter&setter
	
	//information
	@Override
	public String information() {
		return super.information() + ", " + cpu + ", " + hdd + ", " + ram +", " + os;
	}
}
