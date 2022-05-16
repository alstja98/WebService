package com.chap05.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Run {

	public static void main(String[] args) {
		//Date
		Date today = new Date();
		System.out.println(today);
		
		//���ϴ� �������� ���
		SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd");
		System.out.println(sdf.format(today));
	
		System.out.println("========Ķ����========");
		Calendar calendar = Calendar.getInstance(); //����ð�
		System.out.println(calendar);
		//���ϴ� �ð��� �����Ϸ��� calendar.set(2019, 9-1, 9);
		
		int year = calendar.get(1);
		int month = calendar.get(Calendar.MONTH)+1; //MONTH�� 1�� �۰� ����.
		int date = calendar.get(Calendar.DATE);
		int hour = calendar.get(Calendar.HOUR);
		int min = calendar.get(Calendar.MINUTE);
		int sec = calendar.get(Calendar.SECOND);
		String a = year +"�� "+ month +"�� "+ date + "�� "+ hour +"�� "+min+"�� "+sec+"�� ";
		System.out.println(a);
		System.out.println(calendar.getTime()); //���� �ð� �������
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println( sdf1.format(calendar.getTime()) ) ;
		
		
		Calendar cal = (Calendar)calendar.clone();  //��ü�� ����ȯ ���Ѽ� ������ �־��� ��ü�δ� ���ֱ� ������(��������)..?
		cal.add(Calendar.YEAR , -9);
		cal.add(Calendar.MONTH,  -3);
		cal.add(Calendar.DATE,  20);
		
		System.out.println(cal.getTime());
		
		
		System.out.println("======= �׷����� ======");
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println(gc.getTime());
		
		System.out.println("year: " + gc.get(GregorianCalendar.YEAR));
		System.out.println("month: " + gc.get(GregorianCalendar.MONTH));
		System.out.println("date: " + gc.get(GregorianCalendar.DATE));
		
		System.out.println(gc.isLeapYear(2022)); //�������� �ƴ��� boolean �� ������
		
	}

}
