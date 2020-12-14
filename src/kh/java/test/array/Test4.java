package kh.java.test.array;

import java.util.Scanner;

public class Test4 {
	
	public static void main(String[] args) {
		Test4 t4 = new Test4();
//		t4.test1();
		t4.test2();
	}
	/**
	 * 사용자의 전화번호를 입력받고, 11자리의 문자형배열에 저장한후,  가운데 4자리를 *로 가리기.  
    단, 원본 배열값은 변경 없이 배열 복사본으로 변경하세요
     
        힌트) 복사방법
       - for문이용 1:1대입
       - System.arraycopy() 매소드 이용
       - clone() 매소드 이용
       
       */
       
	public void test1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("전화번호를 입력하세요 : ");
		String phNum= sc.nextLine();
		
		char [] phoneNumber = new char[phNum.length()];
		for(int i = 0 ; i < phNum.length(); i++) {
			phoneNumber[i]=phNum.charAt(i);
		}
		
		char[] phoneNumer2 =phoneNumber.clone();
		phoneNumer2[3]='*';
		phoneNumer2[4]='*';
		phoneNumer2[5]='*';
		phoneNumer2[6]='*';
		
		System.out.print(phoneNumer2);
	}
       /**
- 메소드명 : public void test2()
    위문제를 배열복사없이 문자열차원에 가운데 4자리를 교체해보자.
    * java.lang.String.substring(beginIndex, endIndex) 메소드 찾아볼것!
    * 문자열은 직접 수정이 불가하므로, 특정자리의 문자열을 가져와 처리해야한다.

	 */
	public void test2() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("전화번호를 입력하세요 : ");
		String phNum= sc.nextLine();
		
		String front ="";
		String back ="";
		//substring은 처음 시작인덱스는 그대로이나 끝나는 인덱스는 +1을 해줘야한다. 
		// 즉, 표기된 것보다 실제 인덱스는 -1이라는 것이다.
		front = phNum.substring(0, 3); //(0,1,2)
		back =phNum.substring(7, 11); //(7,8,9,10)
		
	
		System.out.println(front+"****"+back);
		
	}

}
