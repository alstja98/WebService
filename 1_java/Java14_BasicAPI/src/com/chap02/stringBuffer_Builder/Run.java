package com.chap02.stringBuffer_Builder;

public class Run {

	public static void main(String[] args) {
		//Run.method1();
		Run.method2();
	}
	
	public static void method1() {
		StringBuilder sb = new StringBuilder("아아 마이크테스트");
		System.out.println(sb);
		
		String str = "안녕하세요";
		System.out.println("str 기존 : " + str +", 주소: " + System.identityHashCode(str));
		str += "저는 오민섬입니다.";
		System.out.println("str추가 후 : " + str + ", 주소: " + System.identityHashCode(str)); //str을 추가하면 새로운 주소에 공간을 새로 판다.

		StringBuffer sf = new StringBuffer("아침은 아직");
		System.out.println("sf 기존: " + sf + ", 주소: " + sf.hashCode()+ ", 주소: " +System.identityHashCode(sf));
		
		sf.append("쌀쌀하네요!");  //stringBuffer는 += 이런거로 스트링 추가 불가능
		System.out.println("sf 추가 후 : " + sf + ", 주소: " + sf.hashCode()+ ", 주소: " +System.identityHashCode(sf));  //stringBuffer는 내용이 바뀌어도 같은 주소를 갖는다.
		
	}
	
	
	public static void method2() {
		StringBuilder sb = new StringBuilder("난 ");
		
		//append
		sb.append("커피 먹어");
		sb.append("~!");
		System.out.println(sb);
		
		//length
		System.out.println(sb.length());
		
		//insert
		sb.insert(0, "잠이 덜 깨서");
		System.out.println(sb);
		
		//delete
		sb.delete(0, 8);
		System.out.println(sb);
		
		//reverse
		sb.reverse();
		System.out.println(sb);
		
		
		
	}

}
