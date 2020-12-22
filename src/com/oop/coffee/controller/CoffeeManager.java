package com.oop.coffee.controller;

import java.util.Scanner;

import com.oop.coffee.model.dto.Coffee;

/**
 *  - control클래스 구현내용.
    1. Coffee 클래스에 대한 객체 배열(세계3대커피정보) 선언함. 배열크기 3.
    2. 사용자에게 키보드로 세계3대 커피정보를 입력받아, 각 객체에 기록함
    3. 출력 확인함
    <세계3대커피>
    ---------------------------
    원산지           지역
    ---------------------------
    예멘          모카마타리
    자메이카       블루마운틴
    하와이           코나
    ---------------------------

 * @author 김주연
 *
 */
public class CoffeeManager {
	
	//1.여러메소드에 공유할 것
	private Coffee[] arr = new Coffee[3];
	private Scanner sc = new Scanner(System.in);
	
	//2.입력
	public void inputCoffee() {
		for(int i = 0; i <arr.length; i++) {
			System.out.print("원산지를 입력하세요 :");
			String from = sc.next();
			System.out.print("지역을 입력하세요 :");
			String region = sc.next();
			Coffee c = new Coffee(from, region);
			arr[i] = c;
			
		}
	}
	//3. 출력
	public void outputCoffee() {
		System.out.println("<세계 3대 커피>");
		System.out.println("---------------------------");
		System.out.println("원산지"+"\t"+"지역");
		System.out.println("---------------------------");
		for(Coffee c : arr )
			c.printCoffee();
		System.out.println("---------------------------");
	}
	

}
