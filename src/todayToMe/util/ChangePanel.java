package todayToMe.util;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import todayToMe.view.Q1;
import todayToMe.view.TtmMainview;

//질문선택 버튼창.
public class ChangePanel extends JPanel {

	private JFrame parent;
	
	public ChangePanel(JFrame parent, Color c, String title) {
		this.parent = parent; //부모객체에 접근하기 위해 미리 필드로 지정. 필드로 주소값을 가지고 있음
		
		setBackground(c);
		setLayout(new BorderLayout());
		add(new JLabel(title), BorderLayout.NORTH);
		
		JPanel linkPanel = new JPanel();
		JButton btn0 = new JButton("0"); //이 버튼을 누르면 다음 패널로 넘어가려고 
		JButton btn1 = new JButton("1");
		JButton btn2 = new JButton("2");
		linkPanel.add(btn0);
		linkPanel.add(btn1);
		linkPanel.add(btn2);
		add(linkPanel, BorderLayout.SOUTH);
		
		//각 버튼별 패널교체하기
		ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int index = Integer.parseInt(((JButton)e.getSource()).getText()); 
						//e.getSource()=>어디로부터 이벤트가 발생했는지 알 수 있음
				System.out.println(index);
				JPanel nextPanel = TtmMainview.passpanel; //MainFrame의 panels의 index번지를 참조함
				TtmUtil.changePanel(parent,ChangePanel.this,nextPanel); //여기서 this는 내부클래스 ActionListener객체로 넘어간다
				//부모 컨테이너에게 이 패널로 바꾸어달라고 해야함
				
			}
		};
		
		btn0.addActionListener(listener);
		btn1.addActionListener(listener);
		btn2.addActionListener(listener);
		
	}

}


