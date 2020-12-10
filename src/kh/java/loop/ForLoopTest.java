package kh.java.loop;

import java.util.Scanner;

/**
 * for(초기식;조건식;증감식){
 * 		//반복 실행할 코드
 * }
 * - 초기식: for문이 식작하면서 단 한 번 실행. 증감변수 선언(반복문 안에서 증가하거나 감소하는 역할을 하는 변수)
 * - 조건식: true면 반복문 1회 실행, false면 반복문 중지
 * - 증감식: 증감변수 처리식(증가/감소)
 * 
 * 처리순서
 * 1. 초기식
 * 2. 조건식 -> true
 * 3. 반복 실행코드
 * 4. 증감식
 * 
 * 2. 조건식 ->true
 * 3. 반복 실행코드
 * 4. 증감식
 * ...
 * 
 * 2.조건식 ->false 반복문 중지
 */
public class ForLoopTest {

	public static void main(String[] args) {
		ForLoopTest f = new ForLoopTest();
//		f.test1();
//		f.test2();
//		f.test3();
//		f.test4();
//		f.test5();
		f.test6();
	}
	/**
	 * 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
	 */
	public void test6() {
		for(int i = 1; i<=10; i++) {
			System.out.print(i);
			System.out.print(i != 10? ", ":"");		
		}
	}
	/**
	 * 1 ~ 10까지 합계구하기
	 * 
	 * 1 + 2 + 3..... + 9 + 10
	 */
	public void test5() {
		int sum = 0;//반복문 선언하기 전에 선언해야한다
		for(int i= 1; i<=10; i++) {
			System.out.print(i+sum + " + ");
			sum += i; // sum = sum + i
		}
		System.out.println("= "+sum);
	}
	/**
	 * @ 실습문제 : 사용자에게 이름을 입력받고, 숫자를 입력받아서
	 * 해당 이름을 해당 횟수만큼 반복 출력하세요
	 */
	public void test4() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		String name = sc.next();
		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		for(int i = 0; i < num; i++) {
			System.out.println((i+1)+". "+name);
		}
	}
	/*
	 * 	3 * 1 = 3
		3 * 2 = 6
		3 * 3 = 9
		3 * 4 = 12
		3 * 5 = 15
		3 * 6 = 18
		3 * 7 = 21
		3 * 8 = 24
		3 * 9 = 27
	 */
	public void test3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 단을 출력할까요?(2 ~ 9) >");
		int dan = sc.nextInt();
		
		for(int i = 1; i<10;i++) {
			System.out.printf("%d * %d = %d\n",dan,i,i*dan);
		}
		
	}
	public void test2() {
		//11 12 13 14 15 16 17 18 19 20
		for(int i=1;i<=10;i++) {
			System.out.printf("%d ",i+10);
		}
		System.out.println();
		//1부터 홀수 10개
		for(int z=1;z<20;z++) {
			System.out.print((z*2-1)+" ");
		}
		System.out.println();
		// 2 4 6 8 10 12 14 16 18 20
		for(int x=1;x<=20;x++) {
			String	y = x%2==0? x+" ": "";
			System.out.print(y);
		}
		System.out.println();
		
		//10 9 8 7 6 5 4 3 2 1
		for(int i = 10; i>0; i--) { 
			System.out.print(i+" ");
		}
		System.out.println();
		// 20 18 16 14 12 10 8 6 4 2 
		for(int i = 20; i>0 ; i -=2) {
			System.out.print(i+" ");
			
		}
		System.out.println();
		// 10 9 8 7 6 5 4 3 2 1 
		for(int i = 1; i <=10;i++) {
			System.out.print((11-i)+" ");
		}
	}
	
	/**
	 * 증감변수의 추이(변화하는 상태)   0  1  2  3  4  5  6  7  8  9
	 * 반복횟수  10
	 */
	public void test1() {
		
		//Hello World를 3번 출력하는 반복문
		for(int i=1;i<101;i = i+3) {
			
			System.out.println(i+"\t"+"Hello World");
		
		}
	}
}
