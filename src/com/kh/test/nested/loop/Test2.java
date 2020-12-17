package com.kh.test.nested.loop;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		
		Test2 t2 = new Test2();
		t2.test();
	}
	public void test() {
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("정수 입력 : ");
			int num = sc.nextInt();
			
			if(num <=0) {
				return; //조기 리턴 처리
			}
			outer:
			for(int i = 0 ; i <num; i++) {
				for(int j = 1; j<=num ; j++) {
					System.out.print("*");
					if(num-i ==j) {
						System.out.println();
						continue outer;
					}
				}
			}
			System.out.print("프로그램 계속하시겠습니까? 1.계속  0. 종료: ");
			int user = sc.nextInt();
			if(user==0) {
				System.exit(0);
			}
		}
	}

}

//메소드명: public void test()
//정수하나 입력받아, 그 수가 양수일때만 입력된 수를  행수로 적용하여 다음과 같이 출력되게 하는 프로그램을 만들어보자.
//
//출력예)
//정수 입력 : 5
//***** num-i 반복
//****
//***
//**
//*
//출력예)
//정수 입력 : 0
//양수가 아닙니다.