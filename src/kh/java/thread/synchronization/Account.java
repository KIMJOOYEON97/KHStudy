package kh.java.thread.synchronization;

public class Account {

	private int balance;
	
	public Account(int balance) {
		this.balance = balance;
	}
	
	/**
	 * 출금메소드 : atm기는 이 메소드를 통해 출금 가능
	 * 결국 객체 단위로 동기화처리 : account 임계영역(한 번에 하나만 들어갈 수 있음)으로 설정하게 된다
	 * 동기화처리
	 * 1. synchronized 메소드 만들기
	 * 2. synchronized block 사용하기 (추천) 
	 * 
	 */
	public void withdraw(int money) {
		String threadName = Thread.currentThread().getName();
		
		//임계 영역으로 설정할 객체가 들어감 this에.
		synchronized (this) { //이 블록 영역만 임계영역으로 설정. 조금씩만 독점.
			System.out.println("["+threadName+"-> 잔액 : ￦"+balance+"]");
			if(money <= balance) {
				balance -= money;
				System.out.println("["+threadName+"출금 : ￦"+money+",-> 잔액 : ￦"+balance+"]");
			}
			else {
				System.out.println("["+threadName+"출금 : ￦"+money+"-> 잔액이 부족합니다.]");
			}			
		}
	}

	public int getBalance() {
		return balance;
	}
	
}
