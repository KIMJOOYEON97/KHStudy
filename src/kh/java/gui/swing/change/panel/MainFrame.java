package kh.java.gui.swing.change.panel;

import java.awt.Color;

import javax.swing.JFrame;

import kh.java.gui.util.MyUtil;

public class MainFrame extends JFrame{

	public static CustomPanel[] panels = new CustomPanel[3]; //외부에서 얼마든지 접근 가능
	
	public MainFrame(int w, int h, String title) {
		MyUtil.init(this, w, h, title);
		
		//panels 객체 할당                          //this=>현재 패널의 부모를 넘긴 것이다.
		panels[0]= new CustomPanel(this, Color.green,"panel0");
		panels[1]= new CustomPanel(this, Color.pink,"panel1");
		panels[2]= new CustomPanel(this, Color.black,"panel2");
		
		add(panels[0]);//시작페이지
		
	}

}
