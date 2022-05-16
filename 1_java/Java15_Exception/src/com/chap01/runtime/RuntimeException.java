package com.chap01.runtime;

import java.util.Scanner;

import com.chap01.throwPrac.Run;

public class RuntimeException {
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		RuntimeException re = new RuntimeException();
		re.test2();
	}
	
	public void test1() {
		int no =0;
		
		System.out.println("나누는 수 하나 입력");
		int inputNum = sc.nextInt();
		
/*		if(inputNum == 0) {
			System.out.println("0을 입력했습니다.");
		}else {
			int res = no/inputNum;
			System.out.println("나누는 결과: " + res);
		} */
		
		//try catch 처리
		try {
			int res = no/inputNum;
			System.out.println("나누기 결과: " + res);
		}catch(ArithmeticException e) {
			System.out.println("Exception 발생");			
		}
	}
	
	public void test2() {
		try {
		//ClassCastException
		/*	Object obj = 'a';
			System.out.println(obj);
			String str = (String)obj;
			System.out.println(str);	*/
		
		//ArrayIndexOutOfBoundsException
			int arr[] = new int[2];
			arr[0] = 1;
			arr[1] = 2;
			arr[2] = 3;
			System.out.println("이거 실행 될까?");
			
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("이건 다음 배열의 범위를 ㄴ");
			System.out.println(e.getMessage());
		}catch(NullPointerException e) {
			System.out.println();
		}
		
		finally {
			System.out.println("이거까진 실행!!");
		}
				
				
	}
	

}
