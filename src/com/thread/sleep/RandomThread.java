package com.thread.sleep;

public class RandomThread extends Thread {

	private String[] str;

	public RandomThread(String[] str) {
		super();
		this.str = str;
	}
	
	@Override
	public void run() {
		for(int i = 0;i <str.length;i++) {
			System.out.println(str[i]);
			delay(3000);
		}
	}
	
	public void delay(long millis) {
		try {
		Thread.sleep(millis);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
