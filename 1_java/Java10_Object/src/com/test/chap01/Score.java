package com.test.chap01;

public class Score {
	//��� ����
	private String name = "��â��";
	private int kor = 90;
	private int eng = 86;
	private int math = 97;
	
	//������ -> ��ü�� �����Ҷ� �ʿ����
	public Score() {}
	
	//������ ���� ����ϴ� ���
	public void sum() {
		int sum = 0;
		sum = kor + eng + math;
		System.out.println(name + "���� ���� ������ " + sum + "�Դϴ�. " );
	}
	//����� ���� ����ϴ� ���
	public void avg() {
		double avg = 0;
		avg = (kor + eng + math)/3.0;
		System.out.println(name + "���� ���� ����� " + avg + "�Դϴ�.");
	}
	//���� ���� ������ ���� ������ ã�� ����ϴ� ���
	public void max() {
		
		if (kor<eng && kor>math) {
			System.out.println(name + "���� ���� ������ " + kor + "������ ���� �����ϴ�.");
		}else if(eng>kor && eng>math) {
			System.out.println(name + "���� ���� ������ " + eng + "������ ���� �����ϴ�.");
		}else {
			System.out.println(name + "���� ���� ������ " + math + "������ ���� �����ϴ�.");
		}
	}
	//�ʵ尪 Ȯ���� �� �ִ� ���
	public void prn() {
		System.out.println(name + "�л��� ��������: " + kor +", ��������: " + eng + ", ��������: " + math + " �̴�.");
	}
}
