package com.ae.ae2.Calendar;

import java.util.Calendar;
import java.util.Date;


public class CalendarMain_1 {

	public static void main(String[] args) {
		
		//현재 날짜와 시간의 정보
		Calendar ca = Calendar.getInstance(); // new GregoryCalendar
		//System.out.println(ca); //참조변수 쓰면 toString() 자동으로 생성
		
		int year = ca.get(Calendar.YEAR);
		System.out.println("year: "+ year);
		int month = ca.get(Calendar.MONTH)+1;
		System.out.println("month: "+ month);
		int date = ca.get(Calendar.DATE);
		System.out.println("date: "+ date);
		
		int hour = ca.get(Calendar.HOUR_OF_DAY);
		System.out.println("hour: "+ hour);
		int minute = ca.get(Calendar.MINUTE);
		System.out.println("min: " +minute);
		int second = ca.get(Calendar.SECOND);
		System.out.println("second:"+ second);
		
		Date d = ca.getTime();
		System.out.println(d);
		
		
	}

}
