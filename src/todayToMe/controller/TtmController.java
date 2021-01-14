package todayToMe.controller;

import todayToMe.io.TtmIO;

public class TtmController {

	//입력출력클래스 필드로 선언
	private TtmIO ttmIO = new TtmIO();
	
	public void insertPoint(int num) {
		ttmIO.insertPoint(num);
	}
	public int loadPoint() {
		return ttmIO.loadPoint();
	}

}
