package com.kh.test.nested.loop;

import java.util.Scanner;

public class Test3 {
	
	public static void main(String[] args) {
		
		Test3 t3 = new Test3();
		t3.test();
	}

	public void test() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {			
			//정수입력받기
			System.out.print("정수 입력:");
			int num = sc.nextInt();
			
			//양수가 아닌경우
			if(num<=0) {System.out.println("양수가 아닙니다.");continue;}
			
			//양수인 경우
			else {
				//위쪽 별 출력
				for(int i = 0; i <num;i++) {
					for(int j = 0; j <num; j++) {
						if(i>=j) {
							System.out.print("*");
						}
					}
					System.out.println();
				}
				//밑쪽 별 출력
				for(int i = 0; i <num;i++) {
					for(int j = 0; j <num; j++) {
						if(i>=j) {
							System.out.print(" ");
						}
						else {
							System.out.print("*");
						}
					}
					System.out.println();
				}break;
				
			}
		}
	}
}
//메소드명: public void test()
//정수하나 입력받아, 그 수가 양수일때만 입력된 
//수를 줄 수로 적용하여 다음과 같이 출력되게 하는 
//프로그램을 만들어보자.
//    출력예)
//  정수 입력 : 5
//
//     *
//     **
//     ***
//     ****
//     *****
//      ****
//       ***
//        **
//         *

