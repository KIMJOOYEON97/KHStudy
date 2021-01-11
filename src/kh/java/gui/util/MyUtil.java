package kh.java.gui.util;

import javax.swing.JFrame;

import kh.java.gui.swing.container.layout.BorderLayoutTest;

public class MyUtil {

	public static void init(JFrame f, int w, int h, String title) {
		f.setTitle(title);
		f.setSize(w, h);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//반복적인 코드는 init호출
	}

}
