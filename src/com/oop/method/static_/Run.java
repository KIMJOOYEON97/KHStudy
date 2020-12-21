package com.oop.method.static_;

import java.util.Scanner;

public class Run {
	
	public static void main(String[] args) {
		
		Run r= new Run();
//		r.test1();
		r.test2();
//		r.test3();
		r.test4();
		
		
	}
	
	public void test1() {
		
		//1.
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요:");
		String user1 = sc.next();
		
		System.out.println(user1); //전
		user1 = StaticMethod.toUpper(user1);
		System.out.println(user1); //후
	}
	
	public void test2() {
		
		//2.
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요:");
		String user2 = sc.next();
		System.out.print("인덱스를 입력하세요:");
		int x = sc.nextInt();
		char ch =' ';
		char y = StaticMethod.setChar(user2, x, ch);
		System.out.println(y);
		
	}
	
	public void test3() {
		
		Scanner sc = new Scanner(System.in);
		
		//3.
		System.out.print("문자열을 입력하세요:");
		String user3 = sc.next();
		int sum = 0;
		sum = StaticMethod.getAlphbetLength(user3,sum);
		System.out.println("영문자의 개수: "+sum);
	}
	
	public void test4() {
		Scanner sc = new Scanner(System.in);
		//4.
		System.out.print("문자열을 입력하세요:");
		String user41 = sc.nextLine();
		System.out.print("문자열을 입력하세요:");
		String user42 = sc.nextLine();
		String result ="";
		result=StaticMethod.concat(user41, user42, result);
		System.out.println("["+user41+"]+"+"["+user42+"] ="+result);
		
	}

}
