package todayToMe.view;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

import todayToMe.controller.Loading;
import todayToMe.util.TtmUtil;
import todayToMe.view.Q3.ImagePanel;

public class Q10_2 extends JFrame implements Runnable {

	ImagePanel panel = new ImagePanel("10_2.png");
	public Q10_2(int w, int h, String title) {

		TtmUtil.init(this, w, h, title);
	
		ImagePanel panel = new ImagePanel("image/10_2.png");
	
		add(panel);
		pack();
		
//		new Loading().start();
		
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
	@Override
	public void run() {
		new Q10_2(540,960,"Q10_2").setVisible(true);		
		delay(2000);
	}
	public void delay(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
