package com.test01;

public class ArrayTest02 {
	public static void main(String[] args) {
		//배열에 데이터 입력
		//a~z
		char[] ch = new char[26];
		for(int i=0; i<26; i++) {
			ch[i] = (char)((int)'a'+i); //아스키코드를 활용하는법!
			
		}
		//1. a~z가 들어있는 일차원 배열 출력
		new ArrayTest02().prn(ch);
		System.out.println();
		
		//2. 배열을 거꾸로 출력
		new ArrayTest02().reverse(ch);
		System.out.println();
		
		//3. 대문자로 변경하여 출력
		new ArrayTest02().upper(ch);
	}
	
	
	public void prn(char[] ch) {
		for(int i=0; i<ch.length; i++) {
			System.out.print(ch[i] + " ");
		}
	}
	

	
	public void reverse(char[] ch) {
		
		char re[] = new char[ch.length];
		int temp = 0;
		
		for(int i=ch.length-1; i>=0; i--) {
			re[temp] = ch[i];
			temp++;		
			
		}
		
		
	}
	
	public void upper(char[] ch) {
		char arr[] = new char[ch.length];
		for(int i=0; i<ch.length; i++) {
			arr[i] = Character.toUpperCase(ch[i]);
			System.out.print(arr[i] + " ");
		}
	}
}
