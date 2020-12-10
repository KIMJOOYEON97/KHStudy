package com.kh.test.condition;

import java.util.Scanner;

public class Test5re {
	/**
	 * - 메소드명 : public void test()
    키(cm)와 몸무게(kg)을 입력 받고, 
   BMI(체질량지수)를 계산하여 계산된 값에 따라 
   저체중(18.5미만), 정상체중(18.5이상 23미만), 과체중(23이상 25미만), 비만(25이상 30미만), 고도비만(30이상)을 출력하세요. 
   BMI 계산식 = 체중(kg) / (신장(m) * 신장(m) ) 
   예) BMI = 67 / (1.7 * 1.7)
   
   String result ="";를 사용해서 풀어보기
	 */
	
	public static void main(String[] args) {
		Test5re t5 = new Test5re();
		t5.test();
		
	}
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("키를 입력해세요");
		double height = sc.nextInt()/100.0;
		System.out.print("몸무게를 입력하세요");
		int kg = sc.nextInt();
		
		double bmi = kg /(height*height);
		String result ="";
		
		if(bmi<18.5) {
			result="저체중";
		}
		else if(bmi>=18.5&&bmi<23) {
			result="정상체중";
		}
		else if (bmi>=23&&bmi<25) {
			result="과체중";
		}
		else if (bmi>=25&&bmi<30) {
			result="비만";
		}
		else {
			result ="고도비만";
		}
		
		System.out.printf("당신의 bmi지수는 %.1f, %s입니다.",bmi,result);
	}
	
}
