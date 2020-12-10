package com.kh.test.condition;

import java.util.Scanner;

public class Test8 {
	public static void main(String[] args) {
		
		Test8 t8 = new Test8();
		t8.test();
	}
	/**
	 * [문제 8]
- 클래스 : com.kh.test.condition.Test8.java
- 메소드명 : public void test()
	 **********메  뉴*********
       1. 떡볶이 ----------------1000
       2. 김밥 ------------------ 2000
       3. 오뎅 ------------------ 1000
       4. 순대 ------------------ 2000
       5. 튀김 ------------------ 3000
       6. 떡튀순 ---------------- 8000
	 *************************
     메뉴번호 입력 : ‘번호입력’
    떡볶이 선택시 “떡볶이는 1000원입니다.” 출력
    김밥 선택시 “김밥은 2000원입니다.” 출력
    오뎅 선택시 “오뎅은 1000원입니다.” 출력
    순대 선택시 “순대는 2000원입니다.” 출력
    튀김 선택시 “튀김은 3000원입니다.” 출력
    떡튀순 선택시 “떡튀순은 8000원입니다.”출력
    다른문자열 입력시 “번호가 잘못 입력되었습니다. 영업을 종료합니다.”

	 *
	 */
	public void test() {
		
		System.out.println("**********메  뉴*********");
		System.out.println("1. 떡볶이 ----------------1000");
		System.out.println("2. 김밥 ------------------ 2000");
		System.out.println("3. 오뎅 ------------------ 1000");
		System.out.println("4. 순대 ------------------ 2000");
		System.out.println("5. 튀김 ------------------ 3000");
		System.out.println("6. 떡튀순 ---------------- 8000");
		System.out.println("*************************");
		System.out.print(" 메뉴번호 입력 (번호입력) > ");
		
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		
		switch(choice) {
			case 1: System.out.println("떡볶이는 1000원입니다."); break;
			case 2: System.out.println("김밥은 2000원입니다."); break;
			case 3: System.out.println("오뎅은 1000원입니다."); break;
			case 4: System.out.println("순대는 2000원입니다."); break;
			case 5: System.out.println("튀김은 3000원입니다."); break;
			case 6: System.out.println("떡튀순은 8000원입니다."); break;
			default: System.out.println("번호가 잘못 입력되었습니다. 영업을 종료합니다.");
		}
		
	}
}
