package todayToMe.run;

import todayToMe.model.vo.Ttm;
import todayToMe.view.Q1;
import todayToMe.view.Q2;
import todayToMe.view.TtmMainview;

public class TtmRun {
	//메인 Run
	public static void main(String[] args) {
//		new TtmMainview(540, 960, "Main").setVisible(true);
//		new Q1(540, 960, "Q1").setVisible(true);
		new Q2(540, 960, "Q2").setVisible(true);
	}

}
