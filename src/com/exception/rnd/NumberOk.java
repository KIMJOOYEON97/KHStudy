package com.exception.rnd;

import java.util.Random;
import java.util.Scanner;

public class NumberOk {

	
	private static Scanner sc = new Scanner(System.in);
	//임의의 정수 발생 ->한 번밖에 안되는데 어떻게해야 여러번 가능한지 모르겠다.
	Random rnd = new Random();
	int num = rnd.nextInt(100)+1;
	
	
	public static void main(String[] args) {
		
		//메서드 호출은 객체레퍼런스를 통해 게임시작메소드 호출.
		NumberOk n =new NumberOk();
		
//		메인에서 반환값에 따라 정수를 맞힐 때 까지 checkNumber 반복 실행
//		값을 맞히면 "맞았습니다." 출력하고, 몇번째에 맞혔는지도 출력
//		계속 할 것인지 물어서, y 이면 계속, n 이면 종료시킴
		char choice =' ';
		int count = 0;
		
		
		while(true) {
			
			while(true) {
				//checkNumber의 리턴값이 담김 =>checkNumber가 반복 실행
				switch(n.getName()) {
				case -1:
					System.out.println("입력한 숫자보다 작습니다.");count++;continue;
				case 1:
					System.out.println("입력한 수보다 큽니다.");count++;continue;
				case 0:
					System.out.println(count+"번만에 맞았습니다.");
				default:
					System.out.print("계속 하시겟습니까?(y/n)");}
				choice = sc.next().charAt(0);
				if(choice == 'n') {
					System.out.println("프로그램을 종료합니다.");break;}
			}
		}
			
			}
			
	
		
	public int getName() {
		
		while(true) {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.print("정수 입력 :");
				int user = sc.nextInt();
				
				return(checkNumber(user));
				
				//사용자의 입력예외에 대해 예외처리 할 것
			}catch(Exception e) {
				System.out.println("잘못입력하였습니다");
			}	
		}	
	}

	public int checkNumber(int user) {
//		System.out.println(num);
		if(num>user) {
			return 1;
		}
		else if(num==user) {
			return 0;
		}
		else {
			return -1;	
		
		}	
		
	}
}
