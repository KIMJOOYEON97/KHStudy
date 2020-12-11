package com.kh.test.condition;

import java.util.Scanner;

/**
 * 
 * 수도세를 구하는 프로그램을 작성하세요. 
사용자에게 사용용도와 물사용량을 입력받고, 이에따른 수도세를 계산해 출력하세요.(switch문 사용할 것.)
* 사용요금: 용도별 가격(1liter)  * 사용량
* 수도세: 사용요금의 5%
* 총사용요금: 사용요금 + 수도세
* 사용용도메뉴에서 1,2,3번이외를 선택시에는 "메뉴번호는 1,2,3만 가능합니다."를 출력하고, 프로그램을 종료할 수 합니다.
사용자입력예시)
        ----------menu----------
        1. 가정용 (50원/liter)
        2. 상업용 (45원/liter)
        3. 공업용 (30원/liter)
        -------------------------
        메뉴번호를 선택하세요. ==> 2
        물 사용량을 입력하세요. ==> 250
출력예시)
        ----------<<수도세>>-----------
        선택메뉴번호 :  2. 상업용(업소에서 사용하실 경우)를 선택하셨습니다. 
        사용요금 : 11250
        수도세 : 562
        총수도요금 : 11812원

 *
 */
public class SwitchTest1 {
	
	public static void main(String[] args) {
		SwitchTest1 t1= new SwitchTest1();
		t1.test();
	}
	
	public void test() {
		SwitchTest1.menu();
		
		Scanner sc = new Scanner(System.in);
		int menuNum = sc.nextInt();
		
		//물의 용도와 가격을 담는 변수
		String use = "";
		String comment ="";
		int price = 0;
		
		switch(menuNum) {
			case 1: use = "가정"; price = 50; comment = "(집에서 사용하실 경우)";
				break;
			case 2: use = "상업"; price = 45; comment = "(업소에서 사용하실 경우)";
				break;
			case 3: use = "공업"; price = 30; comment = "(공장에서 사용하실 경우)";
				break;
			default: System.out.println("메뉴번호는 1,2,3만 가능합니다.프로그램을 종료합니다.");
		}
		
		System.out.print("물 사용량을 입력하세요. : ");
		int water = sc.nextInt();
		//총사용요금
		int total =price*water;
		//수도세
		int waterP=(int)(total*0.05);
		
		//결과 출력
		System.out.println("----------<<수도세>>-----------");
		System.out.printf("선택메뉴번호 :  %d. %s용(%s에서 사용하실 경우)를 선택하셨습니다.\n",menuNum,use,use);
		System.out.printf("사용요금 : %d원\n",total);
		System.out.printf("수도세 : %d\n",waterP);
		System.out.printf(" 총수도요금 : %d원",total+(waterP));
	}
	/**
	 * static 메소드를 호출하는 방법: 객체를 만들지 않고, `클래스명.메소드명()`
	 */
	public static void menu() {
		System.out.println("---------menu----------");
		System.out.println(" 1. 가정용 (50원/liter)");
		System.out.println(" 2. 상업용 (45원/liter)");
		System.out.println(" 3. 공업용 (30원/liter)");
		System.out.println("-------------------------");
		System.out.print("메뉴번호를 선택하세요. >");
	}

}
