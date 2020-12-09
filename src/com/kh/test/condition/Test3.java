package com.kh.test.condition;

import java.util.Scanner;

/**
 * - 메소드명 : public void test()
    정수 두개를 입력 받고, 연산자(+,-,*,/)를 입력받은 다음 계산한 뒤  결과를 출력하는 계산기 프로그램을 만들어보세요.      
    출력 예) 입력 5, 6, +
           5+6=11
    음수가 입력되거나 +,-,*,/ 이외의 문자가 입력되면 “잘못 입력 하셨습니다.  프로그램을 종료합니다.” 라는 문구가 출력되게 하세요.

 */
public class Test3 {
	public static void main(String[] args) {
		
		Test3 t3 = new Test3();
		t3.test();
		
	}
	public void test() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요: ");
		int num1 = sc.nextInt();
		
		System.out.print("정수를 입력하세요: ");
		int num2 = sc.nextInt();
		
		System.out.print("연산자를 입력하세요: ");
		char ch = sc.next().charAt(0);
		
		if(ch == '+') {
			System.out.println(num1 +"+" +num2 +"="+(num1+num2));
		}
		else if(ch =='-'){
			System.out.println(num1 +"-" +num2 +"="+(num1-num2));
		}
		else if(ch =='*'){
			System.out.println(num1 +"*" +num2 +"="+(num1*num2));
		}
		else if(ch =='/'){
			System.out.println(num1 +"/" +num2 +"="+(num1/num2));
		}
		else {
			System.out.println("잘못 입력 하셨습니다.  프로그램을 종료합니다.");
		}
	}
}
