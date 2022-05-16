package com.test01;

public class Variable05 {

	public static void main(String[] args) {
		Variable05 test = new Variable05();
		test.testOverflow();

	}
	
	public void testOverflow() {
		byte bnum = 127;
		bnum = (byte)(bnum + 1);  // 바이트를 곱하는건 아니고 바이트로 형변환을 해주는것.원 형태로 다음 숫자로 넘긴다고 본다.(좀더 이해가 필요)
		
		System.out.println("bnum: " + bnum);
		
	}
	
	
	
}
