package com.kh.test.dimentional.array.test;

import java.util.Random;

public class Sample {
	
	public static void main(String[] args) {
		Sample s = new Sample();
		s.exercise1();
	}
	
	public void exercise1() {
		
		//1. 3행짜리5열 2차원배열 선언 및 생성
		int[][] arr = new int[3][5];
		Random rnd = new Random();
		
		
		outer1:
		for(int i = 0 ; i <arr.length;i++) {
			inner1:
			for(int j = 0; j <arr[i].length;j++) {
				//2. 1~100사이의 임의의 정수를 모든 방에 기록함
				int num = rnd.nextInt(100)+1;
				arr[i][j]= num;
//				확인용
//				System.out.print(arr[i][j]+" ");
			}
//			확인용
//			System.out.println();
		}
//		확인용 
//		System.out.println("==========================");
		//3. 각 행별 열의 합계가 5의 배수인 행열값만 출력함
		outer2:
		for(int i = 0 ; i <arr.length;i++) {
			int sum = 0;
			inner2:
			for(int j = 0; j <arr[i].length;j++) {
				sum += arr[i][j];
				}
			if(sum%5 ==0) {
				//얕은 복사로 같은 배열 공유 =>안해도 작동 한다.
//				int[][] arr2 = arr;
//				5의 배수 출력
//				System.out.println(sum);				
				for(int i1 = 0 ; i1 <1;i1++) {
					for(int j = 0; j <arr[0].length;j++) {
						//같은 배열을 공유하는 arr2의 행열 값 출력
						System.out.print(arr[i][j]+" ");
					}
					System.out.println();
				}
					
			}
		}
	
	}
}

//[문제 1]
// - 메소드명 : public void exercise1()
// - 구현내용 : 
//    1. 3행짜리5열 2차원배열 선언 및 생성
//    2. 1~100사이의 임의의 정수를 모든 방에 기록함
//    3. 각 행별 열의 합계가 5의 배수인 행열값만 출력함