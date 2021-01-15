package todayToMe.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import todayToMe.model.vo.Ttm;
import todayToMe.util.TtmUtil;
import todayToMe.view.TtmMainview.ImagePanel;

public class Q8 extends JFrame{

	
	ImagePanel panel = new ImagePanel("Q8.png");
	public Q8(int w, int h, String title) {
		TtmUtil.init(this, w, h, title);
		
		ImagePanel panel = new ImagePanel("image/Q8.png");
		
		panel.setLayout(null);
		JButton a = new JButton("A");
		JButton b = new JButton("B");
		JButton c = new JButton("C");
		JButton d = new JButton("D");
		a.setBounds(75, 460, 50,50);
		b.setBounds(75, 530, 50,50);
		c.setBounds(75, 600, 50,50);
		d.setBounds(75, 680, 50,50);
		a.setBackground(new Color(204,204,204));
		b.setBackground(new Color(204,204,204));
		c.setBackground(new Color(204,204,204));
		d.setBackground(new Color(204,204,204));
		panel.add(a);
		panel.add(b);
		panel.add(c);
		panel.add(d);
		add(panel);
		pack();
		
		//선택시 이벤트 발생
		a.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "A선택.");
				new Ttm().setSumTemp(5);
				new Q9(540, 960, "Q9").setVisible(true);
			}
			
			
		});
		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "B선택.");
				new Ttm().setSumTemp(3);
				new Q9(540, 960, "Q9").setVisible(true);
			}
			
			
		});
		c.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "C선택.");
				new Ttm().setSumTemp(2);
				new Q9(540, 960, "Q9").setVisible(true);
			}
			
			
		});
		d.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "D선택.");
				new Ttm().setSumTemp(0);
				new Q9(540, 960, "Q9").setVisible(true);
			}
			
			
		});
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
		new Q8(540,960,"Q1").setVisible(true);
	}
}
