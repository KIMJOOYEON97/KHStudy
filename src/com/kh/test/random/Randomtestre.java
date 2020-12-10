package com.kh.test.random;

import java.util.Random;
import java.util.Scanner;

/**
 * 가위바위보 게임
 * 가위 바위 보 중 하나를 선택 승패를 결정하는 게임
 * 승패를 경정하는 if문dms 중첩if문 즉ㅁ지.(|| &&연산자를 적절히 활용)
 * ==가위 바위 보 게임==
 * 숫자를 선택하세요(1.가위 /2.바위 /3.보) : 1
 * ========결과========
 * 당신은 가위를 냈습니다
 * 컴퓨터는 보를 냈습니다. 
 * ===================
 * 당신이 이겼습니다. ㅠ.ㅠ
 * 
 * 삼항연산자랑 ||사용해서 풀어보기
 */
public class Randomtestre {
	
	public static void main(String[] args) {
		
		Randomtestre rt =new Randomtestre();
		rt.test();
	}

	public void test() {
		Scanner sc =new Scanner(System.in);
		System.out.println("==가위 바위 보 게임==");
		System.out.print("숫자를 선택하세요(1.가위 /2.바위 /3.보) :");
		
		int userNo = sc.nextInt();
		int compNo = new Random().nextInt(3)+1;
		//만들어진 객체에 직접  메소드 호출하는 방법    ------->경우의 수가 3개
		
		String user = userNo==1? "가위": userNo==2? "바위":"보";
		String comp = compNo==1? "가위": compNo==2? "바위":"보";
		
		System.out.println("======= 결과 =======");
		System.out.println("당신은 "+user+"를 냈습니다");
		System.out.println("컴퓨터는 "+comp+"를 냈습니다");
		
		System.out.println("===================");
		
		if(comp==user) {
			System.out.println("비겼습니다.");
		}
		else if((userNo==1&&compNo==3)||(userNo==2&&compNo==1)||(userNo==3&&userNo==2)) {
			System.out.println("당신이 이겼습니다.");
		}
		else {
			System.out.println("당신이 졌습니다.");
		}
	}
}
