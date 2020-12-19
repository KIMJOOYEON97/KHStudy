package com.oop.method.nonstatic;

import java.util.Random;

public class NonStaticSample {




//1. 반환값 없고 매개변수 없는 메소드
//실행 요청시 1~45까지의 임의의 정수 6개 중복되지 않게 발생시켜 출력하는 메소드
//메소드명 : printLottoNumbers
	public void printLottoNumbers(){
		int[] arr= new int [6];
		
		while(true) {
			
			boolean flag = true;
			//중복인지 아닌지 체크
			boolean check =true;
			
			//중복되는 숫자가 나왔을때 다시 배열을 가지게 함
			if(flag=true)
				for(int x = 0;x<6;x++) {
					// 숫자 랜덤으로 6개 배열에 집어넣음
					arr[x] = (int)(Math.random()*45+1);
				}
			
			//숫자가 중복되는지 테스트
			for(int i = 0; i<arr.length; i++) {
				for(int j = i+1; j <arr.length; j++) {
					// 중복될 경우
					if(arr[i] == arr[j]) {
//					System.out.println(arr[i]+" "+arr[j]);
						flag=true;
						check=false;
					}
				}
			}
			//중복 안 되었을 경우
			if(check&&flag) {
				for(int z= 0; z <arr.length; z++) {
					System.out.print(arr[z]+" ");
				}break;
			}
		}
	}
	
//2. 반환값 없고 매개변수 있는 메소드
//실행 요청시 정수 하나, 문자 하나를 전달받아 문자를 정수 갯수만큼 출력하는 메소드
//메소드명 : outputChar
	public static void outputChar(int num, char ch) {
		for(int i = 0; i <num; i++) {
			System.out.print(ch);
		}
		System.out.println();
	}
	


//3. 반환값 있고 매개변수 없는 메소드
//실행 요청시 알파벳 범위의 임의의 영문자를 하나 발생시켜 리턴하는 메소드
//메소드명 : alphabet
	public char alphabet() {
		while(true) {
			Random rnd = new Random();
			int alph = rnd.nextInt(122); 
			if((alph>='A'&&alph<='Z')||(alph>='a'&&alph<='z')) {
				char ch = (char)alph; 
				return ch;
			}
		}
	} 
	
//4. 반환값 있고 매개변수 있는 메소드
//실행 요청시 문자열과 시작인덱스, 끝인덱스를 전달받아 해당 인덱스 범위의 문자열을
//추출하여 리턴하는 메소드. 단 문자열은 반드시 값이 있어야함. 없으면 null 리턴처리
//메소드명 : mySubstring
	public String mySubstring(String user, int x, int y) {

		while(true) {
			if(user==null) {
				return null;
			}
			if(x>=0 && y>x) {
				return user.substring(x, y+1);
			}
			else{
				return "인덱스 입력 오류입니다.";
			}
		
		}
	
	}
	
	
}







