package com.silsub1;

import java.util.Scanner;

public class example {
	Scanner sc = new Scanner(System.in);
	
	public void printStar1() {
		System.out.print("����� �Է��ϼ���");
		int num = sc.nextInt();
		int a = 1;
		if (num > 0) {
			for (int i=1; i<=num; i++) {
				for(int j=1; j<=num; j++) {
					if (j==a) {
						System.out.print(a);
						break;
					}else {
						System.out.print("*");
					}
				}
				System.out.println();
				a++;
			}
		}else {
			System.out.println("����� �ƴմϴ�");
		}
		
	}
	
	public void printStar2() {
		System.out.print("���� �ϳ��� �Է��Ͻÿ�");
		int num = sc.nextInt();
		int a = 1;
		if(num >0 ) {
			for (int i=1; i<=num; i++ ) {
				for (int j=1; j<=num; j++) {
					if (a==j) {
						System.out.print("*");
						break;
					}else {
						System.out.print("*");
					}
					
				}
				a++;
				System.out.println();
			}
		}else if ( num <0){
			for (int i=1; i<=(-num); i++) {
				for (int j=(-num); j>=i; j-- ) {
					System.out.print("*");
					
				}
				System.out.println();
			}
			
		}else {
			System.out.print("��±���� �����ϴ�.:");
		}
	}
	
	public void countInputCharacter() {
		System.out.print("���ڿ��� �Է��ϼ���.");
		String str = sc.nextLine();
		
		for(int i=0; i<str.length(); i++) {
			char temp = str.charAt(i);
			if ( !(temp >= 'a' && temp<= 'z' || temp >= 'A' && temp <= 'Z')) {
				System.out.println("�����ڰ� �ƴմϴ�.");
				return; // return�� countInputCharacter �޼ҵ� ��ü�� ����������. break�� ��ɹ��ϳ��� �����°�.
			}
		}
		
		System.out.print("ã�� ���� �Է�: ");
		char ch = sc.next().charAt(0);
		
		int count=0;
		
		for (int i = 0; i < str.length(); i++) {
			if (ch == str.charAt(i)) {
				count++;
			}
			
		}
		System.out.println(count);
		
		//shift + tap ������ tap���ݸ�ŭ �ڷ� ����.
		//ctrl + shift + f ������ �ڵ尡 ����� �����ȴ�.
		
		
	}
}
