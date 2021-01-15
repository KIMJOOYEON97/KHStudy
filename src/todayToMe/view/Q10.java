package todayToMe.view;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

import todayToMe.controller.Loading;
import todayToMe.util.TtmUtil;
import todayToMe.view.Q3.ImagePanel;

public class Q10 extends JFrame  {
	private JFrame parent;
	ImagePanel panel = new ImagePanel("Q10.png");
//	ImagePanel panel1 = new ImagePanel("Q10_1.png");
	public Q10(int w, int h, String title) {
	
		TtmUtil.init(this, w, h, title);
	
		ImagePanel panel = new ImagePanel("image/Q10.png");
	
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
		new Q10(540,1000,"Q10").setVisible(true);
	}
}
