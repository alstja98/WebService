package com.inherit.chap03.test01.aaa;

public class AAA {
	private int abc;
	//기본생성자
	public AAA() {
		//.super();
		System.out.println("AAA생성");
	}
	
	public AAA(int abc) {
		super();  //생략 가능
		System.out.println("AAA생성(abc받아서 생성)");
		this.abc = abc;
	}
	
	public int getAbc() {
		return abc;
	}
	
	public void setAbc(int abc) {
		this.abc = abc;
	}
	
	public void prn() {
		System.out.println("AAA의 prn 메소드");
	}
}
