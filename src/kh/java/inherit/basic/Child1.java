package kh.java.inherit.basic;

public class Child1 extends Parent {

	/**
	 * super() 부모생성자를 호출
	 * 생략해도 jvm이 자동으로 생성해 호출
	 * 맨 첫출에 작성되어야 함.
	 * this와 동시 사용불가!
	 */
	
	public Child1() {
		super();//부모생성자를 호출하는 키워드  cf)다른 생성자를 호출하는 키워드 - this //쓰지 않아도 자동으로 있음
		System.out.println("Child1 생성자 호출!!"); //생성자는 상속X?
	}
	
	/**
	 * 메소드 재작성 Override ->덮어쓴다.
	 */
	public void say() {
		System.out.println("제가 첫째입니다.");
	}
	
	public void game() { //기능을 추가했음 Parent에는 없는 것
		System.out.println("첫째가 게임을 합니다.");
	}
}
