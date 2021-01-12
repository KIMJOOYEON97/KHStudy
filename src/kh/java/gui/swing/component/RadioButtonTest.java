package kh.java.gui.swing.component;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import kh.java.gui.util.MyUtil;

public class RadioButtonTest extends JFrame{

	JLabel resultlabel;
	
	public RadioButtonTest(int w, int h, String title) {
		MyUtil.init(this, w, h, title);
		
		topPanel();
		sizePanel();
		resultPanel();
	}

	private void topPanel() {
		JPanel panel = new JPanel();
		JLabel label = new JLabel("커피 사이즈를 선택하세요.");
		panel.add(label);
		add(panel, BorderLayout.NORTH);
	}

	private void sizePanel() {
		JPanel panel = new JPanel();
		//그룹이 지어지지 않아서 단일 선택이 안됌 => 단일 선택을 위해 그룹핑 해야함
		JRadioButton small = new JRadioButton("small");
		JRadioButton medium = new JRadioButton("medium");
		JRadioButton large = new JRadioButton("large");
		
		//단일선택을 위해 그루핑 필수!
		ButtonGroup group = new ButtonGroup();
		group.add(small);
		group.add(medium);
		group.add(large);
		
		//이벤트 핸들러 설치 =>각각의 컴포넌트마다 추가
		ActionListener listener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
										//이벤트 발생객체
				JRadioButton btn = (JRadioButton)e.getSource();
				resultlabel.setText("["+btn.getText()+"]를 선택하셨습니다.");
			}
			
		};
		small.addActionListener(listener);
		medium.addActionListener(listener);
		large.addActionListener(listener);
		
		
		
		panel.add(small);		
		panel.add(medium);		
		panel.add(large);
		add(panel); //center에 추가하는 것이기 때문에 그냥하면된다.
	}

	private void resultPanel() {
		JPanel panel = new JPanel();
		//필드로 선언
		this.resultlabel = new JLabel("사이즈를 선택하세요.");
		panel.add(resultlabel);
		add(panel, BorderLayout.SOUTH);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new RadioButtonTest(300,200,"라디오 버튼").setVisible(true);
	}
	
}
