package todayToMe.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
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
import todayToMe.model.vo.Ttm;
import todayToMe.model.vo.TtmSum;
import todayToMe.util.TtmUtil;
import todayToMe.view.TtmMainview.ImagePanel;


public class Q11 extends JFrame{
	
	private TtmController controller = new TtmController();
	private String imagename = null;
	
	int addPrice = TtmSum.getAddPrice();
	int addTemp = TtmSum.getAddTemp();
	int addSocial = TtmSum.getAddSocial();
	int addIndividual = TtmSum.getAddIndividual();
	
	public String divide() {
		if(addPrice<=3 && addTemp<=5 && addSocial>=5 &&(addIndividual>=2&&addIndividual<=5))
			return imagename = "1.png";
		else if(addPrice>=7&&(addTemp>=3 && addTemp <=7)
				&&(addSocial>=3))
			return imagename = "2.png";
		else if((addPrice>=2&&addPrice<=5)&&(addSocial>=3&&addSocial<=7))
			return imagename = "3.png";
		else if((addPrice>=4&&addPrice<=7)&&(addTemp>=5&&addTemp<=8)&&(addSocial<=3)&&(addIndividual>=2&&addIndividual<=5))
			return imagename ="4.png";
		else if((addPrice>=8&&addPrice<=10)&&(addTemp>=8&&addTemp<=10)&&(addIndividual>=7&&addIndividual<=10))
			return imagename ="5.png";
		else if(addPrice<=4&&(addTemp>=8&&addTemp<=10))
			return imagename ="6.png";
		else if((addPrice>=7&&addPrice<=9)&&addTemp<=5)
			return imagename ="7.png";
		else 
			return imagename ="8.png";
	}

	
	ImagePanel panel = new ImagePanel(imagename);
	public Q11(int w, int h,String title) {
		
//		System.out.println(divide());
		divide();
		
		TtmUtil.init(this, w, h, title);
		
		ImagePanel panel = new ImagePanel("image/"+imagename);
				
		//버튼 원하는 위치에 둘려면 필요함
		panel.setLayout(null);
		
		Font font = new Font("맑은 고딕",Font.BOLD,30);
		
		
		JTextArea outputname = new JTextArea(20,5);
		
		List<String> list = controller.loadName();
		System.out.println(list);//확인용
		for(String s : list)
			outputname.append(s);
		
		
		panel.add(outputname);
		
		add(panel,BorderLayout.SOUTH);
		add(panel);
		pack();
		
	}
	
	public class ImagePanel extends JPanel {

		private BufferedImage image;
		private int w;
		private int h;
		
		public ImagePanel(String fileName) {
			try {
					image = ImageIO.read(new File(fileName));
					w = image.getWidth();
					h = image.getHeight();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}	
	
	
		@Override
		public Dimension getPreferredSize() {
			return new Dimension(w, h);
		}
		
		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			//img 객체를 x,y값만큼 떨어트려 그리기
			//boolean java.awt.Graphics.drawImage(Image img, int x, int y, ImageObserver observer)
			g.drawImage(image, 0,0, null);
		}
	
	}
//	public static void main(String[] args) {
//		new Q11(540,960,"Q11").setVisible(true);
//	}
}
