package kh.java.exception;

import java.util.Scanner;

public class ThrowExceptionTest {

	public static void main(String[] args) {
		ThrowExceptionTest t = new ThrowExceptionTest();
//		t.test1();
		t.test2();
		System.out.println("---정상종료---");
	}
	/**
	 * 예외를 통한 프로그램 흐름 분기
	 */
	public void test2() {
		try {//예외처리로 인한 분기처리를 책임을 넘겨받아서 
			checkAgeThrowException();			
		}catch(Exception e) {
//			System.out.println(e.getMessage());
			e.printStackTrace();
			return; //밑으로  더 진행이 되지 않도록 끊어줌
		}
		
		System.out.println("성인 고스톱 게임을 시작합니다. 후방주의!");
	}
	/**
	 * 나이를 입력받고,
	 * 미성년자인 경우에는 예외를 던지는 메소드
	 */
	public void checkAgeThrowException() throws UnderAgeException{ //예외를 다시 던짐(책임넘김)
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		if(age < 20)
//			throw new Exception("미성년자 : "+age);//예외를 던짐
			throw new UnderAgeException();//예외를 던짐
		
	}
	
	/**
	 * 성인인증해야 가능한 게임
	 * 1. 성인인증
	 * 2. 게임시작 (성인인경우에만 게임시작)
	 */
	public void test1() {
		boolean isAdult = checkAge();
		
		//흐름을 나누는 분기 처리를 함
		if(!isAdult) {
			System.out.println("성인이 아닙니다. 게임을 종료합니다.");
			return;
		}
		
		System.out.println("성인 고스톱 게임을 시작합니다. 후방주의!");
	}
	
	public boolean checkAge() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			
			try{
				System.out.print("만 나이를 입력하세요 : ");
				int age = sc.nextInt();
				
				if(age>=18 && age<150) {
					return true;
				}
				else if(age>0&&age<18) {
					return false;					
				}
			}catch(Exception e) {
				System.out.println("잘못된 값을 입력하였습니다. 다시입력하세요.");
			}
		}
	}
}
