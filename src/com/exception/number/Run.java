package com.exception.number;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		 Run r = new Run();
		 r.test();
	}

	public void test() {
		NumberProcess n =new NumberProcess();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		boolean result = n.checkDouble(num1, num2);
		
		if(result) System.out.printf("%d의 배수이다.",num1);
		else if(!result) System.out.printf("%d의 배수가 아니다.",num1);
	}
}
