package com.test01;

public class Variable06 {

	public static void main(String[] args) {
		//(바꿀자료형)값, (바꿀자료형)변수
		Variable06 test = new Variable06();
		test.test1();
		test.test2();
		test.test3();
	}
	
	public void test1() {
		boolean flag = true;
		//flag = (boolean)100;  //boolean은 강제형변환이 안되고 true, false만 가능하다.
		
		//자동형변환(묵시적형변환, upcasting)
		int num = 'A';  //아스키코드로 자동 형변환이 되어서 출력값이 65가 나옴.
		System.out.println("num: " + num);
		
		char ch = 97;	//아스키코드로 자동 형변환이 되어서 출력값이 a가 나옴.
		System.out.println("ch : " + ch);
		
		char ch2 = (char)num; 
		System.out.println("ch2 : " + ch2);
		
		int num2 = -97;
		char ch3 = (char)num2;
		System.out.println("ch3 : " + ch3);
		
		
	}
	
	public void test2() {
		
		int inum = 10;
		long lnum = 100;
		
		int isum = (int)(inum + lnum); //오류를 보면 inum+lnum은 long타입이라는걸 알수있음.
								//따라서 작은 자료형 + 큰 자료형은 큰자료형으로 적용이 된다는 걸 알수있음.
								//따라서 (int)를 앞에 넣어 강제 자료형변환 해줌
		System.out.println("isum: " + isum);
	}
	
	public void test3() {
		//정수 -> 실수 로는 자동형변환이 된다.
		long lnum = 100;
		float fnum = lnum;
		
		System.out.println("fnum : " + fnum);
		
		// 실수 -> 정수 로는 자동형변환이 일어나지 않는다. 따라서 강제형변환을 해준다.
		double dnum = 10.5;
		int inum = (int)dnum;
		
		System.out.println("inum: " + inum);
		System.out.println("dnum: " + (double)inum); // 10.5의 뒷 소수점은 사라졌음
	}
}
