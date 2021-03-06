package com.view;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

import com.controller.LibraryManager;
import com.model.vo.AniBook;
import com.model.vo.Book;
import com.model.vo.CookBook;
import com.model.vo.Member;

public class LibraryMenu {
	private LibraryManager lm = new LibraryManager();
	Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		System.out.println("이름, 나이, 성별을 입력하시오.");
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		System.out.print("성별(남/여) : ");
		char gender = sc.next().charAt(0);
		Member mb1 = new Member();
		int cp = mb1.getCouponCount();
		Member mb = new Member(name, age, gender, cp);
		
		lm.insertMember(mb);
		
		while(true) {
			System.out.println("=========메뉴=========");
			System.out.println("1. 마이페이지");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 대여하기");
			System.out.println("0. 프로그램 종료하기");
			
			System.out.print("메뉴 번호를 입력하세요");
			int i = sc.nextInt();
			switch(i) {
			case 1: 
				System.out.println(lm.myinfo());
				break;
			case 2:
				selectAll();
				break;
			case 3:
				searchBook();
				break;
			case 4:
				rentBook();
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				break;
			default : 
				System.out.println("0~4 사이의 값을 입력하시오.");
				break;
				
			}
		}
	}
	
	public void selectAll() { 
		Book[] bList = lm.selectAll();
		
		for(int i=0; i<bList.length; i++) {
			if(bList[i] instanceof AniBook) {
				System.out.print(i+ "번 도서: " + bList[i].toString());
				System.out.println();
//				AniBook ab = (AniBook)bList[i];
//				System.out.println(ab.toString() );
			}else if(bList[i] instanceof CookBook) {
				System.out.println(i + "번 도서: " + bList[i].toString() );
				System.out.println();
//				CookBook cb = (CookBook)bList[i];
//				System.out.println(cb.toString() );
			}
		}
			
					
	}
	
	public void searchBook() {

	
			System.out.print("검색할 제목 키워드 : ");
			String keyword = sc.next();  //nextLine()으로 받으면 안되는이유는?
			
			Book[] searchList = lm.searchBook(keyword);
			
			Stream<Book> stream01 = Arrays.stream(searchList);
			stream01.forEach(System.out::println);
		
		
		
	}
	
	public void rentBook() {
		
		selectAll();
		
		System.out.print("대여할 도서 번호 선택 : ");
		int index = sc.nextInt();
		int result = lm.rentBook(index);
		
		if(result == 0) {
			System.out.println("성공적으로 대여되었습니다.");
		}else if(result == 1) {
			System.out.println("나이 제한으로 대여 불가능입니다.");
		}else{
			System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었습니다. 마이페이지를 통해 확인하세요.");
		}
	}
}
