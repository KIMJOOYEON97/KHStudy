package kh.java.polymorphism.animal;

/**
 * 
 * 컴파일된 결과는  Runable.class로 클래스와 동일하다.
 *
 */

public interface Runnable {
	
	//상수 public static final이 자동 추가
//	public static final int LEGS =4; => 무조건 상수다. 일반 필드 아님
	int LEGS =4;
	
	//추상메소드 public abstract가 자동 추가
//	public abstract void run();
	void run();

}
