package com.exception.charcheck;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		
		Run r = new Run();
		try {		
			r.test1();
		}catch(CharCheckException e) {
			System.out.println("체크할 문자열 안에 공백 포함할 수 없습니다.");
		}
	}
	
	public void test1() throws CharCheckException {
		CharacterProcess c = new CharacterProcess();
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요 : ");
		String user = sc.nextLine();
		for(int i = 0; i <user.length();i++) {
			if(user.charAt(i)==' ') 
				throw new CharCheckException();
		}
		countAlpha(user);
		System.out.println(c.countAlpha(user)+"개");
		
		
	}
	public void countAlpha(String s) {
		System.out.println(s);
	}

}
