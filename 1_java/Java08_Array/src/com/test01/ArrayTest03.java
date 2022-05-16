package com.test01;

public class ArrayTest03 {

	public static void main(String[] args) {
		new ArrayTest03().deepCopy3();
	}
	public void shallowCopy() {
		//얕은복사 -> 배열의 주소만 복사한다.
		
		int[] oArr = {1,2,3,4,5};
		int[] cArr = oArr;
		
		//원본 배열의 값을 str에 저장하여 출력
		String str = "";
		
		for(int i=0; i<oArr.length; i++) {
			str += oArr[i] + " "; //정수 + 문자열 = 문자열임!
		}
		System.out.println("1.oArr : " + str);
		
		//복사한 배열의 값을 str에 저장하여 출력;
		str = "";
		for (int i =0; i<cArr.length; i++) {
			str += cArr[i]; //원래 str에 문자열이 들어있었으니까 숫자 더해도 문자열로 자동형변환됨.
		}
		
		System.out.println("2.cArr : " + str);
		
		//원본배열 값 변경
		oArr[0] = 99;
		
		//변경 후 출력
		str = "";

		for (int i = 0; i < oArr.length; i++) {
			str += oArr[i] + " "; // 정수 + 문자열 = 문자열임!
		}
		System.out.println("1.oArr : " + str);

		// 복사한 배열의 값을 str에 저장하여 출력;
		str = "";
		for (int i = 0; i < cArr.length; i++) {
			str += cArr[i]; // 원래 str에 문자열이 들어있었으니까 숫자 더해도 문자열로 자동형변환됨.
		}

		System.out.println("2.cArr : " + str);
		System.out.println("oArr의 hashcode: " + oArr.hashCode());
		System.out.println("cArr의 hashcode: " + cArr.hashCode());
	}
	
	public void deepCopy() {
		//깊은 복사는 새로운 배열 하나를 생성하고 값을 복사한다.
		int[] oArr = {1,2,3,4,5};
		int[] cArr = new int[5];
		
		for(int i=0; i<oArr.length; i++) {
			cArr[i] = oArr[i];
		}
		
		String str = "";
		for (int i=0; i<oArr.length; i++) {
			str += oArr[i] + " ";
		}
		
		System.out.println("oArr : " + str);
		
		String str1 = "";
		for (int i=0; i<cArr.length; i++) {
			str1 += cArr[i] + " ";
		}
		
		System.out.println("cArr : " + str1);
		
		//값 변경
		oArr[0] = 99;
		str = "";
		for (int i=0; i<oArr.length; i++) {
			str += oArr[i] + " ";
		}
		
		System.out.println("oArr : " + str);
		
		str = "";
		for (int i=0; i<cArr.length; i++) {
			str += cArr[i] + " ";
		}
		
		System.out.println("cArr : " + str);
		
	}
	
	public void deepCopy2() {
		//System에 있는 arraycopy()
		int[] oArr = {1,2,3,4,5};
		int[] cArr = new int[10];
		
		//arraycopy(src, srcPos, dest, destPos, length)
		//src: 원본배열. srcPos: 복사 시작 위치. dest: 카피배열. dest:붙여넣기 시작 위치. length: 복사될 길이
		
		System.arraycopy(oArr, 0, cArr, 3, oArr.length);
		String str = "";
		for (int i=0; i<oArr.length; i++) {
			str += oArr[i] + " ";
		}
		
		System.out.println("oArr : " + str);
		
		str = "";
		for (int i=0; i<cArr.length; i++) {
			str += cArr[i] + " ";
		}
		
		System.out.println("cArr : " + str);
		
		System.out.println("oArr의 hashcode: " + oArr.hashCode());
		System.out.println("cArr의 hashcode: " + cArr.hashCode());
		
		
		
	}
	
	public void deepCopy3() {
		//clone()
		int[] oArr = {1,2,3,4,5};
		int[] cArr = new int[10];
		
		System.out.println("준비된 cArr의 hashcode: " + cArr.hashCode());
		
		cArr = oArr.clone();
		
		System.out.println("복사된 배열의 hashcode: " + cArr.hashCode());
		
		String str = "";
		for (int i=0; i<oArr.length; i++) {
			str += oArr[i] + " ";
		}
		
		System.out.println("oArr : " + str);
		
		str = "";
		for (int i=0; i<cArr.length; i++) {
			str += cArr[i] + " ";
		}
		
		System.out.println("cArr : " + str);				
	
		System.out.println("oArr의 hashcode: " + oArr.hashCode());
		System.out.println("cArr의 hashcode: " + cArr.hashCode());
	
	
	}
}
