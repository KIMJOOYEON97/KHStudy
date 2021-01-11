package kh.java.gui.swing.container;

import javax.swing.JFrame;

public class JFrameTest2 extends JFrame{

	
	//생성자 안에서 방금했던 모든 것들을 쓰면 된다.
	public JFrameTest2() {
		setTitle("두 번째 프레임");
//		setSize(300,200);
//		setLocation(200, 200);
		setBounds(200,200,300,200); //두줄의 코드를 한 번에
		//x,y,weigth,high
		//리사이즈 방지
		setResizable(false);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JFrameTest2();
	}
	
}
