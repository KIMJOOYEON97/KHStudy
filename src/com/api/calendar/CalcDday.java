package com.api.calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalcDday {
	
	private Calendar now = new GregorianCalendar();
	
	public static void main(String[] args) {
		
		CalcDday c = new CalcDday();
		c.test1();
		c.test2();
	}

	public void test1() {
		Calendar theEnd = new GregorianCalendar(2021,6,8,0,0,0);
		
		long nowD = now.getTimeInMillis();
		long theEndD= theEnd.getTimeInMillis();
		
		long diff = (theEndD - nowD)/1000/60/60/24;
		
		if(diff > 0) {
			System.out.println("D-"+(diff+1)+"입니다.");
		}
		else if(diff == 0) {
			System.out.println("D-Day입니다.");
		}
	}
	public void test2() {
	Calendar theEnd = new GregorianCalendar(2021,6,8,0,0,0);
		
		long nowD = now.getTimeInMillis();
		long theEndD= theEnd.getTimeInMillis();
		
		long diff = (theEndD - nowD)/1000/60/60/24;
		
		if(diff > 0) {
			System.out.println("D-"+(diff+1)+"입니다.");
		}
		else if(diff == 0) {
			System.out.println("D-Day입니다.");
		}
		else if(diff < 0) {
			System.out.println((-diff)+"일 지났습니다.");
		}
	}
}
