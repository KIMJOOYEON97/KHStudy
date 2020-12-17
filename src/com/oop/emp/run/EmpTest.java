package com.oop.emp.run;

import java.util.Scanner;

import com.oop.emp.model.Employee;

public class EmpTest {
	public static void main(String[] args) {
		
		//while문 안에 들어가면 데이터가 날아감. 반드시 while문 밖으로.
		Employee e = new Employee();
		while(true) {
			
			
			System.out.print(
					"******* 사원 정보 관리 프로그램 ************\n" + 
							"    1. 새 사원 정보 입력 \n" + 
							"    2. 사원 정보 삭제 \n" + 
							"    3. 사원정보 출력 \n" + 
							"    9. 끝내기 \n" + 
							"********************************************\n"+"메뉴선택 >");
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			
			//switch문은 왜인지는 모르겠지만 문장이 끝나고 나서 sysout을 출력하지 않아서  각각 case문 안에 넣었다.
			System.out.println("-----------------------------");
			switch(choice) {
			case 1:
				e.empInput();
				System.out.println();
				continue;
			case 2:
				e = null;
				System.out.println();
				continue;
			case 3:
				e.empOutput();
				System.out.println();
				continue;
			case 9:
				System.out.println("프로그램 종료");
				System.exit(0);;
			default:
				System.out.println("잘못입력하셨습니다.");	
				System.out.println();
				
			}
			
		}
		
	}
	

}
