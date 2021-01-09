package javaTest3_KIMJOOYEON.calendar3;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class DateTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("생년월일을 입력하세요 (ex)1997,09,01): ");
		String str = sc.nextLine();
		
		String[] arr = str.split("[,]");
		
		int year = Integer.parseInt(arr[0]);
		int month = Integer.parseInt(arr[1]);
		int day = Integer.parseInt(arr[2]);
		
		Calendar cal1 = new GregorianCalendar(year,month,day);
		int yo =cal1.get(Calendar.DAY_OF_WEEK);
		String yoli ="";
		switch(yo) {
		case 1: yoli ="일";
		case 2: yoli ="월";
		case 3: yoli ="화";
		case 4: yoli ="수";
		case 5: yoli ="목";
		case 6: yoli ="금";
		case 7: yoli ="토";
		}
		
		
		
		
		Calendar cal2 = Calendar.getInstance();
		
		long birth = cal1.getTimeInMillis();
		long now = cal2.getTimeInMillis();
		
		long diff = (now - birth)/1000/60/60/24/365;
		
		System.out.printf("생일 : %d년 %d월 %d일 %s요일%n", cal1.get(Calendar.YEAR), 
													cal1.get(Calendar.MONTH),cal1.get(Calendar.DATE),yoli);
		System.out.printf("현재 : %d년 %d월 %d일%n",cal2.get(Calendar.YEAR), 
				cal2.get(Calendar.MONTH+1),cal2.get(Calendar.DATE));
		System.out.println("나이 :"+diff+"세");
		
	}
}
