package kh.java.type;

/**
 * 
 * 자료형 Data Type
 * 1. 기본형 Primitive Type	
 *  - 값(literal)을 저장
 *  - 8가지( 문자형 char, 
 *  		논리형 boolean,
 *  		정수형 byte short int long, 
 *  		실수형 float double)
 *  
 * 2. 참조형 Reference Type
 *  - 주소값을 저장(4byte)
 *  - 기본형을 제외한 모든 타입 
 *		String, System, Date, Calendar, SimpleDateFormat
 *	       모든 클래스는 자료형이다.
 * 
 * bit
 * byte - 8bit
 * kilo byte - 1024bit
 * mega byte - 1024 kb 100만 바이트
 * giga byte - 1024 mb 10억 바이트
 * tera byte - 1024 gb 10조 바이트
 * peta byte - 1024 tb 1000조 바이트
 * exa byte -
 * zetta byte -
 * yotta byte -
 * 
 *  
 */


public class PrimitiveTypeTest {
	
	public static void main(String[] args) {
		PrimitiveTypeTest p =
				new PrimitiveTypeTest();
//		p.test1();
//		p.test2();
//		p.test3();
		p.test4();
	}
	/**
	 * Data Overflow
	 */
	public void test4() {
		int i = Integer.MAX_VALUE;
		System.out.println(i);
		
		i=i+1;
		System.out.println(i);
		
		
	}
	/**
	 * 상수
	 * 한 번 값대입 후에 값을 변경할 수 없는 변수
	 * final
	 */
	public void test3() {
		
		final int AGE = 20;
//		age =30;
		System.out.println(AGE);
		
		int myAge =AGE +1;
		System.out.println(myAge);
		
		//jdk가 지정해둔 상수
		System.out.println(10*10*Math.PI);
		
		System.out.println(Byte.MIN_VALUE +"~"+Byte.MAX_VALUE);
		System.out.println(Short.MIN_VALUE+"~"+Short.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE+"~"+Integer.MAX_VALUE);
		System.out.println(Long.MIN_VALUE+"~"+Long.MAX_VALUE);
	}
	
	/**
	 * 초기화 
	 * 변수 선언과 값대입을 한줄에서 처리
	 */
	public void test2() {
//		int num;
//		num =123;
		
		int num =123;
		System.out.println(num);
		
		double d;
		d = 0.1;
		//변수는 값대입 없이 사용할 수 없다.
		d = d + 1.23;
		System.out.println(d);
				
		//같은 타입인 경우, 한줄에 여러개 변수선언, 초기화가 가능하다.
		int a, b;
		a=1;
		b=2;
		
		int c =3, e= 4;
		
		System.out.println(a + "" + b);
		
		//정수연산
		int i = 10;
		int j = 3;
		
		System.out.println(i+j);
		System.out.println(i-j);
		System.out.println(i*j);
		System.out.println(i / j); // 나누기 몫만 처리
		System.out.println(i % j); // 나머지 
		
	}
	
	/**
	 * 기본형
	 * 1. 논리형
	 * 		boolean(1byte) : true | false
	 * 2. 문자형
	 * 		char(2byte) 0~65535(2^16=65536가지) 
	 * 					   : 'a', '가', '1'
	 * 3. 정수형
	 * 		byte(1byte) -128 ~ 127(256가지)
	 * 		short(2byte)-32768 ~ 32767(65536가지)
	 *  	int(4byte)(기본형) -21억 ~ 21억 (42억가지)  
	 *  	long(8byte) -922경 ~ 922경
	 * 		
	 * 4. 실수형
	 * 		float(4byte) 소수점 이하 7자리
	 * 		double(8byte)(기본형) 소수점 이하 16자리
	 */
	
	public void test1() {
		//1. 변수 선언
		boolean bool;
		
		char ch;
		byte b;
		short sh;
		int i;
		long l;
		
		float f;
		double d;
		
		//2. 변수에 값대입
		bool=true;
		bool=false;
		bool = (5 > 2); // > < >= <= 좌항기준으로 붙인다
		bool = ( 3 == 4 );
		bool = ( 3 != 4 );
		bool = !bool;
		ch = 'a'; 
		ch = '가';
		ch ='韓';
		ch = ' '; //공란
		
		b=120;
//		b=130; //Type mismatch: cannot convert from int to byte
		sh = 32000;
		i = 100000000;
		l = 1234567890123L;//The literal 1234567890123 of type int is out of range
		
		//실수 기본형 double
		f=0.1234567890F;
		d=0.12345678901234567890;
		
		//3. 변수 사용 (출력)
		System.out.println("bool = "+bool);
		System.out.println("ch = " +ch);
		System.out.println("b = " + b);
		System.out.println("sh = " + sh);
		System.out.println("i = " + i);
		System.out.println("l = " + l);
		System.out.println("f = " + f);
		System.out.println("d = " + d);
		
		
	}

}