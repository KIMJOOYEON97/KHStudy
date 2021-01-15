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
public class ResultCheck extends JFrame{
						
//	public static ChangePanel passpanel;
	ImagePanel panel = new ImagePanel("check.png");

	public ResultCheck(int w, int h,String title) {
		TtmUtil.init(this, w, h, title);
		
		ImagePanel panel = new ImagePanel("image/check.png");
		
		
		
		//버튼 원하는 위치에 둘려면 필요함
		panel.setLayout(null);
		
		Font font = new Font("맑은 고딕",Font.BOLD,50);
		
		JButton startBtn = new JButton("결과 확인");
		
		
		startBtn.setFont(font);
		startBtn.setBounds(30, 300, 500, 50);
		startBtn.setBackground(new Color(247,239,220));
		
		
		
		panel.add(startBtn);
		add(panel);
		pack();
		
		startBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Q11(540, 960, "Q11").setVisible(true);
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
