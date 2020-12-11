package kh.java.loop;
/**
 * 
 * break : 반복문 블럭을 즉시 탈출(중지)
 * 
 * continue : 이하 코드 실행하지 않고, 반복문 시작으로 이동
 * 	- for문 : 증감식
 * 	- while문 : 조건식
 * 
 */
public class BreakContinueTest {
	
	public static void main(String[] arg) {
		BreakContinueTest b = new BreakContinueTest();
//		b.test1();
//		b.test2();
//		b.test3();
		b.test4();
	}
	/**
	 * @실습문제 :ascii code 범위에서 숫자와 영문자만 출력하기
	 * 			단, continue를 무조건 사용해서 코드를 전개하세요.
	 */
	public void test4() {
//		int i = 0;
//		while(i<=127) {
//			i++;
//			if((i>='A'&&i<='Z')||(i>='a'&&i<='z')||(i>='0'&&i<='9')) {
//				System.out.print((char)i+ " ");
//			}
//			else {
//				continue;
//			}
//		}
		
//		for(int i =0;i<=127;i++) {
//			if((i>='A'&&i<='Z')||(i>='a'&&i<='z')||(i>='0'&&i<='9')) {
//				System.out.print((char)i+ " ");
//			}
//			else {
//				continue;
//			}
//		}
		
		int i = 0;
		while(i++ <128) {
			
			//pseudo의사 코딩
			//if (영문자 숫자가 아닌 경우에 true) continue;
			if(i<'0') continue;
			if(i>'9'&& i<'A') continue;
			if(i >'Z' && i <'a') continue;
			if(i>'z')continue;
			
			System.out.println(i+" : "+(char)i);
		}
	}
	
	/**
	 * continue 이하에 증감식 위치 시키지 않기
	 */
	public void test3() {
//		int i = 0;
//		while(i<=100) {
//			i++;
//			//홀수는 true, 짝수는 false
//			if(i % 2 != 0)
//				continue;
////			i++; => 무한반복이 걸린다.//continue문 이하에 증감식을 놓지 않을 것!
//			System.out.println(i);
//		}
		
		for (int i =1;i <= 100;i++) {//가운데 비워두면 true, 무한 반복이 된다
			if (i % 2 != 0)
				continue;
			System.out.println(i);
		}
	}
	/**
	 * 11의 배수가 1000이 넘기 전까지만 출력하세요.
	 */
	public void test2() {
		final int NUM = 11;
		int i = 1;
		while(true) {
			System.out.println(NUM*i++);
			if(i>1000/NUM) {
				break;
			}
		}
	}
	
	public void test1() {
		int i = 1;
		while(true ) {
			System.out.println(i);
			if(i++ ==100) {
				break;
			}
		}
		System.out.println("종료!");
	}

}
