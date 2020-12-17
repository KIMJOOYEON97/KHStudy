package kh.java.oop.encapsulation.account;
/**
 * 캡슐화
 * 직접접근 할 수 없는 필드하고  우회적 접근이 가능하게 하는 메소드
 * 
 * 구조체의 단점을 극복한 클래스
 * - private접근제한자를 사용해 field의 직접 접근 방지
 * - public접근제한자를 사용한 method를 이용해 우회적으로 사용
 *
 * 
 */
public class Account {

	//클래스인데 여러개의 다른 타입을 묶어서 관리, 구조체흉내 구조체는 C언어에 잇고 java에는 없음
	
	//private 접근제한자 : 같은 클래스 내부에서만 접근 가능
	private String name;
	private long balance; //잔액
	
	//public method를 통해 우회접근
	//setter : 필드값을 세팅하기
	//this : 현재 객체를 가리키는 메소드안의 숨은 참조값 // this 사용하면 이름 충돌 없이 사용할 수 있다.
	public void setName(String name) { //set + 대문자로 시작하는 필드명
		this.name = name;					//매개변수는 필드 타입과 같아야하고
	}									// 리턴값이 없는 void이어야한다.
	public void setBalance(long balance) {
//		balance = balance_;
		this.balance = balance;
	}
	
	//getter : 필드값 가져오기
	public String getName() { //리턴타입은 필드의 타입과 같다.
		return this.name; 	//this 생략가능
	}
	public long getBalance() {
		return this.balance; //this 생략가능
	}
	
	/**
	 * 입금
	 */
	public void deposit(long money) {
		
		if(money > 0 ) {
			balance += money;
			System.out.println(name+"님 계좌에 "+money +"원이 입금되었습니다.");
			}
		else
			System.out.println("잘못된 금액이 입력되었습니다.");
	}
	
	/**
	 * 출금
	 */
	public void withdraw(long money) {
		if(money <= balance) {
			balance -= money;
			System.out.println(name+"님 계좌에 "+money +"원이 출금되었습니다.");
		}
		else
			System.out.println("잔액이 부족합니다.");
	}
}
