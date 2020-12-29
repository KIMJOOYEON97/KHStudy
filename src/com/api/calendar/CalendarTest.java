package com.api.calendar;

import java.util.Calendar;

public class CalendarTest {
	
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
//		System.out.println(now);
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH);
		int day = now.get(Calendar.DATE);
		int hour = now.get(Calendar.HOUR_OF_DAY);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		System.out.printf("%d년 %d월 %d일 %d시 %d분 %d초",year,month,day,hour,minute,second);
	}
}
