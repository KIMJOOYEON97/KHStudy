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

import todayToMe.util.TtmUtil;
import todayToMe.view.Q3.ImagePanel;

public class Q10 extends JPanel{
	   private JFrame parent;   //접근제어자  Jframe 
	   private BufferedImage image;
	   
	   public Q10(JFrame paent) {
	      this.parent=parent;
	      try {
	         image= ImageIO.read(new File("images/loading.gif"));      //파일이미지 읽기 
	         
	      }catch(IOException e) {
	         e.printStackTrace();
	      }
	   }
	   @Override
	   public void paintComponent(Graphics g) {
	       super.paintComponent(g);
	       if (image != null) {
	         g.drawImage(image, 0, 0, this);
	       }
	     }
	}
