package com.kh.test.condition;

import java.util.Scanner;

public class Test5 {
	
	public static void main(String[] args) {
	
		Test5 t5 = new Test5();
		t5.test();		
	
	}
	/**
	 * - 메소드명 : public void test()
    키(cm)와 몸무게(kg)을 입력 받고, 
   BMI(체질량지수)를 계산하여 계산된 값에 따라 
   저체중(18.5미만), 정상체중(18.5이상 23미만), 과체중(23이상 25미만), 비만(25이상 30미만), 고도비만(30이상)을 출력하세요. 
   BMI 계산식 = 체중(kg) / (신장(m) * 신장(m) ) 
   예) BMI = 67 / (1.7 * 1.7)
	 */

	public void test() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키(cm)를 입력하시오: ");
		int cm = sc.nextInt();
		
		System.out.print("몸무게(kg)를 입력하시오: ");
		int kg = sc.nextInt();
		
		double bmi = kg/(((cm/100.0)*(cm/100.0)));
		
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
