package com.kh.test.condition;

import java.util.Scanner;

public class Test5 {
	
	public static void main(String[] args) {
	
		Test5 t5 = new Test5();
		t5.test();		
	
	}


	public void test() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키(cm)를 입력하시오: ");
		int cm = sc.nextInt();
		
		System.out.print("몸무게(kg)를 입력하시오: ");
		int kg = sc.nextInt();
		
		double bmi = kg/((cm/100.0)*(cm/100.0));
		
		if(bmi>=30) {
			System.out.println("고도비만입니다.");
		}
		else if (bmi>=25&&bmi<30) {
			System.out.println("비만입니다.");
		}
		else if (bmi>=23&&bmi<25) {
			System.out.println("과체중입니다.");
		}
		else if (bmi>=18.5&&bmi<23) {
			System.out.println("정상체중입니다.");
		}else {
			System.out.println("저체중입니다.");
		}
	}
}
