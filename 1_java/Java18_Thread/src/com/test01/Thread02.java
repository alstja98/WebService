package com.test01;

class MyThread02 extends Thread {
	
	public MyThread02(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		for(int i=0; i<100; i++) {
			System.out.println(this.getName() + " = " + i);
		}
		System.out.println(this.getName() + " 끝");
	}
}

public class Thread02 {

	public static void main(String[] args) {
		MyThread02 m1 = new MyThread02("야옹");
		MyThread02 m2 = new MyThread02("멍멍");
		
		//thread scheduling
		//우선순위(priority) , 순환할당(round_robin)
		//순환할당은 JVM에 의해 결정이 된다. 개발자가 임의로 수정이 불가하다.
		m1.setPriority(10);
		m2.setPriority(Thread.MIN_PRIORITY);
		
		m1.start();
		m2.start();
	}

}
