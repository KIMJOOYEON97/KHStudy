package com.oop.method.nonstatic;

import java.util.Scanner;

public class NonStaticRun {
	public static void main(String[] args) {
		NonStaticSample n = new NonStaticSample();
		
		//1.
		n.printLottoNumbers();
		System.out.println();
		
		
		//2.
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나를 입력하세요 :");
		int num = sc.nextInt();
		System.out.print("문자 하나를 입력하세요 :");
		char ch = sc.next().charAt(0);
		NonStaticSample.outputChar(num, ch);
		
		//3.
		char ch1 = n.alphabet();
		System.out.println("알파벳:"+ch1);
		
		//4.
		System.out.print("문자열을 입력하세요 :");
		sc.nextLine();
		String user = sc.nextLine();
		System.out.print("시작인덱스를 입력하세요 :");
		int x = sc.nextInt();
		System.out.print("끝나는 인덱스를 입력하세요 :");
		int y = sc.nextInt();
		String result = n.mySubstring(user, x, y);
		System.out.println(result);
	}
	

}
