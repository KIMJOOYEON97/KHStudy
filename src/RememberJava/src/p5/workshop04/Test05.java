package p5.workshop04;

import java.util.Scanner;

public class Test05 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1~5까지의 정수형 데이터를 입력하세요 : ");
		int num = sc.nextInt();
		
		int sum = 0;
		
		StringBuffer result = new StringBuffer();
		for(int i =num;i<=10;i++) {
			if(!(i % 3 == 0 || i %5 ==0)) {
				result.append(i+"+");
				sum += i;
				
			}
		}
		System.out.println(result.substring(0, result.length()-1));
		System.out.println("결과 : "+sum);
	}
}
