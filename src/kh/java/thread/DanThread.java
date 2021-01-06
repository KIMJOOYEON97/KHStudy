package kh.java.thread;

public class DanThread implements Runnable {

	private int dan;
	private long millis;
	
	public DanThread(int dan, long millis) {
		this.dan = dan;
		this.millis = millis;
	}
	
	@Override
	public void run() {
		
//		String threadName = Thread.currentThread().getName()
//		int i = 1;	
//		while(true) {
//			int prod = i++ *num;
//			if(prod < 100)
//				System.out.println(threadName+ " - "+prod);
//		}
		
		for(int i=1; dan*i <=100; i++) {
			System.out.println("["+dan+"의 배수 쓰레드"+dan*i+"]");
		
			try {
				Thread.sleep(millis);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			
		}
		System.out.println(Thread.currentThread().getName()+"끝.");
		
	}

}
