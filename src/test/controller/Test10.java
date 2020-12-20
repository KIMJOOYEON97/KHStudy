package test.controller;

import java.util.ArrayList;

public class Test10 {
	
	public static void main(String[] args) {
		
		int[][] array = {{12,41,36,56},{82,10,12,61},{14,16,18,78},{45,26,72,23}};
		int[] copyAr =new int[array.length*array[0].length];
	
		//배열에 값을 넣는다
		for(int i = 0; i <array.length;i++) {
			for(int j = 0; j <array[i].length; j++) {
				//2차원 배열의 원소를 1차원 배열의 원소로 이동
				/*
				 * i= 0 | j= 0~3
				 * 0*4 + 0 =0
				 * 0*4 + 1 =1
				 * 0*4 + 2 =3
				 * 0*4 + 3 =4
				 * i= 1 | j= 0~3
				 * 1*4 + 0 =4
				 * 1*4 + 1 =5
				 * 1*4 + 2 =6
				 * 1*4 + 3 =7
				 * ...
				 * i =3 | j= 0~3
				 * 3*4 + 0 =12
				 * 3*4 + 1 =13
				 * 3*4 + 2 =14
				 * 3*4 + 3 =15
				 */ 
				//3의 배수만 넣기
				if(array[i][j]%3 ==0) {
					copyAr[(i*array[i].length)+j] =array[i][j];		
				}
			}
		}
		
		
		int repeat= 0;
		//배열의 중복되는 값을 찾기  ArrayList로 중복되는 값 제거하기
		
//		ArrayList<Integer> arr = new ArrayList();
//		
//		for( int num: copyAr ) {
//			if(!arr.contains(num)&&num!=0)
//				arr.add(num);
//		}
//		
		System.out.print("copyAr : ");
//		System.out.println(arr);
		
		//중복되는 값을 찾기 for문을 사용해서
		
		
//for로 중복값 제거하는 방법은 도저히 모르겠다.		
		for(int i = 0; i <copyAr.length;i++) {
			if ( copyAr[i] != 0){
				repeat = copyAr[i];
//				System.out.println(copyAr[i]+" "+copyAr[j]);
				System.out.print(copyAr[i]+" "); //중복되는 값은 12
				continue;
				
			}
	
		}
		

	}
}
