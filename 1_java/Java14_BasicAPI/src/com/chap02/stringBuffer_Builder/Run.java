package com.chap02.stringBuffer_Builder;

public class Run {

	public static void main(String[] args) {
		//Run.method1();
		Run.method2();
	}
	
	public static void method1() {
		StringBuilder sb = new StringBuilder("�ƾ� ����ũ�׽�Ʈ");
		System.out.println(sb);
		
		String str = "�ȳ��ϼ���";
		System.out.println("str ���� : " + str +", �ּ�: " + System.identityHashCode(str));
		str += "���� ���μ��Դϴ�.";
		System.out.println("str�߰� �� : " + str + ", �ּ�: " + System.identityHashCode(str)); //str�� �߰��ϸ� ���ο� �ּҿ� ������ ���� �Ǵ�.

		StringBuffer sf = new StringBuffer("��ħ�� ����");
		System.out.println("sf ����: " + sf + ", �ּ�: " + sf.hashCode()+ ", �ּ�: " +System.identityHashCode(sf));
		
		sf.append("�ҽ��ϳ׿�!");  //stringBuffer�� += �̷��ŷ� ��Ʈ�� �߰� �Ұ���
		System.out.println("sf �߰� �� : " + sf + ", �ּ�: " + sf.hashCode()+ ", �ּ�: " +System.identityHashCode(sf));  //stringBuffer�� ������ �ٲ� ���� �ּҸ� ���´�.
		
	}
	
	
	public static void method2() {
		StringBuilder sb = new StringBuilder("�� ");
		
		//append
		sb.append("Ŀ�� �Ծ�");
		sb.append("~!");
		System.out.println(sb);
		
		//length
		System.out.println(sb.length());
		
		//insert
		sb.insert(0, "���� �� ����");
		System.out.println(sb);
		
		//delete
		sb.delete(0, 8);
		System.out.println(sb);
		
		//reverse
		sb.reverse();
		System.out.println(sb);
		
		
		
	}

}
