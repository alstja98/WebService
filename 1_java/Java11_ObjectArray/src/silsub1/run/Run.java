package silsub1.run;

import silsub1.model.vo.Member;

public class Run {

	public static void main(String[] args) {
		Member lee = new Member();
		
		//setter�� �� ����
		lee.setMemberId("user01");
		lee.setMemberPwd("pass01");
		lee.setMemberName("��â��");
		lee.setAge(19);
		lee.setGender('M');
		lee.setPhone("010-1111-1111");
		lee.setEmail("user01@naver.com");
		
		//getter�� �� ��ȸ
		System.out.println(lee.getMemberId());
		System.out.println(lee.getMemberPwd());
		System.out.println(lee.getMemberName());
		System.out.println(lee.getPhone());
		System.out.println(lee.getGender());
		System.out.println(lee.getEmail());
		System.out.println(lee.getAge());
	}

}
