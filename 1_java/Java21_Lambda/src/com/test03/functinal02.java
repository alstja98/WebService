package com.test03;

import java.util.Scanner;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class functinal02 {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		//Predicate
		//매개변수 있고, 반환값도 있따. Boolean 값을 반환.
		predic02();
	}

	public static boolean isNull(String name, Predicate<String> predic) {
		return predic.test(name);
		
	}
	
	public static void predic01() {
		String name = null;
		while(true) {
			System.out.print("이름 입력: ");
			name = sc.nextLine();
			
			if(isNull(name,(input) -> input.trim().length() ==0)) {
				System.out.println("다시 입력해주세요");
			}else {
				sc.close();
				break;
			}
			
			
			
		}
		System.out.println("제 이름은" + name + "입니다.");
	}
	
	public static void predic02() {
		//Bipredicate
		BiPredicate<Integer, Integer> bp01 = (i,j) -> i-j>0;
		
		int i=10;
		int j=20;
		
		if(bp01.test(i, j)) {
			System.out.println("i>j");
		}else {
			System.out.println("i<=j");
		}
	}
}
