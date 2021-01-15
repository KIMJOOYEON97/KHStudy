package todayToMe.view;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

import todayToMe.util.TtmUtil;
import todayToMe.view.Q3.ImagePanel;

public class Q10_7 extends JFrame {

	ImagePanel panel = new ImagePanel("10_7.png");
	public Q10_7(int w, int h, String title) {

		TtmUtil.init(this, w, h, title);
	
		ImagePanel panel = new ImagePanel("image/10_7.png");
	
		add(panel);
		pack();
		
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		new Q10_2(540,960,"Q10_2").setVisible(true);
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
		new Q10_7(540,960,"Q10_7").setVisible(true);
	}
}
