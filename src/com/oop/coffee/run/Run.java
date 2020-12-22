package com.oop.coffee.run;

import com.oop.coffee.controller.CoffeeManager;

public class Run {
	/**
	 * - main() 에서 구현할 내용
    1. control클래스 객체생성 및 입력/출력 메소드 호출
	 */
	public static void main(String[] args) {
		
		CoffeeManager cm = new CoffeeManager();
		cm.inputCoffee();
		cm.outputCoffee();
	}

}
