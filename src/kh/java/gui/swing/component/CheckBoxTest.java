package kh.java.gui.swing.component;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import kh.java.gui.util.MyUtil;

public class CheckBoxTest extends JFrame{

	JLabel resultLable;
	
	public CheckBoxTest(int w, int h, String title) {
		MyUtil.init(this, w, h, title);
		
		topPanel();
		selectPanel();
		resultPanel();
		
	}

	private void topPanel() {
		JPanel panel = new JPanel();
		JLabel label = new JLabel("과일을 선택하세요");
		panel.add(label);
		add(panel,BorderLayout.NORTH);
	}

	private void selectPanel() {
		JPanel panel = new JPanel();
		JCheckBox[] chks = {
				new JCheckBox("바나나"),
				new JCheckBox("딸기"),
				new JCheckBox("아보카도"),
		}; 
		
		//이벤트핸들러 처리
		for(JCheckBox chk: chks) { //new ActionListener 객체 3개 생성
			//각 checkbox객체에 이벤트리스너 바인딩
			chk.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					System.out.println("actionPerformed");
					List<String> checkedList = new ArrayList<>();
					for(JCheckBox chk: chks) { //for(JCheckBox cnk: chks) { cnk라고 하면 바나나 바나나 바나나 세 번 나온다.
						if(chk.isSelected())
							checkedList.add(chk.getText());
					}
				
					if(checkedList.isEmpty()) 
						resultLable.setText("아무것도 선택하지 않았습니다.");
					else 
						resultLable.setText(checkedList +"를 선택했습니다.");
					
					
					//체크하거나 체크해제할 때 actionPerformed가 호출
				}
			});
		}
		
		
		for(JCheckBox chk :chks)
			panel.add(chk);
		
		add(panel);
		
		
	}

	private void resultPanel() {
		JPanel panel = new JPanel();
		//this.resultLable => this생략 가능
		resultLable = new JLabel("아무 것도 선택하지 않았습니다.");
		panel.add(resultLable);
		add(panel,BorderLayout.SOUTH);
	}

	public static void main(String[] args) {
		new CheckBoxTest(300,200,"체크박스").setVisible(true);
	}
}
