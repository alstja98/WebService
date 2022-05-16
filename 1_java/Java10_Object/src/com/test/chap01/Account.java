package com.test.chap01;

public class Account {
	//멤버변수 선언 (필드)(외부에서 접근 불가능)
	private String name = "이창진";
	private String accNo = "123-456-7890";
	private String pwd = "1234";
	private int bankCode = 20;
	private int balance = 0;
	
	//생성자(객체를 생성하기 위한 일종의 메소드)
	public Account() {
		//void는 리턴 타입. 
	}
	
	//입금
	public void in(int money) {
		if(money >0) {
			balance += money;
			System.out.println(name + "님의 계좌에 " + money + "원이 입금 되었습니다.");
		}else {
			System.out.println("잘못된 금액을 입력했따.");
		}
	}
	
	//출금
	public void out(int money) {
		if(money < balance) {
			balance -= money;
			System.out.println(name + "님의 계좌에 " + money + "원이 출금 되었습니다.");
		}else {
			System.out.println("돈업따.");
		}
	}
	
	//잔액조회
	public void display() {
		int no = 0;
		System.out.println(name + "님의 계좌에 잔액은 " + balance + "원 입니다.");
	}
	
	
	
}
