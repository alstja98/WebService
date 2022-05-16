package com.poly.part01.test02;

import java.util.Scanner;

public class Mtest {

	public static void main(String[] args) {
		System.out.print("선택 [1:고양이  2:멍멍이  3:송아지]");
		Scanner sc = new Scanner(System.in);
		int select = sc.nextInt();
		
		Base bse = null;
		
		switch(select) {
		case 1:
			bse = new Cat();
			break;
		case 2:
			bse = new Dog();
			break;
		case 3:
			bse = new Cow();
			break;
		}
		
		bse.start();
		bse.stop();
		
	}

}
