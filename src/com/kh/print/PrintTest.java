package com.kh.print;

public class PrintTest {
	
	/**
	 * java doc 주석
	 * api 문서를 만들 수 있다.
	 * 클래스 메소드 설명할 때
	 */
	
	public static void main(String[] args) {
		//한줄 주석
		/*
		  여러줄 주석
		 */
		PrintTest p = new PrintTest();
		p.test1();
		p.test2();
		p.test22();
		p.test3();
	}
	
	/**
	 * escape 문자
	 * (\ + 특정문자)
	 * 
	 * \n 개행문자(윈도우 \r\n -> 예전에는 두 개 다 썼어야했음, 현재는 \n이면 충분)
	 * \t 탭
	 * 
	 * \\ \(역슬래시) 출력
	 * \" "(쌍따옴표) 출력
	 * 
	 */
	public void test1() {
		System.out.println("안녕"); //출력후 개행
		System.out.print("하\n\n"); //출력
		System.out.print("하"); //출력
		System.out.print("하"); //출력
		System.out.println();
		
		//그는 말했다. "춥다...."
		System.out.println("그는 말했다. \"춥다....\"");
		
		//C:\dev\eclipse\eclipse.exe
		// 윈도우 디렉토리 구분자는 역슬래시를 사용한다.
		System.out.println("C:\\dev\\eclipse\\eclipse.exe");
		System.out.println("C:/dev/eclipse/eclipse.exe"); 
		// 이제는 \역슬래쉬 대신 /슬래쉬를 써도 된다.
		
	}
	/*
	 	"ShakeIt 알람"
--------------------------------------------
	흔들기	쏴리질러	터치하기	원터치
--------------------------------------------
	단 한번만 System.out.println 사용할 것
	 */
	public void test2() {
		System.out.println("\t\t\"ShakeIt 알람\"\n"
				+"--------------------------------------------\n"
				+ "\t흔들기\t쏴리질러\t터치하기\t원터치\n"
				+"--------------------------------------------");
	}
	
	public void test22() {
		System.out.println("홍길동\n\t\"신사임당\"\n\t\t세종대왕\\\"\'\\/");
	}
	/**
	 *  문자열 더하기 연산
	 *  1. 문자열 + 문자열 =>문자열
	 *  2. 문자열 + 숫자 => 문자열
	 *  3. 숫자 + 숫자 => 숫자
	 */
	
	public void test3() {
		System.out.println("가나다"+"라마바사");// "가나다라마바사"
		System.out.println("abc"+123); //"abc123"
		System.out.println("123"+ 4); //"1234" 
		System.out.println(12+34); //46
		
		//왼쪽에서 오른쪽으로 처리
		System.out.println(12 + "34" + 56); //"1234" + "56" =>"123456"
		System.out.println(12 + 34 + "56"); // "4656
		System.out.println("12"+ 3 * 7); //"1221"
	}
	

}
