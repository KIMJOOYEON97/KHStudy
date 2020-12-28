package member.controller;

import member.model.vo.Gold;
import member.model.vo.Member;
import member.model.vo.Silver;
import member.model.vo.VVip;
import member.model.vo.Vip;

public class MemberManager {
	Member[] arrM = new Member[40];
	
	private int index = 0; //1. 다음 member 객체의 index 2.현재까지 입력된 member수
	
	public void Insert(Member m) {
		arrM[index++] = m; //1번의 의미
	}
	
	public void printData() {
		System.out.println("----------------------------------------<<회원정보>>-----------------------------------------");
		System.out.printf("%-15s %-15s %-15s %-15s\n", "이름","등급","포인트","이자포인트");
		System.out.println("------------------------------------------------------------------------------------------------");
		//이렇게 해도 Silver Gold Vip VVip 순으로 나옴 왜냐하면 index 순서로 나오니까.
					//2번의 의미
		for(int i=0; i<index;i++) {
			if(arrM[i] instanceof Gold) {
				System.out.printf("%-15s %-15s %-15d %-15.2f\n", arrM[i].getName(), arrM[i].getGrade(), arrM[i].getPoint(), arrM[i].getEjapoint());							
			}
			else if(arrM[i] instanceof Vip) {
				System.out.printf("%-15s %-15s %-15d %-15.2f\n", arrM[i].getName(), arrM[i].getGrade(), arrM[i].getPoint(), arrM[i].getEjapoint());							
			}
			else if(arrM[i] instanceof Silver) {
				System.out.printf("%-15s %-15s %-15d %-15.2f\n", arrM[i].getName(), arrM[i].getGrade(), arrM[i].getPoint(), arrM[i].getEjapoint());							
			}
			else if(arrM[i] instanceof VVip) {
				System.out.printf("%-15s %-15s %-15d %-15.2f\n", arrM[i].getName(), arrM[i].getGrade(), arrM[i].getPoint(), arrM[i].getEjapoint());							
			}
		}
		
	}
}
