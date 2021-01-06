package kh.java.thread;

public class ThreadBasicTest {
	
	public static void main(String[] args) {
		ThreadBasicTest t = new ThreadBasicTest();
//		t.test0();
//		t.test1();
		t.test2();
		System.out.print("<메인끝>"); //메인 스레드 끝났다고해서 중지하지 않는다.
	}
	/**
	 * 쓰레드 생성방법2
	 * Runnable 인터페이스 구현
	 */
	private void test2() {
		Runnable run1 = new CustomThread2('|');
		Runnable run2 = new CustomThread2('-');
		
		Thread th1 = new Thread(run1);
		Thread th2 = new Thread(run2);
		
		th1.start();
		th2.start();
		
	}
	/**
	 * 싱글 쓰레드
	 */
	private void test0() {
		//A
		for(int i = 0; i <100; i++) {
			System.out.print('|');
		}
		//B
		for(int i = 0; i <100; i++) {
			System.out.print('-');
		}
		
	}
	/**
	 * 스레드 생성방법
	 * 1. Thread 클래스 상속
	 */
	private void test1() {
		Thread th1 = new CustomThread1('|');
		Thread th2 = new CustomThread1('-');
		
		//우선순위 지정 (1 ~ 10) 기본값5
		th2.setPriority(Thread.MAX_PRIORITY);//10
		th1.setPriority(Thread.MIN_PRIORITY);//10
		
		th1.start();
		th2.start();
	}
}
