package member.controller;


import member.model.vo.Gold;
import member.model.vo.Silver;
import member.model.vo.VVip;
import member.model.vo.Vip;

public class MemberManager {
	
	public static final int MAX_LENGTH = 10;
	
	private Silver[] arrSlv =new Silver[MAX_LENGTH];
	private Gold[] arrGl =new Gold[MAX_LENGTH];
	private Vip[] arrv =new Vip[MAX_LENGTH];
	private VVip[] arrvv =new VVip[MAX_LENGTH];
	
	private int slidx = 0;
	private int glidx = 0;
	private int vidx = 0;
	private int vvidx = 0;
	
	public void silverInsert(Silver s) {
		arrSlv[slidx++] = s;
		
	}
	
	public void goldInsert(Gold g) {
		arrGl[glidx++] = g;
	
	}
	public void vipInsert(Vip v) {
		arrv[vidx++] =v;
	}
	public void vvipInsert(VVip vv) {
		arrvv[vvidx++] = vv;
	}
	
	public void printData() {
		System.out.println(" ---------------------------<<회원정보>>--------------------------");
		System.out.println("이름\t등급\t포인트\t이자포인트");
		System.out.println("-----------------------------------------------------------------");
		if(arrSlv[0] != null) {
			for(int i = 0; i<slidx; i++) {
				Silver slv = arrSlv[i];
				System.out.printf("%s      %s     %d     %.2f%n",
						slv.getName(),slv.getGrade(),slv.getPoint(),slv.getPointInterest());
			}
			
		}	
		if(arrGl[0] != null ) {
			for(int i = 0; i<glidx; i++) {
				Gold gl = arrGl[i];
				System.out.printf("%s      %s     %d     %.2f%n",
						gl.getName(),gl.getGrade(),gl.getPoint(),gl.getPointInterest());
			}
			
		}
		if(arrv[0] != null ) {
			for(int i = 0; i<vidx; i++) {
				Vip v = arrv[i];
				System.out.printf("%s      %s     %d     %.2f%n",
						v.getName(),v.getGrade(),v.getPoint(),v.getPointInterest());
			}
			
		}
		if(arrvv[0] != null ) {
			for(int i = 0; i<vvidx; i++) {
				VVip vv = arrvv[i];
				System.out.printf("%s      %s     %d     %.2f%n",
						vv.getName(),vv.getGrade(),vv.getPoint(),vv.getPointInterest());
			}
			
		}
	}
	
}
