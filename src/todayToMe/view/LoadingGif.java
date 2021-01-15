package todayToMe.view;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class  LoadingGif {
  public static void main(String[] args) throws InterruptedException {
    SwingUtilities.invokeLater(new Runnable() {
      @Override
      public void run() {
        JFrame frame = new JFrame();
        frame.add(new ImagePanel());

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(550, 1000);
        frame.setVisible(true);
        
       
      }
    });
    //결과 확인 나중에 나오게.
    Thread.sleep(3000);
    new ResultCheck(540, 960, "ResultCheck").setVisible(true);
    
  }
}

//class resultcheck extends Thread{
	
//}


class ImagePanel extends JPanel {

  Image image;
//gif 하는 방법
  public ImagePanel() {
    image = Toolkit.getDefaultToolkit().createImage("image/loading.gif");
  }

  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    if (image != null) {
      g.drawImage(image, 0, 0, this);
    }
  }

}