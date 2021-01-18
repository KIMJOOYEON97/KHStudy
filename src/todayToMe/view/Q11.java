package todayToMe.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import todayToMe.controller.TtmController;
import todayToMe.io.TtmIO;
import todayToMe.model.vo.TtmSum;
import todayToMe.util.TtmUtil;


public class Q11 extends JFrame{
	
	private TtmController controller = new TtmController();
	private String imagename ="8.png";
	
	int addPrice = TtmSum.getAddPrice();
	int addTemp = TtmSum.getAddTemp();
	int addSocial = TtmSum.getAddSocial();
	int addIndividual = TtmSum.getAddIndividual();
	
	public String divide() {
		if(addPrice==0 && addTemp<=5 && addSocial>=6 &&(addIndividual>=2&&addIndividual<=5))
			return imagename = "1.png";
		else if(addPrice>=7&&(addTemp>=3 && addTemp <=8)
				&&(addSocial>=5))
			return imagename = "2.png";
		else if((addPrice>=2&&addPrice<=6)&&(addSocial>=0&&addSocial<=7))
			return imagename = "3.png";
		else if((addPrice>=4&&addPrice<=7)&&(addTemp>=5&&addTemp<=10)&&(addSocial<=6)&&(addIndividual>=2&&addIndividual<=5))
			return imagename ="4.png";
		else if((addPrice>=6&&addPrice<=10)&&(addTemp>=8&&addTemp<=10)&&(addIndividual>=6&&addIndividual<=10))
			return imagename ="5.png";
		else if(addPrice<=4&&(addTemp>=8&&addTemp<=10))
			return imagename ="6.png";
		else if((addPrice>=6&&addPrice<=10)&&addTemp<=5)
			return imagename ="7.png";
		else
			return imagename ="8.png";
	}

	
	public Q11(int w, int h,String title) {
			
		TtmUtil.init(this, w, h, title);
		
		divide();
		
		ImagePanelClass panel = new ImagePanelClass("image/"+imagename);
				
		
		
		String name = controller.loadName();
		
		Font font = new Font("맑은 고딕",Font.BOLD,30);
		
		JLabel outputName = new JLabel(name+"님의 향수는");
		
		outputName.setFont(font);
		outputName.setBounds(300, 300, 30, 10);
		outputName.setBackground(new Color(204,204,204));
		
		panel.add(outputName);
		add(panel);
		pack();

	}
	
	public static void main(String[] args) {
		new Q11(555,1000,"Q11").setVisible(true);
	}
}
