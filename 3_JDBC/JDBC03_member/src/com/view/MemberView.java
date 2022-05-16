package com.view;

import java.util.List;
import java.util.Scanner;

import com.model.dto.Member;
import com.model.service.MemberController;



public class MemberView {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MemberController mc= new MemberController();
		
		int select = 0;
		
		do {
			System.out.println("****************");
			System.out.println("1.전체출력");
			System.out.println("2.선택출력");
			System.out.println("3.추가");
			System.out.println("4.수정");
			System.out.println("5.삭제");
			System.out.println("6.종료");
			System.out.println("****************");
			System.out.print("메뉴선택 : ");
			select = sc.nextInt();
			
			switch(select) {
			case 1:
				System.out.println("---전체선택---");
				List<Member> res = mc.selectAll();
				
				for(Member m : res) {
					System.out.println(m);
				}
				break;
			case 2:
				System.out.println("---선택출력---");
				System.out.println("번호 입력: ");
				int no = sc.nextInt();
				
				Member resOne = mc.selectOne(no);
				System.out.println(resOne);
				break;
			case 3:
				System.out.println("----추가----");
				System.out.println("추가할 데이터를 입력해 주세요.");
				System.out.print("이름: ");
				String name = sc.next();
				System.out.print("나이: ");
				int age = sc.nextInt();
				System.out.print("성별[M/F]: ");
				String gender = sc.next();
				System.out.print("지역: ");
				String loc = sc.next();
				System.out.print("직업: ");
				String job = sc.next();
				System.out.println("전화번호: ");
				String tel = sc.next();
				System.out.println("이메일: ");
				String email = sc.next();
				
				Member insert = new Member(0,name,age,gender,loc,job,tel,email);
				
				int inRes = mc.insert(insert);
				if(inRes >0) {
					System.out.println("추가 성공");
				}else {
					System.out.println("추가 실패");
				}break;
				
			case 4:
				System.out.println("---수정---");
				//이름, 나이, 성별, 전화번호 --> 수정
				System.out.print("수정할 Member의 번호를 입력하세요: ");
				int upNo = sc.nextInt();
				System.out.print("수정할 이름 : ");
				String upName = sc.next();
				System.out.print("수정할 나이 : ");
				int upAge = sc.nextInt();
				System.out.println("수정할 성별 : ");
				String upGender = sc.next();
				System.out.println("수정할 전화번호 : ");
				String upTel = sc.next();
				
				// Member update = new Member(upNo, upName, upAge, upGender, null, null, upTel, null);
				Member update = new Member();
				update.setM_no(upNo);
				update.setM_name(upName);
				update.setM_age(upAge);
				update.setM_gender(upGender);
				update.setM_tel(upTel);
				
				int upRes = mc.update(update);
				if(upRes>0)  {
					System.out.println("수정 성공");
				}else {
					System.out.println("수정 실패");
				}
				break;
				
			case 5:
				System.out.println("----삭제----");
				System.out.print("삭제할 번호를 입력: ");
				int del = sc.nextInt();
				
				int delRes = mc.delete(del);
				if(delRes>0) {
					System.out.println("삭제 성공");
				}else {
					System.out.println("삭제 실패");
				}
				break;
			case 6:
				System.out.println("프로그램이 종료되었습니다.");
				return;
			}
		}while(true);
		
		
		
	}

}
