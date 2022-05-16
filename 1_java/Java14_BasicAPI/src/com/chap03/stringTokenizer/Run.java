package com.chap03.stringTokenizer;

import java.util.StringTokenizer;

public class Run {
	
	//countToken : 토큰 수 파악
	//nextToken : 토큰 읽어오기
	//hasMoreToken : 토큰이 남아있는지 확인, boolean
	public static void main(String[] args) {
		String str = "오민섬, 25, 서울시 동대문구, 남";
		StringTokenizer st = new StringTokenizer(str, ",");
		System.out.println(st.countTokens());
		
		while(st.hasMoreTokens()) { //토큰이 있으면 true값을 출력해서 while문에서 반복
			System.out.println(st.nextToken()); //다음토큰으로 넘어가면서 마지막에 토큰이 없으면 false출력하고 while문 나감
		}
	}

}
