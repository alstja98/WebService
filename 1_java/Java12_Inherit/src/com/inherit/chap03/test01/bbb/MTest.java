package com.inherit.chap03.test01.bbb;

import com.inherit.chap03.test01.aaa.AAA;

public class MTest {

	public static void main(String[] args) {
		BBB b1 = new BBB();
		b1.setAbc(1);
		b1.setB(2);
		System.out.println(b1.getAbc() + " + " + b1.getB() + " = " + b1.getSum());
	
		BBB b2 = new BBB(3);
		System.out.println(b2.getAbc() + " + " + b2.getB() + " = " + b2.getSum());
		
		BBB b3 = new BBB(5,6);
		System.out.println(b3.getAbc() + " + " + b3.getB() + " = " + b3.getSum());
		
		
	}

}
