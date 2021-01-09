package javaTest3_KIMJOOYEON.calc6;

import java.util.Scanner;

public class ExceptionTest {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("2부터 5까지의 정수를 입력하세요:");
		try {
			double result = new Calculator().getSum(sc.nextInt());
			System.out.println(result);
		} catch (InvalidException e) {
			System.out.println(e.getMessage());
		}
	}

}
