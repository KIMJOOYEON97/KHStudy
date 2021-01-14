package todayToMe.view;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import todayToMe.util.TtmUtil;
import todayToMe.view.TtmMainview.ImagePanel;

public class Q4 extends JFrame{

	
	ImagePanel panel = new ImagePanel("Q4.png");
	public Q4(int w, int h, String title) {
		TtmUtil.init(this, w, h, title);
		
		ImagePanel panel = new ImagePanel("image/Q4.png");
		
		panel.setLayout(null);
		JButton a = new JButton("A");
		JButton b = new JButton("B");
		JButton c = new JButton("C");
		JButton d = new JButton("D");
		a.setBounds(60, 460, 50,50);
		b.setBounds(60, 530, 50,50);
		c.setBounds(60, 600, 50,50);
		d.setBounds(60, 670, 50,50);
		panel.add(a);
		panel.add(b);
		panel.add(c);
		panel.add(d);
		add(panel);
		pack();
	}
	
	public class ImagePanel extends JPanel{
		
		private BufferedImage image;
		private int w;
		private int h;
		
		public ImagePanel(String fileName) {
			try {
				image = ImageIO.read(new File(fileName));
				w = image.getWidth();
				h = image.getHeight();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		@Override
		public Dimension getPreferredSize() {
			return new Dimension(w,h);
			
		}
		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			g.drawImage(image,0,0,null);
		}
		
		
	}

	public static void main(String[] args) {
		new Q4(540,960,"Q1").setVisible(true);
	}
}
