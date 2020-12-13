package com.kh.test.break_continue;

import java.util.Scanner;

public class Test1 {
	
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		t1.test1();
//		t1.test2();
	}
	public void test1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		final int NUM = sc.nextInt();
		//증감변수
		int i =0;
		//홀수의 총 곱을 담을 변수
		int total = 1;
		
		while(i<=NUM) {
			i++;
			if(i%2!=0) {
				total=total*i;
			}
			//짝수는 넘어가게 continue
			else {
				continue;
			}
		}
		//결과 출력
		System.out.println(total);
	}
	
	public void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 하나 입력하세요.:");
		int umin = sc.nextInt();
		System.out.print("다른 정수를 하나 입력하세요. :");
		int umax = sc.nextInt();
		
		//최대값과 최소값을 담을 변수
		int max, min =0;
		//홀수의 합을 담을 변수
		int sum = 0;
		
		
		if(umin>umax) {
			max=umin;
			min=umax;
		}
		else {
			max=umax;
			min=umin;	
		}
		
		for(int i = min; i<=max  ;i++) {
			if(i % 2 == 1) {
				sum += i ;
			}
			else {
				continue;
			}
		}
		System.out.println("==============");
		System.out.printf("%d부터 %d까지의 홀수의 합은 %d입니다.",min,max,sum);
	}

}
//[문제 1]
//- 클래스 : com.kh.test.break_continue.Test1.java
//- 메소드명 : public void test1()
//    1) 정수 한 개를 입력 받아, 1부터 입력 받은 정수까지의 홀수의 곱을 출력하세요.
//- 메소드명 : public void test2()
//    2) 사용자로부터 정수를 두개 입력 받아서, 작은 정수에서 큰 정수까지 홀수의 합을 구하세요.
//        Tip. 큰수/작은수에 해당하는 변수를 사용할 것.
//     
//        결과:
//        정수를 하나 입력하세요. => 100
//        다른 정수를 하나 입력하세요. => 1
//        ====================
//        1부터 100까지의 홀수의 합은 2500입니다.