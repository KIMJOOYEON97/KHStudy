package kh.java.test.array;

import java.util.Scanner;

public class Test5 {
	
	public static void main(String[] args) {
		Test5 t5 = new Test5();
		t5.test();
	}
/**
 *  주민등록번호 성별자리 이후부터 *로 가리기.  
    단, 원본 배열값은 변경 없이 배열 복사본으로 
    변경하세요
     
    힌트) 복사방법
       - for문이용 1:1대입
       - System.arraycopy() 매소드 이용
       - clone() 매소드 이용

 */
	public void test() {
		Scanner sc = new Scanner(System.in);
		//1. 주민번호 입력(문자열)
		System.out.print("주민등록변호를 입력하세요.:");
		String  num = sc.nextLine();
		
		//2.char[] 원본배열로 옮기기
		//char[] juArr = ju.toCharArray(); 문자열을 char 배열로 리턴
		char[] number = new char[num.length()];
		for(int i = 0; i<num.length();i++) {
			number[i]=num.charAt(i);
		}
		
		//3.char[] 복사본 생성
		char[] number2 = new char[number.length];
		//복사본 생성과 동시에 4. 해당자리를 *로 변경
		for(int i =0; i<num.length();i++) {
			number2[i] = number[i];
			if(i<7) {
				System.out.print(number2[i]);
			}
			else {
				System.out.print("*");
			}
		}
		
	}
}
