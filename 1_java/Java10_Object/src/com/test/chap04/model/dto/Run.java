package com.test.chap04.model.dto;

import java.util.Date;

public class Run {

	public static void main(String[] args) {
		//�⺻�����ڷ� ��ü ����
		User u1 = new User();
		u1.information();
		
		//�Ű������ִ� �����ڷ� ��ü ����
		User u2 = new User("user01", "pass01", "��â��");
		u2.information();
		
		User u3 = new User("user02", "pass02", "���μ�", new Date());
		u3.information();
	}

}
