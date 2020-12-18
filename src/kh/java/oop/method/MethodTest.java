package kh.java.oop.method;
/**
 * 
 * - static method : class메소드 
 * 			클래스명, 메소드명 호출!
 * 			static 자원(field,method)만 접근 가능하다
 * - non - static method : membeer메소드, instance메소드 
 * 							메소드객체,메소드명 호출!
 *					non-static,static자원 모두 접근 가능하다.
 */
public class MethodTest {
	
	private int num = 100;
	private static int snum = 99;
	
	public static void main(String[] args) {
		MethodTest.a();
		
		MethodTest methodTest = new MethodTest();
		methodTest.b();
		
		System.out.println(MyUtil.add(100, 7));
		System.out.println(MyUtil.add(80, 3));
		
//		System.out.println(num); //Cannot make a static reference to the non-static field num
	}
	
	//공유 객체마다 달라질 것이 없다.
	public static void a() {
		System.out.println("a!"); 
//		System.out.println(num);	//Cannot make a static reference to the non-static field num
		System.out.println(snum);
		
//		b();//Cannot make a static reference to the non-static method b() from the type MethodTest
	}
	
	public void b() {
		System.out.println("b!");
		System.out.println(num);
		System.out.println(snum);
		MethodTest.a();
	}
}
