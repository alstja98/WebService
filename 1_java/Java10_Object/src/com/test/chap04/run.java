package com.test.chap04;

public class run {
	public int test() {
		return 0;
	}
	
	public int test(int b, int a) {
		return 0;
	}
	
	// 매개변수의 개수가 같아도 자료형이 다르면 오버로딩이 적용된다.
	public int test(String s, int a) {
		return 0;
	}
	
	public String test(int a, int b, String str) {
		return null;
	}
	
	/*
	// 반환형이 다르다고 오버로딩이 적용되지는 않는다.
	public int test(int a, int b, String str) {
		return 0;
	}
	
	// 접근제한자가 다르다고 오버로딩이 적용되지는 않는다.
	private String test(int a, int b, String str) {
		return "";
	}
	*/
}
