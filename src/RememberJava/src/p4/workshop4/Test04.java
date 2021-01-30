package p4.workshop4;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		
		Calc calc = new Calc();
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		System.out.println("결과 : "+calc.calculate(num));
	}
}
