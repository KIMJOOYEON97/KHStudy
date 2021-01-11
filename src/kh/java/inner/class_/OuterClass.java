package kh.java.inner.class_;

import kh.java.inner.class_.OuterClass.A;

/**
 * 내부클래스 - 변수와 유사함
 * 1. static 내부클래스
 * 2. non-static 내부클래스
 * 3. 지역 내부클래스 
 * 
 * 목적 
 * - 외부클래스 안에서만 사용할 때.
 * - 외부클래스의 자원(private 자원)에 쉽게 접근하기 위해.
 */
public class OuterClass {
	private int num = 100;
	private static int snum = 99;
	
	public OuterClass() {
		new A().aaa();
		
		//non-static에서는 static자원에 접근이 가능하다.
		new B().bbb();
		
		test(); //내부에서 사용은 이렇게 간단하다.
	}
	
	
	
	public class A{
		public void aaa() {
			System.out.println(num);
			System.out.println(snum); //OuterClass 내부여서 private이라도 가능
		}
	}
	
	
	public static class B{
		public void bbb() {
//			System.out.println(num); //non-static 자원 접근 불가
			System.out.println(snum);
		}
	}
	/**
	 * 지역내부클래스는 지역변수와 마찬가지로
	 * 접근제한자를 가질 수 없다.
	 */
	public void test() {
		class C{
			public void ccc() {
				System.out.println(num);
				System.out.println(snum);
			}
		}
		C c = new C(); //클래스 선언이 먼저이고 그 밑에서만 C클래스를 참조할 수 있다.
		c.ccc();
	}
	
	public static void main(String[] args) {
		new OuterClass();
	
		
	}
}
