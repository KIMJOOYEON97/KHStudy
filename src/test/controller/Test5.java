package test.controller;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력:");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		int mul =num1*num2;
		
		if(mul<10) {
			System.out.println("한자리 수 입니다.");
		}
		else {
			System.out.println("두자리 수 입니다.");
		}
	}
}
