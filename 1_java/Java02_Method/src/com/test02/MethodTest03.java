package com.test02;

import com.test01.MethodTest01;

public class MethodTest03 {

	public static void main(String[] args) {
		MethodTest01.publicMethod();
		MethodTest01.protectedMethod(); //같은 패키지가 아니어서 불가능
		MethodTest01.defaultMethod(); 	//같은 패키지가 아니어서 불가능
	}

}
