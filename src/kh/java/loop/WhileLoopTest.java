package kh.java.loop;

import java.util.Scanner;

/**
 * 초기식
 * while(조건식){
 * 
 * 		//반복실행구문
 * 
 * 		증감식
 * }
 */
public class WhileLoopTest {
	
	public static void main(String[] args) {
		
		WhileLoopTest w = new WhileLoopTest();
//		w.test1();
//		w.test2();
//		w.test3();
//		w.test4();
//		w.test5();
//		w.test6();
//		w.test7();
		
		w.test8();
	}
	/**
	 * 메뉴 관리
	 */
	public void test8() {
		Scanner sc = new Scanner(System.in);
		String mainMenu ="==========\n"
						+"1.저장\n"
						+"2.조회\n"
						+"3.수정\n"
						+"4.삭제\n"
						+"0.프로그램 종료\n"
						+"==========\n"
						+"선택 : ";
		int choice = 0;
		do {
			System.out.print(mainMenu);
			choice = sc.nextInt();
			switch(choice) {
			case 1: save(); break;
			case 2: selectList(); break;
			case 3: update(); break;
			case 4: delete(); break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
					return;
			default : System.out.println("잘못 입력하셨습니다.");
			}			
		}while(choice !=0 );
		
	}
	
	public void save() {System.out.println("save를 선택하셨습니다");}
	public void selectList() {System.out.println("selectList를 선택하셨습니다");}
	public void update() {
		System.out.println("update를 선택하셨습니다");
		
		Scanner sc = new Scanner(System.in);
		String updateMenu ="==========\n"
						+"1.이름 수정\n"
						+"2.전화번호 수정\n"
						+"3.주소 수정\n"
						+"4.메인메뉴로 돌아가기\n"
						+"0.프로그램 종료\n"
						+"==========\n"
						+"선택 : ";
		int choice = 0;
		
		do {
			System.out.print(updateMenu);
			choice = sc.nextInt();
			switch(choice) {
			case 1: System.out.println("이름을 수정하겠습니다"); break;
			case 2: System.out.println("전화번호을 수정하겠습니다"); break;
			case 3: System.out.println("주소를 수정하겠습니다"); break;
			case 4: return;
			default : System.out.println("잘못 입력하셨습니다.");
			}
		}while(choice != 0);
	}
	public void delete() {System.out.println("delete를 선택하셨습니다");}
	
	/**
	 * @실습문제:
	 *  사용자에게 2~9사이의 단수를 입력받고,
	 *  해당 단수의 구구단을 출력하세요
	 *  계속할지 여부를 물어보고 반복실행하세요
	 *  단, 2 ~ 9 사이의 수가 아니라면 잘못 입력하셨습니다~ 출력할 것.
	 */
	public void test7() {
		char yn ='y';
		
		do {
			//1. 단수 입력
			Scanner sc = new Scanner(System.in);
			System.out.print("단수를 입력하세요 >");
			int dan = sc.nextInt();
			//2. 유효성 검사
			if(dan>=2&&dan<=9) {
				//3. 구구단 출력
				int i = 1;
				while(i<10) {
					System.out.println(dan+"*"+i+"="+dan*i);
				}
			}
			else {
				System.out.println("잘못 입력하셨습니다.");
			}
			//4. 계속 실행여부 입력
			System.out.print("계속하시겠습니까? y/n : ");
			yn = sc.next().charAt(0);
			
		}while(yn=='y');
		System.out.println("프로그램 종료");
	}
	
	
	public void test6() {
		Scanner sc = new Scanner(System.in);
		String menu ="===============\n"
					+"1.참치김밥 --- 2500원\n"
					+"2.멸치김밥 --- 3500원\n"
					+"3.김치김밥 --- 2000원\n"
					+"---------------\n"
					+"선택 : ";
		char yn = 'y';
		int sum = 0;
		//사용자에 의해 반복횟수가 결정된다.
		do {
			System.out.print(menu);
			int num = sc.nextInt();
			System.out.println(num +"을 선택하셨습니다.");
			
			//금액 누적합계 구하기
			switch(num) {
				case 1 : sum += 2500; break;
				case 2 : sum += 3500; break;
				case 3 : sum += 2000; break;
				default: System.out.println("잘못 입력하셨습니다.");
			}
			
			System.out.print("추가 주문 하시겠습니까?(y/n) : ");
			yn = sc.next().charAt(0);
			
		}while(yn =='y');
		
		System.out.println("결제할 금액은 [" +sum +"]원 입니다.");
		
		System.out.println("주문완료!");
	}
	
	public void test5() {
		
		Scanner sc = new Scanner(System.in);
		char yn =' '; //do while문에서 while 조건문은 do의 블록에 접근 불가함으로 
					 //변수 선언을 바깥에 해야한다.
		int i = 0;
		
		
		do{
			System.out.println("계임 시작!");
			//게임중///
			System.out.println("게임 끝!");
			
			System.out.println("한판 더 하시게습니까? (y/n) : ");
			yn = sc.next().charAt(0);
			
		}while (yn == 'y');
		
		System.out.println("게임 종료");
	}
	
	/**
	 * @실습문제 : 사용자에게 양수하나를 입력받고.
	 * 1부터 입력한 수 사이의 3의 배수 개수를 출력하세요
	 */
	public void test4() {
		
		Scanner sc =new Scanner(System.in);
		System.out.print("양수 하나를 입력하세요 : ");
		final int NUM  = sc.nextInt();
		int i = 1;
		int sum = 0;
		
		while(i <= NUM) {
			System.out.print(i+" ");
			i++;
			if(i%3==0) {
				sum++;
			}
		}
		System.out.println();
		System.out.println("1부터 입력한 "+NUM+"사이의 3의 배수 개수는"+sum+"개");
	}
	public void test3() {
		final int DAN =8;
		int n=1;
		while(n<=9) {
			System.out.println(DAN+"*"+n+"="+DAN*n);
			n++;
		}
	}
	
	public void test2() {
		//1 2 3 4 5 6 7 8 9 10 
		int i = 0;
		while(i<10) {
			i++;
			System.out.print(i+ " ");
		}
		System.out.println();
		
		//1 3 5 7 9 11 13 15 17 19 
		int n = 1;
		while(n<20) {
			System.out.print(n+" ");
			n += 2;
		}
		System.out.println();
		
		//2 4 6 8 10 12 14 16 18 20 
		int t = 0;
		while(t<20) {
			t++;
			if(t%2==0) {
				System.out.print(t+" ");
			}
		}
		System.out.println();
		
		//10 9 8 7 6 5 4 3 2 1 
		int x =10;
		while(x<=10&&x>=1) {
			System.out.print(x+" ");
			x--;
		}
		System.out.println();
		
		//20 18 16 14 12 10 8 6 4 2 
		int y = 20;
		while(y<=20&&y>=2) {
			System.out.print(y+" ");
			y -= 2;
		}
		System.out.println("\n" +y); //=>마지막에 탈출해서 담기는 값이 0
		
		for(;i<=10;i++) {
			System.out.print(i + " ");
		}
		
//		while(true) {
//			System.out.println("HI");
//			//반복문 중지코드 break
//		}
		
		for(;;) {
			System.out.println("HI");
			//반복문 중지 코드 break
			if(i ==100) {
				break;
			}
		}
		
	}
	public void test1() {
//		for(int i = 0; i <10; i++) {
//			System.out.println("Hello World~");
//		}
		
		int i = 0;
		while(i < 10) {
			i++;
			System.out.println("Hello World "+ i);
		}
	}

}
