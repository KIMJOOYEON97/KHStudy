package member.run;

import member.controller.MemberManager;
import member.model.vo.Gold;
import member.model.vo.Silver;
import member.model.vo.VVip;
import member.model.vo.Vip;


public class Run {
	public static void main(String[] args){
		
		MemberManager m = new MemberManager();
		m.Insert(new Silver("홍길동", "Silver",1000));
		m.Insert(new Silver("김말똥", "Silver",2000));
		m.Insert(new Silver("고길동", "Silver",3000));
		m.Insert(new Gold("김회장", "Gold",1000));
		m.Insert(new Gold("이회장", "Gold",2000));
		m.Insert(new Gold("오회장", "Gold",3000));
		
		//vip추가
		m.Insert(new Vip("최순실", "Vip",10000));
		
		//vvip추가
		m.Insert(new VVip("박근혜", "VVip",100000));
		
		m.printData();
	}
}
