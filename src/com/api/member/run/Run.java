package com.api.member.run;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.StringTokenizer;

import com.api.member.model.vo.Member;


public class Run {
	
	public static void main(String[] args) {
		
		String str 
			="1,김연아,165,47,19900905"
			+ "|2,양세형,167,60,19850818"
			+ "|3,김래원,182,80,19810319";
		
		//|를 기준으로 3개로 나눔
		String[] sep = str.split("[|]");
		Member[] member = new Member[sep.length];
//		System.out.println(sep[0]); 확인용

		//분리된 정보를 담을 배열 
		String[] input = new String[15];
		//정보를 분리함
		int j = 0;
		for(int i = 0; i<sep.length;i++) {
			StringTokenizer token = new StringTokenizer(sep[i],",");			
			
			while(token.hasMoreTokens()) {
				input[j++] = token.nextToken();
			}
			
		}
//		System.out.println(Arrays.toString(input)); 분리된 정보 확인
	
		
		//객체에 대입
		int m = 0;
		for(int x = 0; x<input.length;x+=5) {
			member[m] =new Member(Integer.parseInt(input[x]),
									input[x+1],
								  Integer.parseInt(input[x+2]),
								  Integer.parseInt(input[x+3]),
								  (toCal(input[x+4])));	
			m++;
			
		}
		
		for(int p=0;p<member.length;p++) {
			System.out.println(member[p].information());
			
		}
	
		
	}
	
	//문자열을 Calendar 객체로 변환  //왜 static이 되어야하는지 모르겠다.
	public static Calendar toCal(String s) {
		Calendar cal = new GregorianCalendar();
		int year = Integer.parseInt(s.substring(0, 4));
		int month = Integer.parseInt(s.substring(4, 6))-1;
		int date = Integer.parseInt(s.substring(6));
		cal.set(year,month,date);
		
		return cal;
	}
	

}
