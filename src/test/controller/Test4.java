package test.controller;

import java.util.Scanner;

public class Test4 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력(1~9) : ");
		int num1 = sc.nextInt();
		System.out.print("정수입력(1~9) : ");
		int num2 = sc.nextInt();
		
		int plu = num1+num2;
		int min = num1-num2;
		int mul = num1*num2;
		int na;
		if(num2<=0) {
			na =0;
		}
		else {
			na = num1/num2;
		}
		
		System.out.println("합 : "+plu);
		System.out.println("차 : "+min);
		System.out.println("곱 : "+mul);
		System.out.println("나누기 : "+na);
	}

}
