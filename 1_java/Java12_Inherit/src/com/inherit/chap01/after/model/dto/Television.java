package com.inherit.chap01.after.model.dto;

import java.util.Date;

public class Television extends Product {
	private int inchType;
	
	public Television() {}  //{}안에 super()을 생략하더라도 항상 부모 생성자부터 생성이 되고있다.

	public Television(String brand, String productNumber, String productCode, String productName, int price, Date date,
			int inchType) {
		super(brand, productNumber, productCode, productName, price, date); //부모의 생성자 호출
		this.inchType = inchType;
	}

	public int getInchType() {
		return inchType;
	}

	public void setInchType(int inchType) {
		this.inchType = inchType;
	}

	@Override
	public String information() {
		return super.information() + ", " + inchType;
	}
	
	
	
}
