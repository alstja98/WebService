package com.test01;

public class ArrayTest02 {
	public static void main(String[] args) {
		//�迭�� ������ �Է�
		//a~z
		char[] ch = new char[26];
		for(int i=0; i<26; i++) {
			ch[i] = (char)((int)'a'+i); //�ƽ�Ű�ڵ带 Ȱ���ϴ¹�!
			
		}
		//1. a~z�� ����ִ� ������ �迭 ���
		new ArrayTest02().prn(ch);
		System.out.println();
		
		//2. �迭�� �Ųٷ� ���
		new ArrayTest02().reverse(ch);
		System.out.println();
		
		//3. �빮�ڷ� �����Ͽ� ���
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
