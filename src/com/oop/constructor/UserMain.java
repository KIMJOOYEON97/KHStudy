package com.oop.constructor;

import java.util.Date;

public class UserMain {

	public static void main(String[] args) {
		//1. 기본생성자 + setter를 이용해서 값을 대입
		User u = new User();
		//			-------> 클래스 명이 아니라 생성자명이었다. constructor 생성자를 호출하고 있던 것	
		u.setUserId("hoggd");
		u.setPassword("1234");
		u.setRegDate(new Date());
		u.printUser();
		
		//2. 파라미터 생성자 호출해서 한방에 끝내는 방법
		User u2= new User("신사임당","5678",new Date());
		u2.printUser();
		
		User u3 = new User("sejong");
		u3.printUser();
		
		User u4 = new User("youngsil","7890");
		u4.printUser();
	}

}
