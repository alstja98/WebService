package com.test.chap01;

public class Score {
	//멤버 변수
	private String name = "이창진";
	private int kor = 90;
	private int eng = 86;
	private int math = 97;
	
	//생성자 -> 객체를 생성할때 필요로함
	public Score() {}
	
	//총합을 구해 출력하는 기능
	public void sum() {
		int sum = 0;
		sum = kor + eng + math;
		System.out.println(name + "님의 과목 총합은 " + sum + "입니다. " );
	}
	//평균을 구해 출력하는 기능
	public void avg() {
		double avg = 0;
		avg = (kor + eng + math)/3.0;
		System.out.println(name + "님의 과목 평균은 " + avg + "입니다.");
	}
	//제일 높은 점수를 받은 과목을 찾아 출력하는 기능
	public void max() {
		
		if (kor<eng && kor>math) {
			System.out.println(name + "님은 국어 점수가 " + kor + "점으로 제일 높습니다.");
		}else if(eng>kor && eng>math) {
			System.out.println(name + "님은 영어 점수가 " + eng + "점으로 제일 높습니다.");
		}else {
			System.out.println(name + "님은 수학 점수가 " + math + "점으로 제일 높습니다.");
		}
	}
	//필드값 확인할 수 있는 기능
	public void prn() {
		System.out.println(name + "학생의 국어점수: " + kor +", 영어점수: " + eng + ", 수학점수: " + math + " 이다.");
	}
}
