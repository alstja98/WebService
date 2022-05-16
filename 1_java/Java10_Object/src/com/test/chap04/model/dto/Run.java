package com.test.chap04.model.dto;

import java.util.Date;

public class Run {

	public static void main(String[] args) {
		//기본생성자로 객체 생성
		User u1 = new User();
		u1.information();
		
		//매개변수있는 생성자로 객체 생성
		User u2 = new User("user01", "pass01", "이창진");
		u2.information();
		
		User u3 = new User("user02", "pass02", "오민섬", new Date());
		u3.information();
	}

}
