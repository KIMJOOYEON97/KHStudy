package kh.java.gui.swing.container;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * 
 * 1. JFrame객체 생성1
 *  new JFrame() 직접 객체 생성하기
 * 2. JFrame객체 생성2
 *  JFrame을 상속한 커스텀 클래스 작성 후 객체 생성하기
 */
public class JFrameTest1 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		
		//제목 지정
		f.setTitle("Hello Swing");
		
		//윈도우크기 위치 지정
		f.setSize(300,200);
		f.setLocation(500, 500);
		
		//스크린 가운데 띄우기
		f.setLocationRelativeTo(null);
		
		
		//x버튼을 눌렀을 때 프로그램이 종료되게.
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//자식 컴포넌트 : 컨테이너에 포함된 컴포넌트 (상속 아님)
		f.add(new JLabel("안녕"));
		
		//시각화처리 (맨 마지막에 작성)
		f.setVisible(true);
		
	}

}
