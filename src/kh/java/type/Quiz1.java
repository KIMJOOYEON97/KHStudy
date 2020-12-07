package kh.java.type;

/**
 * # 정수 실습문제
1. 각 자료형별 변수를 만들고 초기화한 후 그 값을 출력하는 코드를 작성해 보자.
    - 정수형 100, 9999억, 
    - 실수 486.520(float), 567.890123
    - 문자 A
    - 문자열 Hello world, 
    - 논리 true
     
     단, 변수를 이용하여 출력하시오 .
    com.kh.test.Test1 에 작성
 * 
 *
 */
public class Quiz1 {
	public static void main(String[] args) {
		
		Quiz1 q = new Quiz1();
		q.test1();
	}

	public void test1() {
		
		int intg1, intg2;
		intg1 =100;
		intg2 =9999;
		System.out.println("정수형"+intg1+","+intg2*10000000L);
		
		float f1 = 486.520f;
		double d1 = 567.890123;
		System.out.println("실수"+f1+"(float)"+d1);
		
		char ch1 = 65;
		System.out.println("문자"+ch1);
		
		String st ="Hello World";
		System.out.println("문자열"+st);
		
		boolean bool = true;
		System.out.println("논리"+bool);
		
	}
}
