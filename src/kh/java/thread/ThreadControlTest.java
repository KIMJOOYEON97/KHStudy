package kh.java.thread;

import java.util.concurrent.CountDownLatch;

import javax.swing.JOptionPane;

public class ThreadControlTest {
	public static void main(String[] args) {
		ThreadControlTest t = new ThreadControlTest();
//		t.test1();
//		t.test2();
//		t.test3();
		t.test4();
		
		System.out.println("["+Thread.currentThread().getName()+"종료]");
	}

	/**
	 * 쓰레드 종료시키기
	 * 1. 해당 쓰레드의 interrupt() 메소드를 호출
	 * 2. InterruptedException 발생
	 * 3. catch절에 다음액션(종료) 작성
	 * 
	 *
	 */
	private void test4() {
		Thread cnt = new CountDown(100);
		cnt.start();
		
		JOptionPane.showMessageDialog(null, "확인을 누르면, 카운트다운을 종료합니다.");
		cnt.interrupt();
	}

	/**
	 * 쓰레드간의 종속관계
	 * 일반쓰레드 - Daemon쓰레드 //일반쓰레드 종료시 데몬쓰레드 종료
	 *
	 * Daemon - linux계열의 컴퓨터에서 백그라운드 프로세스를 가리키는 말 //일반 쓰레드에 종속적인 쓰레드
	 */
	
	private void test3() {
		//Daemon
		Thread cnt = new CountDown(50);
		cnt.setDaemon(true); //일반쓰레드 종료에 따라서 종료된다.
		cnt.start();
		
		//main thread 일시 정지
		JOptionPane.showMessageDialog(null,"확인을 누르면 메인쓰레드가 종료됩니다.");
		
	}

	/**
	 *  3의 배수출력 쓰레드와
	 *  4의 배수출력 쓰레드를 생성하고 실행하세요
	 *  [Thread 이름 - 배수]
	 *  실행간격은  200밀리초.
	 *  100초과시 중지할 것.
	 */
	private void test2() {
		Runnable run3 = new Thread(new DanThread(3,200));
		Runnable run4 = new Thread(new DanThread(4,200));
		
		Thread th3 = new Thread(run3);
		Thread th4 = new Thread(run4);
		
		th3.setName("3배수 쓰레드");
		th4.setName("4배수 쓰레드");
		
		th3.start();
		th4.start();
		
		
	}

	private void test1() {
		Thread a = new Thread(new SleepThread('|', 500)); //0.5초에 한번
		Thread b = new Thread(new SleepThread('-', 300));
	
		a.setName("a쓰레드");
		b.setName("b쓰레드");
		
		a.start();
		b.start();
	
	}

	
}
