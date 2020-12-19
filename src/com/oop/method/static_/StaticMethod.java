package com.oop.method.static_;

public class StaticMethod {

	public static String toUpper(String user1) {
		return user1.toUpperCase();
	
	}
	
	public static char setChar(String user2, int x, char ch) {
		for(int i= 0; i <user2.length();i++) {
			if(i==x) {
				ch = user2.charAt(i);
			}
		}
		return ch;	
	}
	
	public static int getAlphbetLength(String user3, int sum) {
		for(int i = 0; i< user3.length(); i++) {
			char alph = user3.charAt(i);
			if((alph >= 'A'&& alph <='Z')||(alph >='a'&& alph<='z')) {
				sum++;
			}
		}
		return sum;
	}
	
	public static String concat(String user41, String user42, String result) {
		return result = user41+user42;
	}
	
}

//실행클래스 Run : 적절한 방법으로 static 메소드 호출하기
//기능제공클래스 StaticMethod

//static method
//1. 전달한 문자열을 모두 대문자로 바꾸는 static 메소드
//메소드명 : toUpper(String) : String

//2. 첫번째 문자열의 전달받은 인덱스의 문자를 전달받은 문자로 변경하는 static 메소드
//메소드명 : setChar(String, int, char)

//3. 전달한 문자열에서 영문자의 개수를 리턴하는 static 메소드
//메소드명 : getAlphabetLength(String) : int

//4. 전달한 문자열값을 하나로 합쳐서 리턴 
//메소드명 : concat(String, String) : String
