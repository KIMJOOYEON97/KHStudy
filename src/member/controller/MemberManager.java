package member.controller;

import member.model.vo.Gold;
import member.model.vo.Member;
import member.model.vo.Silver;
import member.model.vo.VVip;
import member.model.vo.Vip;

public class MemberManager {
	Member[] arrM = new Member[40];
	
	private int index = 0;
	
	
	public void Insert(Silver s) {
		arrM[index++] = s;
	}
	
	public void Insert(Gold g) {
		arrM[index++] = g;
	}
	
	public void Insert(Vip v) {
		arrM[index++] = v;
	}
	
	public void Insert(VVip vv) {
		arrM[index++] = vv;
	}

	
	public void printData() {
		System.out.println("----------------------------------------<<회원정보>>-----------------------------------------");
		System.out.printf("%-15s %-15s %-15s %-15s\n", "이름","등급","포인트","이자포인트");
		System.out.println("------------------------------------------------------------------------------------------------");
		for(int i=0; i<index;i++) {
			System.out.printf("%-15s %-15s %-15d %-15.2f\n", arrM[i].getName(), arrM[i].getGrade(), arrM[i].getPoint(), arrM[i].Interest());			
		}
		for(int i=0; i<index;i++) {
			System.out.printf("%-15s %-15s %-15d %-15.2f\n", arrM[i].getName(), arrM[i].getGrade(), arrM[i].getPoint(), arrM[i].Interest());
		}
		for(int i=0; i<index; i++){
			System.out.printf("%-15s %-15s %-15d %-15.2f\n", arrM[i].getName(), arrM[i].getGrade(), arrM[i].getPoint(), arrM[i].Interest());
		}
		for(int i=0; i<index; i++){
			System.out.printf("%-15s %-15s %-15d %-15.2f\n", arrM[i].getName(), arrM[i].getGrade(), arrM[i].getPoint(), arrM[i].Interest());
		}
	}
}
