package todayToMe.util;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import todayToMe.io.TtmIO;

public class  ChooseAnswer extends JFrame{
	private JLabel resultlabel;

	public int q1Num;
	
	public int resultPanel() {
		JPanel choosepanel = new JPanel();
		JRadioButton A = new JRadioButton("A");
		JRadioButton B = new JRadioButton("B");
		JRadioButton C = new JRadioButton("C");
		JRadioButton D = new JRadioButton("D");
		
		ButtonGroup group = new ButtonGroup();
		group.add(A);
		group.add(B);
		group.add(C);
		group.add(D);
		
		JPanel panel = new JPanel();
		this.resultlabel = new JLabel("선택지를 선택하세요");
		panel.add(resultlabel);
		add(panel, BorderLayout.SOUTH);
		
		ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JRadioButton btn = (JRadioButton)e.getSource();
				resultlabel.setText("["+btn.getText()+"]를 선택하셨습니다.");				
				if(btn.getText().equals("A")) {
					q1Num = 0;
				}
				else if(btn.getText().equals("B")) {
					q1Num = 2;
				}
				else if(btn.getText().equals("C")) {
					q1Num = 4;
				}
				else if(btn.getText().equals("D")) {
					q1Num = 5;
				}
			}
		};
		//점수 넘겨주기
		return q1Num;
		
	}
}
