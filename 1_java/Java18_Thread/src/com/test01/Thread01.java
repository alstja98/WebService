package com.test01;

public class Thread01 {

	public static void main(String[] args) {
		System.out.println("=====main start=======");
		
		
//		MyThread m1 = new MyThread();
//		MyThread m2 = new MyThread();
//		m1.run();
//		m2.run();
		
		Thread m1 = new Thread(new MyThread());
		Thread m2 = new Thread(new MyThread());
		
		m1.start();	//start�޼ҵ�� �ΰ��� �����尡 ���ε��� �۵��ϰԵ�.
		m2.start();
		
		System.out.println("-----main stop-------"); //���ν�������� �� 3���� ���ư��ٰ� ���� ��.
	}

}

class MyThread implements Runnable{

	@Override
	public void run() {
		for(int i=0; i<100; i++) {
			System.out.println("i=" + i);
			}
	}
	
	
}