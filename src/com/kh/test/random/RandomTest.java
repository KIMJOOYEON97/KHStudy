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
		int chi =sc.nextInt();
		int com =(int)(Math.random()*3)+1;
		
		
		System.out.println("========결과========");
		if(chi==1 && com ==3) {
			System.out.println("당신은 가위를 냈습니다.");
			System.out.println("컴퓨터는 보를 냈습니다.");
			System.out.println( "===================");
			System.out.println("당신이 이겼습니다. ㅠ.ㅠ");
		}
		else if(chi ==1 && com == 2) {
			System.out.println("당신은 가위를 냈습니다.");
			System.out.println("컴퓨터는 바위를 냈습니다.");
			System.out.println( "===================");
			System.out.println("당신은 졌습니다. ^ㅇ^");
		}
		else if(chi ==1 && com == 1) {
			System.out.println("당신은 가위를 냈습니다.");
			System.out.println("컴퓨터는 가위를 냈습니다.");
			System.out.println( "===================");
			System.out.println("비겼습니다. ㅇㅅㅇ");
		}
		else if(chi==2 && com ==3) {
			System.out.println("당신은 바위를 냈습니다.");
			System.out.println("컴퓨터는 보를 냈습니다.");
			System.out.println( "===================");
			System.out.println("당신은 졌습니다. ^ㅇ^");
		}
		else if(chi ==2 && com == 2) {
			System.out.println("당신은 바위를 냈습니다.");
			System.out.println("컴퓨터는 바위를 냈습니다.");
			System.out.println( "===================");
			System.out.println("비겼습니다. ㅇㅅㅇ");
		}
		else if(chi ==2 && com == 1) {
			System.out.println("당신은 바위를 냈습니다.");
			System.out.println("컴퓨터는 가위를 냈습니다.");
			System.out.println( "===================");
			System.out.println("당신이 이겼습니다. ㅠ.ㅠ");
		}
		else if(chi==3 && com ==3) {
			System.out.println("당신은 보를 냈습니다.");
			System.out.println("컴퓨터는 보를 냈습니다.");
			System.out.println( "===================");
			System.out.println("비겼습니다. ㅇㅅㅇ");
		}
		else if(chi ==3 && com == 2) {
			System.out.println("당신은 보를 냈습니다.");
			System.out.println("컴퓨터는 바위를 냈습니다.");
			System.out.println( "===================");
			System.out.println("당신이 이겼습니다. ㅠ.ㅠ");
		}
		else if(chi ==3 && com == 1) {
			System.out.println("당신은 보를 냈습니다.");
			System.out.println("컴퓨터는 가위를 냈습니다.");
			System.out.println( "===================");
			System.out.println("당신은 졌습니다. ^ㅇ^");
		}
		
	}
}
