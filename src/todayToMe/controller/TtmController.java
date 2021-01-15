package todayToMe.controller;

import java.util.List;

import todayToMe.io.TtmIO;

public class TtmController {

	//입력출력클래스 필드로 선언
	private TtmIO ttmIO = new TtmIO();
	
	public void insertName(String name) {
		ttmIO.insertName(name);
	}

	public List<String> loadName() {
		return ttmIO.loadName();
	}

}
