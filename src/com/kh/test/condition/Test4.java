package com.kh.test.condition;

import java.util.Scanner;

/**
 *  메소드명 : public void test()
   1~10 사이의 정수 한개를 입력받아  홀수인지 
    짝수인지 확인하고, 홀수면 “홀수다.”, 짝수면 
   “짝수다.”출력 하세요. 
   단, 1~10사이의 정수가 아닌 경우 “ 반드시 1~10사이의 정수를 입력해야 합니다.”를 출력하세요.
 */
public class Test4 {
	public static void main(String[] args) {
		Test4 t4 = new Test4();
		t4.test();
	}
	
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하시요(0~10사이): ");
		int num = sc.nextInt();
		
		if(num >0 && num <=10) {
			if(num%2 == 0) {
				System.out.println("짝수다");
			}
			else{
				System.out.println("홀수다");
			}
		}
		else {
			System.out.println("반드시 1~10사이의 정수를 입력해야 합니다.");
		}
	}

}
