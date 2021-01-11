package kh.java.gui.swing.container;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JPanelTest extends JFrame{

	public JPanelTest() {
		//800 500 가운데 정렬
		setSize(800, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//JFrame의 기본 LayoutManager객체는 BorderLayout이다.
//		setLayout(new BorderLayout());생략해도 이게 있는 것이다.
		//null layout : layout manager객체를 사용하지 않고 직접 좌표를 지정함
		setLayout(null); //직접 좌표지정
		
		//자식컴포넌트 추가
		JPanel panel1 = new JPanel();
//		panel1.setBackground(Color.MAGENTA);
		panel1.setBackground(new Color(255,0,0));//red 순서대로 RGB값
		//컬러픽커에서 값뽑아오면 된다.
		JLabel label1 = new JLabel("panel1");
		panel1.setBounds(100,50,300,400);
		
		panel1.add(label1);
		
		JPanel panel2 = new JPanel();
		panel2.setBackground(Color.gray);
		JLabel label2 = new JLabel("panel2");
		panel2.setBounds(400, 50, 300, 400);
		panel2.add(label2);

		
		//매치를 담당하는 객체 = 레이아웃 매니저
		//레이아웃 메니저를 고려해야한다.
		
		
		//프레임에 패널 추가
		add(panel1, BorderLayout.NORTH);
		add(panel2); //그레이만 나오고 레드를 잃었다... //panel2가 덮어 씌운 것이다.
		
		
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JPanelTest(); //화면에 보여주기 위한 컴포넌트를 설정
	}
}
