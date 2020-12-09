package com.kh.test.random;

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
 */
public class RandomTest {
	
	public static void main(String[] args) {
		
		RandomTest rt = new RandomTest();
		rt.rsp();

	}
	
	public void rsp() {
		System.out.println("==가위 바위 보 게임==");
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 선택하세요(1.가위 /2.바위 /3.보) :");
		//사용자의 선택 chi
		int chi =sc.nextInt();
		//컴퓨터의 선텍 comp
		int comp =(int)(Math.random()*3)+1;
		
		//가위를 냈을 경우
		System.out.println("========결과========");
		if(chi==1 && comp ==3) {
			System.out.println("당신은 가위를 냈습니다.");
			System.out.println("컴퓨터는 보를 냈습니다.");
			System.out.println( "===================");
			System.out.println("당신이 이겼습니다. ㅠ.ㅠ");
		}
		else if(chi ==1 && comp == 2) {
			System.out.println("당신은 가위를 냈습니다.");
			System.out.println("컴퓨터는 바위를 냈습니다.");
			System.out.println( "===================");
			System.out.println("당신은 졌습니다. ^ㅇ^");
		}
		else if(chi ==1 && comp == 1) {
			System.out.println("당신은 가위를 냈습니다.");
			System.out.println("컴퓨터는 가위를 냈습니다.");
			System.out.println( "===================");
			System.out.println("비겼습니다. ㅇㅅㅇ");
		}
		//2.바위를 냈을 경우
		else if(chi==2 && comp ==3) {
			System.out.println("당신은 바위를 냈습니다.");
			System.out.println("컴퓨터는 보를 냈습니다.");
			System.out.println( "===================");
			System.out.println("당신은 졌습니다. ^ㅇ^");
		}
		else if(chi ==2 && comp == 2) {
			System.out.println("당신은 바위를 냈습니다.");
			System.out.println("컴퓨터는 바위를 냈습니다.");
			System.out.println( "===================");
			System.out.println("비겼습니다. ㅇㅅㅇ");
		}
		else if(chi ==2 && comp == 1) {
			System.out.println("당신은 바위를 냈습니다.");
			System.out.println("컴퓨터는 가위를 냈습니다.");
			System.out.println( "===================");
			System.out.println("당신이 이겼습니다. ㅠ.ㅠ");
		}
		//3.보를 냈을 경우
		else if(chi==3 && comp ==3) {
			System.out.println("당신은 보를 냈습니다.");
			System.out.println("컴퓨터는 보를 냈습니다.");
			System.out.println( "===================");
			System.out.println("비겼습니다. ㅇㅅㅇ");
		}
		else if(chi ==3 && comp == 2) {
			System.out.println("당신은 보를 냈습니다.");
			System.out.println("컴퓨터는 바위를 냈습니다.");
			System.out.println( "===================");
			System.out.println("당신이 이겼습니다. ㅠ.ㅠ");
		}
		else if(chi ==3 && comp == 1) {
			System.out.println("당신은 보를 냈습니다.");
			System.out.println("컴퓨터는 가위를 냈습니다.");
			System.out.println( "===================");
			System.out.println("당신은 졌습니다. ^ㅇ^");
		}
		
	}
}
