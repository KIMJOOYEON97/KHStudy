package com.api.calendar;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;
import java.util.StringTokenizer;

import com.api.token.TokenTest;

public class CalcYourDays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("생일을 입력하세요  ( 년, 월, 일) ex)1997,09,01 => ");
		String userInfo = sc.nextLine();
		
		String[] arr=userInfo.split("[,]");
//		System.out.println(Arrays.toString(arr)); 입력한 생년월일 확인
		
		//생년월일 Calendar birth에 세팅하기
		int year = Integer.parseInt(arr[0]);
		int month = Integer.parseInt(arr[1]);
		int day = Integer.parseInt(arr[2]);
		Calendar birth = Calendar.getInstance();
		birth.set(year, month, day);
		
		//태어난지 몇 일 되었는지 계산
		long birthM = birth.getTimeInMillis();
		
		Calendar now = Calendar.getInstance();
		long nowM = now.getTimeInMillis();
		
		long diff = (nowM-birthM) /1000/60/60/24;
		
		System.out.println("태어난지 "+(diff+1)+"일 되었습니다.");
		
	}

}
