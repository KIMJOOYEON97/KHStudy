package todayToMe.controller;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

public class Loading extends Thread {

	@Override
	public void run() {
			delay(3000);
		
	}
	
	public void delay(long millis) {
		try {
		Thread.sleep(millis);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
