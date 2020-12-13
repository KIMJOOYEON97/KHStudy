package com.kh.test.break_continue;

import java.util.Scanner;

public class Test3 {
	
	public static void main(String[] args) {
		Test3 t3 = new Test3();
		t3.test();
	}
	
	public void test() {
		

		
		while(true){
			Scanner sc = new Scanner(System.in);
			System.out.print("2보다 큰 정수를 입력하세요.");
			final int NUM = sc.nextInt();
			if(NUM<2) {
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
				continue;
			}else {
				for(int i = 1; i<=NUM;i++) {
					if(NUM%i==0) {
						System.out.println("소수가 아니다.");
						System.exit(0);
					}
					else {
						System.out.println("소수다");
						System.exit(0);
					}
						
					}
				}
			}
		}
	}
//[문제 3]
//- 클래스 : com.kh.test.break_continue.Test3.java
//- 메소드명 : public void test()
//     2보다 큰 정수를 입력 받고, 입력 받은 정수가 소수이면 “소수다“, 소수가 아니면 “소수가 아니다.” 출력하고 프로그램을 종료하는 코드를 작성하세요.
//     단, 입력 받은 정수가 2보다 작은 경우 “잘못 입력하셨습니다. 다시 입력하세요.” 출력 후 다시 정수를 입력 받도록 하세요.
//?
//    ** 소수란? : 어떠한 정수를 1부터 자기 자신까지로 나누었을 때, 나누어 떨어지는 수가 1과 자기 자신 뿐인 수를 소수라고 한다.
