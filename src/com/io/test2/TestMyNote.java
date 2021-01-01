package com.io.test2;

import java.util.Scanner;

public class TestMyNote {
	
	public static void main(String[] args) {
		
		TestMyNote tmn = new TestMyNote();
		
		tmn.menu();
	}
	public static void menu() {
		
		//내용 수정할려면 매번 새로 만들어지면 안되므로
		MyNote mn = new MyNote();
		

		//아래 내용이 콘솔에 출력되게 함
		while(true) {
			System.out.print("	******   MyNote  *******\n" + 
					"\r\n" + 
					"	1. 노트 새로 만들기		\n" + 
					"	2. 노트 열기			\n" + 
					"	3. 노트 열어서 수정하기		\n" + 
					"	4. 끝내기				\n" + 
					"\r\n" + 
					"	메뉴 선택 : 번호입력 >");
			//키보드 입력용 객체 생성함
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			//MyNote 클래스 객체 생성함
			
			if(choice == 1) mn.fileSave();
			else if(choice == 2) mn.fileOpen();
			else if(choice == 3) mn.fileAppend();
			else if(choice == 4) return;
			else System.out.println("잘못입력하였습니다");
//			switch(choice) {
//			case 1: mn.fileSave();continue;
//			case 2: mn.fileOpen();continue;
//			case 3: mn.fileAppend();continue;
//			case 4: return;
//				
//			}
			
		}
	}

}
