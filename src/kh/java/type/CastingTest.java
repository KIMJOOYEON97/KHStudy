package kh.java.type;

/**
 * 컴퓨터 작동원리
 * 1. 같은 자료형끼리만 연산할 수 있다.
 * 2. 연산 결과 역시 동일한 자료형이다.
 * 3. 같은 자료형의 변수에만 대입할 수 있다. 
 * 
 * 위의 조건을 만족하기 위해서 암묵적/명시적 형변환이 필요하다.
 * 1. 암묵적 : 자동으로 처리
 * 2. 명시적: 형변환 코드 필요
 * 
 */

public class CastingTest {
	
	public static void main(String[] args) {
		CastingTest c = new CastingTest();
//		c.test1();
//		c.test2();
//		c.test3();
		c.test4();
	}
	/**
	 * java.lang.String 문자열
	 * "abc"
	 * - 참조형(보통 객체를 만들어서 사용)
	 * - 기본형처럼 사용가능 (리터럴을 대입하는 형태) 이것밖에 없음
	 */
	
	public void test4() {
		String name ="홍길동";
		String name2 = new String("홍길동");
		
		// 더하기연산
		System.out.println(name + "만세!");
		
		//char => 누구랑 연산하느냐에 따라 다름
		System.out.println(name +'a'); // 문자열을 만나면 문자열
		System.out.println(123 +'a'); //정수형을 만나면 정수형
		
		
	}

	/**
	 * 자동형변환
	 *  - 크기가 작은 타입에서 큰 타입으로 변환은 자동으로 처리
	 *  - 정수에서 실수로의 변환은 자동처리
	 *  - byte(1) -> short(2) -> int(4) -> long(8) -> float(4) -> double(8)
	 * 				 char(2)
	 * 
	 */
	public void test1() {
		
		//대입연산
		int num = 300;
		long lnum = num; //int가 long으로 바뀜
		System.out.println("lnum = " + lnum);
		
		int a = 3;
		double b =1.5;
		System.out.println(a+b); //int(3) + double
								// double(3.0) +double
		
		int c ='a'; // int = char
					// int = int	
		System.out.println(c);
		
		System.out.println('c'+1); //char('c')+int
								  //int(99)+int
		
		
	}
	/**
	 * 명시적 형변환
	 * 1. 크기가 작은 타입으로 형변환 - 데이터 손실
	 * 2. 크기가 큰 타입으로 형변환
	 */
	public void test2() {
		//1. 데이터 손실이 있는 경우
		int num = (int)3.7; //int =double 왼쪽으로 대입하는 것 고정
		System.out.println(num);
		
		//2. 데이터손실 없이 큰 타입으로 변환
		int a = 10;
		int b = 4;
		System.out.println((double)a/b);//(double)int / int
										// double / int
										// double / double
		System.out.println( a*1.0 / b);
		
		//2147483647 + 1 => 2147483648
		int i = Integer.MAX_VALUE;
		System.out.println((long)i+1);
		System.out.println(i+1L);
	}
	
	/**
	 * 형변환 유의사항
	 *  - byte, short, char타입은 연산시 
	 *  자동으로 int(정수 기본형)으로 변환되서 처리
	 */
	public void test3() {
		byte b1 = 10;
		byte b2 = 20;
		byte result = (byte)(b1 +b2) ; //Type mismatch: cannot convert from int to byte
		System.out.println("result = " +result);
		
		boolean bool = 'a' >(b1+b2);
		//				char > (byte+byte)
		//				char > (int + int)
		//				char > int
		// 				int(97) >int(30)
		System.out.println("bool = " + bool);
		
		// char변수에 int 대입
		char ch = 65; // 자동으로 작은 곳으로 이동하는 예외적인 상황이나 655~가 넘어가면 안됌.
		System.out.println(ch);
		
		ch = '\ud734'; // 휴
		System.out.println(ch);
	}
	
}