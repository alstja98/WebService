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
		
		//원하는 포맷으로 출력
		SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd");
		System.out.println(sdf.format(today));
	
		System.out.println("========캘린더========");
		Calendar calendar = Calendar.getInstance(); //현재시간
		System.out.println(calendar);
		//원하는 시간을 설정하려면 calendar.set(2019, 9-1, 9);
		
		int year = calendar.get(1);
		int month = calendar.get(Calendar.MONTH)+1; //MONTH는 1이 작게 나옴.
		int date = calendar.get(Calendar.DATE);
		int hour = calendar.get(Calendar.HOUR);
		int min = calendar.get(Calendar.MINUTE);
		int sec = calendar.get(Calendar.SECOND);
		String a = year +"년 "+ month +"월 "+ date + "일 "+ hour +"시 "+min+"분 "+sec+"초 ";
		System.out.println(a);
		System.out.println(calendar.getTime()); //현재 시간 출력해줌
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println( sdf1.format(calendar.getTime()) ) ;
		
		
		Calendar cal = (Calendar)calendar.clone();  //객체를 형변환 시켜서 변수에 넣어줌 객체로는 못넣기 때문에(상위여서)..?
		cal.add(Calendar.YEAR , -9);
		cal.add(Calendar.MONTH,  -3);
		cal.add(Calendar.DATE,  20);
		
		System.out.println(cal.getTime());
		
		
		System.out.println("======= 그레고리안 ======");
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println(gc.getTime());
		
		System.out.println("year: " + gc.get(GregorianCalendar.YEAR));
		System.out.println("month: " + gc.get(GregorianCalendar.MONTH));
		System.out.println("date: " + gc.get(GregorianCalendar.DATE));
		
		System.out.println(gc.isLeapYear(2022)); //윤년인지 아닌지 boolean 값 리턴함
		
	}

}
