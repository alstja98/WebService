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
		
		m1.start();	//start메소드로 두개의 스레드가 따로따로 작동하게됨.
		m2.start();
		
		System.out.println("-----main stop-------"); //메인스레드까지 총 3개가 돌아갔다고 보면 됨.
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