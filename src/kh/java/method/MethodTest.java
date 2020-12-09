package kh.java.method;

import java.util.Scanner;

public class MethodTest {

	public static void main(String[] args) {

		MethodTest m = new MethodTest();
//		m.test1();
		m.test2();
	}

	public void test2() {
		
		int num1 = inputNumber();
//		dataoverflow
//		short num1 = (short)inputNumber(); =>short(2byte)의 범위가 넘어가면 문제가 생긴다. 
		
		int num2 = inputNumber();


		System.out.println(num1 + "+" + num2 + "= " + (num1 + num2));
	}

	/**
	 * int형 값을 리턴하는 메소드
	 * 
	 */
	public int inputNumber() {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		return num; //평소에는 return이 숨어져 있음 //리턴값은 무조건 하나
		//메소드 호출부 리턴시 num값을 가지고 간다.
	}

	public void test1() {

		// 1. 데이터 할당부
		String name = "홍길동";
		int age = 30;

		// 2. 데이터 출력부
		// 현재객체를 가리키는 참조변수
		this.printInfo(name, age);

		name = "신사임당";
		age = 50;
		printInfo(name, age);

		name = "세종대왕";
		age = 60;
		printInfo(name, age);

		printInfo("유관순", 16); // 매개인수 arguments
	}

	/**
	 * 매개인수 (인자) arguments : 메소드 호출에 전달된 값 ex) name,age 매개변수 parameter : 메소드 호출시 전달된
	 * 값이 보관될 변수 (공간)
	 */

	public void printInfo(String name, int sal) {
		System.out.println("안녕하세요~ " + sal + "살" + name + "입니다.");

	}
}
