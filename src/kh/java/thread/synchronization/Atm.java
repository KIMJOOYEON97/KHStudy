package kh.java.thread.synchronization;

public class Atm extends Thread {

	private Account acc;

	public Atm(Account acc) {
		this.acc = acc;
	}
	
	@Override
	public void run() {
		while(acc.getBalance() > 0) {
			//100원 200원 300원 중 하나 나올 것임
			int money =(int)(Math.random()*3 +1)*100;
			acc.withdraw(money);
			
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println(Thread.currentThread().getName()+" 종료 !!");
		
	}
	
}
