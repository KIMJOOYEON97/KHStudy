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
		System.out.print("주민등록변호를 입력하세요.:");
		String  num = sc.next();
		
		char[] number = new char[num.length()];
		for(int i = 0; i<num.length();i++) {
			number[i]=num.charAt(i);
		}
		char[] number2 = new char[number.length];
		
		for(int i =0; i<num.length();i++) {
			number2[i] = number[i];
			if(i<6) {
				System.out.print(number2[i]);
			}
			else {
				System.out.print("*");
			}
		}
		
	}
}
