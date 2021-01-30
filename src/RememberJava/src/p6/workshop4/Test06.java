package p6.workshop4;

import java.util.Random;
import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.print("정수형 데이터를 입력하세요 :");
		int num1 = sc.nextInt();
		System.out.print("정수형 데이터를 입력하세요 :");
		int num2 = sc.nextInt();
		
		if((num1 >= 1 && num1 <= 5)&&(num2 >=1 && num2 <=5)) {
			
			int array[][]= new int[num1][num2];
			int sum = 0;
			int number = 0;
			
			for(int i =0; i<array.length; i++) {
				for(int j = 0;j <array[i].length; j++) {
					Random rnd = new Random();
					array[i][j] = rnd.nextInt(5)+1;
					sum += array[i][j];
					System.out.print(array[i][j]+" ");
					number++;
				}
				System.out.println();
			}
			double avg = sum/number;
			
			System.out.println("sum = "+sum);
			System.out.println("avg = "+avg);
			
		}
		else
			System.out.println("숫자를 확인 하세요");
		
	}
}
