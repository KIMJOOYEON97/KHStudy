package kh.java.polymorphism.animal;

public abstract class Animal {
/**
 * 자식클래스에 대해 메소드 구현 강제화
 * 객체화 할 수 없다. new 추상클래스(), new 인터페이스() ->객체생성 불가
 * 
 * 1. 추상클래스
 * 		- 추상메소드를 1개 이상 가지고 있다면, 채당 클래스는 반드시 추상클래스여야 한다.
 * 		- 객체생성을 방지하기 위해 추상메소드가 없어도 추상클래스로 만들 수 있다.
 * 		- 추상메소드(미완성메소드)는 abstract키워드를 가지며, 메소드 몸통부 없음.
 * 		- 자식클래스에서 반드시 완성(재작성,Override)해야할 메소드  → 메소드 구현 강제화
 * 2. 인터페이스
 */
	public void say() {
		System.out.println("안녕하세요, 저는 동물입니다.");
	}
	/**
	 * 자식클래스의 구체적인 공격메소드를 추상화처리(묶어주기-> 공통적인 메소드를 만들어줌)
	 * 
	 * 메소드의 구현 강제화 : 추상클래스 & 추상 메소드
	 */
	public abstract void attack();
}