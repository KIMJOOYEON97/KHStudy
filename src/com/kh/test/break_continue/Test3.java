package com.kh.test.break_continue;

import java.util.Arrays;
import java.util.Scanner;

public class Test3 {
	
	public static void main(String[] args) {
		Test3 t3 = new Test3();
		t3.test();
		t3.test2();
	}
	
	public void test() {
		

		
		while(true){
			Scanner sc = new Scanner(System.in);
			System.out.print("2보다 큰 정수를 입력하세요.");
			final int NUM = sc.nextInt();
			
			boolean flag = true;
			
			if(NUM<=2) {
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
				continue;
			}
			if(NUM%2 == 0) {
				flag = false;
			}
			
			else {
				for(int i = 3; i<=NUM/2;i+=2) {
					if(NUM%i==0) {
						flag = false;
						break;
					}			
				}
			}
			
			if(flag) System.out.println("소수입니다.");
			else System.out.println("소수가 아닙니다.");
			break;
			}
		}
	
	
	/**
	 * 에라토스테네스의 체 적용풀이
	 * 배열의 index와 실제 값이 헷갈리므로 주의해야한다.
	 * refactoring 요망!
	 */
	public void test2(){
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		//배열에 1부터 입력값까지 모두 담아준다.
		//numArr[0] = 1
		//numArr[1] = 2
		//...
		//numArr[num-1] = num
		int[] numArr = new int[num];
		for(int i=0; i<num;i++)
			numArr[i] = i+1;
		
		System.out.println("berore="+Arrays.toString(numArr));
		
		for(int i=1; i<num; i++){
//			System.out.println("i="+i+", numArr["+i+"]="+numArr[i]);
			int temp = numArr[i];
			
			//[2] 이미 0으로 치환된 수라면 건너뛴다.
			if(numArr[i]==0) continue;
			
			//[1] 해당수의 배수를 0으로 치환함.
			for(int j=i+temp; j<numArr.length;j+=temp){
				numArr[j]=0;
			}
		}
		
		System.out.println("after="+Arrays.toString(numArr));
		
		//출력 : 0으로 치환되지 않은 모든 수는 소수이다.
		System.out.print(num+"미만의 소수 => ");
		for(int i=1; i<num; i++){
			if(numArr[i]!=0){
				System.out.print(numArr[i]+" ");
			}
		}
	}
	}
//[문제 3]
//- 클래스 : com.kh.test.break_continue.Test3.java
//- 메소드명 : public void test()
//     2보다 큰 정수를 입력 받고, 입력 받은 정수가 소수이면 “소수다“, 소수가 아니면 “소수가 아니다.” 출력하고 프로그램을 종료하는 코드를 작성하세요.
//     단, 입력 받은 정수가 2보다 작은 경우 “잘못 입력하셨습니다. 다시 입력하세요.” 출력 후 다시 정수를 입력 받도록 하세요.
//?
//    ** 소수란? : 어떠한 정수를 1부터 자기 자신까지로 나누었을 때, 나누어 떨어지는 수가 1과 자기 자신 뿐인 수를 소수라고 한다.
