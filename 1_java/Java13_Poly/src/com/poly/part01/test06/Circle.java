package com.poly.part01.test06;

import java.util.Scanner;

public class Circle extends AreaImpl {
	
	@Override
	public void make() {
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름 입력: ");
		int r = sc.nextInt();
		
		double res = r*r*Math.PI;
		
		super.setResult(String.format("%.2f", res)); //format메소드는 다른 자료형을 string으로 변환해줌. .2f는 소수점 2자리수까지.
	}
	
	@Override
	public void print() {
		System.out.print("원의 ");
		super.print();
	}
		
	
	

}
