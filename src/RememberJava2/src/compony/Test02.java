package compony;

import java.util.Scanner;

public class Test02 {
	
	
	public static void main(String[] args) {
		Compony c= new Compony();
		System.out.print("월급을 입력하세요 :");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		c.setSalary(input);
		System.out.print("연 기본급 합:"+c.getAnnualIncome()+" ");
		System.out.print("세후:"+c.getAfterTaxIncome()+"\n");
		System.out.print("연 보너스 합:"+c.getBonus()+" ");
		System.out.print("세후:"+c.getAfterTaxBonus()+"\n");
		System.out.print("연 지급액 합:"+(c.getAfterTaxBonus()+c.getAfterTaxIncome()));
	}

}
