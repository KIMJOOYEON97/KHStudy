package todayToMe.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import todayToMe.controller.TtmController;
import todayToMe.model.vo.Ttm;
import todayToMe.util.TtmUtil;

//사용자에게 맨 처음 보여지는 화면
public class TtmMainview extends JFrame{
						
//	public static ChangePanel passpanel;
	ImagePanel panel = new ImagePanel("Main1.png");

	public TtmMainview(int w, int h,String title) {
		TtmUtil.init(this, w, h, title);
		
		ImagePanel panel = new ImagePanel("image/Main1.png");
		
		
		
		//버튼 원하는 위치에 둘려면 필요함
		panel.setLayout(null);
		
		Font font = new Font("맑은 고딕",Font.BOLD,30);
		
		JButton startBtn = new JButton("start");
		
		
		startBtn.setFont(font);
		startBtn.setBounds(380, 550, 100, 100);
		startBtn.setBackground(new Color(204,204,204));
		
		
		
		panel.add(startBtn);
		add(panel);
		pack();
		
		startBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//Ttm ttm = new Ttm(sumPrice, sumTemp, sumSocial, sumIndividual);
				Ttm ttm = new Ttm(0, 0, 0, 0);
				
				//다음 클래스로 갈 수 있는 방법 찾음.
				new Q1(540, 960, "Q1").setVisible(true);
				JOptionPane.showMessageDialog(null, "Test start. \n 질문을 읽고 A~D사이의 선택지 중 \n하나만 고르세요");
				//Q1으로 화면 교체
		
			}
		});
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
}