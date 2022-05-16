package com.arrayPractice1;

public class ArraySample {
	public void test1() {
		int[] iarr = new int[10];
		int sum = 0;
		for(int i=0; i<10; i++) {
			iarr[i] = (int)(Math.random()*100 + 1);
			sum += iarr[i];
		}
		
		System.out.println("10개정수의 합계는 : " + sum);
	}
}
