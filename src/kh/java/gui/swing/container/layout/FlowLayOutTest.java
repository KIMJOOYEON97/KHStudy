package kh.java.gui.swing.container.layout;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import kh.java.gui.util.MyUtil;

public class FlowLayOutTest extends JFrame {

	public FlowLayOutTest(int w, int h, String title) {
		
		MyUtil.init(this,w,h,title);
		
		//JPanel의 기본 Layout객체
		JPanel panel = new JPanel();
		//정렬기준 제시 LEFT, RIGHT, CENTER
		panel.setLayout(new FlowLayout(FlowLayout.LEFT)); //기본은 가운데 정렬
		
		
		for(int i = 0; i<15;i++) {
			panel.add(new JButton((i+1)+"번"));
		}
		
		add(panel);
		
	}
	
	
	public static void main(String[] args) {
		new FlowLayOutTest(500,500,"FlowLayOut").setVisible(true);
	}
}
