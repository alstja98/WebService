package com.chap03.stringTokenizer;

import java.util.StringTokenizer;

public class Run {
	
	//countToken : ��ū �� �ľ�
	//nextToken : ��ū �о����
	//hasMoreToken : ��ū�� �����ִ��� Ȯ��, boolean
	public static void main(String[] args) {
		String str = "���μ�, 25, ����� ���빮��, ��";
		StringTokenizer st = new StringTokenizer(str, ",");
		System.out.println(st.countTokens());
		
		while(st.hasMoreTokens()) { //��ū�� ������ true���� ����ؼ� while������ �ݺ�
			System.out.println(st.nextToken()); //������ū���� �Ѿ�鼭 �������� ��ū�� ������ false����ϰ� while�� ����
		}
	}

}
