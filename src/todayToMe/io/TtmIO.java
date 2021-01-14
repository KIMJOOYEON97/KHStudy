package todayToMe.io;

import todayToMe.model.vo.Ttm;

public class TtmIO {

	int[] point = new int[8];
	//점수를 넘겨 받음.
	public void insertPoint(int num) {
		for(int i = 0; i <point.length; i++) {
			point[i] = num;
		}
		
	}

	//총 점수를 넘겨줌
	public int loadPoint() {
		// TODO Auto-generated method stub
		return 0;
	}

}
