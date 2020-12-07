package com.kh.java;

import com.kh.java.other.OtherJava; //클래스 선언문 나오기 전에 import문을 적어주면 된다.

//java.lang패키지의 모든 클래스는 import문 없이 사용이 가능
import java.lang.*;
//import java.lang.System;
//import java.lang.String;


/**
 * javadoc 주석 (클래스, 메소드 레벨에 작성)
 * 		
 * 실제 클래스명 : package + class
 * 
 * com.kh.java.HelloWorld
 * 
 * kr.or.iei.hello.world.member.Member
 * 								------>클래스는 대문자임.						
 * 
 * 같은 패키지안에 동일한 이름의 클래스는 존재할 수 없다.
 * 다른 패키지안헤 동일한 이름의 클래스는 존재할 수 있다. 
 *
 * 패키지란?
 * 보통 성격이 같은 클래스의 모음
 * 패키지는 겹치지 않도록 보통 도메인을 거꾸로 사용한다.  com.naver    com.kh.HelloWorld
 * 											웹을 구현한기 위한 프로그램임으로 도메인 거꾸로 사용
 * 패키지는 고유하게 관리하기 위해 3레벨 이상을 추천한다. com.naver.www
 *
 */
public class HelloWorld {

	//메소드의 선언부의 위치는 중요하지 않다. 선언만 해놓으면 잘 찾는다. main 메소드 앞에도 선언가능
	public void test2() {
		System.out.println("test2 호출!");
	}
	/**
	 * 프로그램의 첫 실행메소드
	 * 
	 * 객체 지향 언어 Object Oriented Language OOL
	 * 객체란 메모리에 적재된 데이터 저장 공간
	 * 
	 * 객체 레시피
	 * 클래스명 변수명 = new 클래스명();
	 */
	public static void main(String[] args) {
		
//		System.out.println("Hello world~");
//		System.out.println("안녕!");
		
		//클래스 ->객체
		HelloWorld hw = new HelloWorld();
		hw.test1();//메소드 호출부
		hw.test2();
		
		KHJava kh = new KHJava(); // 클래스 -> 객체
		kh.welcome(); //현재 클래스뿐 아니라 다른 클래스에 있는 것도 가져다 쓸 수 있다.
					//만들어 놓은 메소드를 호출하여 메인메소드에서 실행
		
		//다른 패키지의 클래스 가져다 쓰는 경우 import문이 필요.
 		OtherJava oj = new OtherJava();
		oj.callMe();
		
		//jdk제공 클래스 사용하기 //Date클래스는 OS에 의존적임 OS에 나타나있는 시간 가져옴
		java.util.Date now =new java.util.Date(); //import없이 쓰기 경로 전부다 써줘야함
		System.out.println(now);
		
		//보통은 import문을 쓰지만 패키지를 포함한 이름을 써야할 때가 있다.
		//java.sql.Date, java.util.Date 를 동시에 써야할 때
		java.sql.Date today = new java.sql.Date(System.currentTimeMillis()); //데이터 베이스 연결할 때 사용하는 타입
		System.out.println(today);
		
//		System.out.println("메인 메소드 출력!");// 이게 먼저 될것인가? X => 나중에 출력이됌
		
	}
	//메소드 선언부 , 선언을 해놓았기때문에 호출할 수 있는 것임
	public void test1() {
		//java.lang.System
		System.out.println("test1 호출!");
	}
	
	
}
