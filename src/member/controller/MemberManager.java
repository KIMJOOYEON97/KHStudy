package member.controller;

import member.model.vo.Gold;
import member.model.vo.Member;
import member.model.vo.Silver;
import member.model.vo.VVip;
import member.model.vo.Vip;

public class MemberManager {
	Member[] arrM = new Member[40];
	
	private int index = 0;
	
	//Silver s객체를 생성 매개변수로 받아서 arrM에 넣는다.
	public void Insert(Member m) {
		arrM[index++] = m;
	}
	
	public void printData() {
		System.out.println("----------------------------------------<<회원정보>>-----------------------------------------");
		System.out.printf("%-15s %-15s %-15s %-15s\n", "이름","등급","포인트","이자포인트");
		System.out.println("------------------------------------------------------------------------------------------------");
		//이렇게 해도 Silver Gold Vip VVip 순으로 나옴 왜냐하면 index 순서로 나오니까.
		for(int i=0; i<index;i++) {
			if(arrM[i] instanceof Gold) {
				System.out.printf("%-15s %-15s %-15d %-15.2f\n", arrM[i].getName(), arrM[i].getGrade(), arrM[i].getPoint(), arrM[i].Interest());							
			}
			else if(arrM[i] instanceof Vip) {
				System.out.printf("%-15s %-15s %-15d %-15.2f\n", arrM[i].getName(), arrM[i].getGrade(), arrM[i].getPoint(), arrM[i].Interest());							
			}
			else if(arrM[i] instanceof Silver) {
				System.out.printf("%-15s %-15s %-15d %-15.2f\n", arrM[i].getName(), arrM[i].getGrade(), arrM[i].getPoint(), arrM[i].Interest());							
			}
			else if(arrM[i] instanceof VVip) {
				System.out.printf("%-15s %-15s %-15d %-15.2f\n", arrM[i].getName(), arrM[i].getGrade(), arrM[i].getPoint(), arrM[i].Interest());							
			}
		}
		
	}
}
