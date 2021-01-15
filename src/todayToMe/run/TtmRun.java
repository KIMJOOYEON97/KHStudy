package todayToMe.run;

import javax.swing.JFrame;

import todayToMe.controller.Loading;
import todayToMe.model.vo.Ttm;
import todayToMe.util.TtmUtil;
import todayToMe.view.LoadingGif;
import todayToMe.view.Q1;
import todayToMe.view.Q10;
import todayToMe.view.Q10_1;
import todayToMe.view.Q10_2;
import todayToMe.view.Q10_3;
import todayToMe.view.Q10_4;
import todayToMe.view.Q10_5;
import todayToMe.view.Q10_6;
import todayToMe.view.Q10_7;
import todayToMe.view.Q11;
import todayToMe.view.Q2;
import todayToMe.view.Q9;
import todayToMe.view.ResultCheck;
import todayToMe.view.TtmMainview;

public class TtmRun extends JFrame{
	//메인 Run
	private static JFrame parent;
	public static void main(String[] args) {
		new TtmMainview(540, 960, "Main").setVisible(true);
		
		
	}

}
