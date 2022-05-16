package com.poly.part01.test06;

import java.util.Scanner;

public class Triangle extends AreaImpl {

	@Override
	public void make() {
		Scanner sc = new Scanner(System.in);
		System.out.print("πÿ∫Ø: ");
		int x = sc.nextInt();
		System.out.print("≥Ù¿Ã: ");
		int y = sc.nextInt();
		
		double res = x*y/2.0;
		
		setResult(String.format("%f", res));
	}
}
