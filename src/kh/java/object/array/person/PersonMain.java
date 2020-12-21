package kh.java.object.array.person;

import java.util.Scanner;

public class PersonMain {
	
	public static void main(String[] args) {
		PersonMain pm = new PersonMain();
//		pm.test1();
//		pm.test2();
		pm.test3();
	}
	/**
	 * @실습문제 :
	 *  사용자 입력받아서 3명의 Person정보를 배열에 담고, 출력하세요ㅛ.
	 *  (파라미터생성자를 이용해서 객체 생성할 것)
	 */
	public void test3() {
		
//		Scanner scr= new Scanner(System.in);
//		System.out.print("입력할 사람수를을 입력하세요 : ");
//		
//		int num = scr.nextInt();
//		
//		int count=0;
//		while(true) {
//			
//			Person[] arr = new Person[num] ;
//			// 1 입력
//			System.out.print("이름을 입력하세요 : ");
//			String name = scr.next();
//			
//			System.out.print("나이를 입력하세요: ");
//			int age = scr.nextInt();
//			
//			//2. 할당
//			arr[count] = new Person(name,age);
//	
//			count++;
//			
//			
//			System.out.println("계속하시겠습니까? 0 종료 /1 계속/2 출력");
//			int choice = scr.nextInt();
//			if(choice == 0) {System.out.println("종료하겠습니다");break;}
//			else if(choice == 2) {
//				//출력;
//				for(Person p:arr) {
//					p.printPerson();
//				}break;
//				}
//			else continue;
//		}
		
		//1. 입력
		Scanner sc = new Scanner(System.in);
		Person[] arr = new Person[3];
		for(int i = 0; i < arr.length; i++) {
			System.out.println("----- " + (i + 1) + " -----" );
			System.out.print("이름 : ");
			String name = sc.next();
			System.out.print("나이 : ");
			int age = sc.nextInt();
			Person p = new Person(name, age);
			arr[i] = p;
		}
		
		System.out.println("==============================");
		
		//2. 출력
		for(Person p : arr)
			p.printPerson();
		
	}
	/**
	 *  초기화 객체배열 선언
	 */
	public void test2() {
		
		Person[] arr = {
				new Person("홍길동",34)
				, new Person("신사임당",48)
				, new Person("세종대왕",67)
		};
		
		for(Person p:arr) {
//			System.out.println(p); =>주소값 나옴
			p.printPerson();
		}
	}
	

	/**
	 * Person객체를 배열로 관리
	 */
	public void test1() {
		//1. 객체 배열 선언
		Person[] arr = new Person[3];
		
		for(int i = 0; i<arr.length; i++)
			System.out.println(arr[i]);
		
		//향상된 for문 (forEach문) :index값 없이 요소에 바로 접근
		for(Person p : arr) {
			System.out.println(p);
		}
		
		//2. 객체를 각각 할당
		arr[0] = new Person("홍길동",34);
		arr[1] = new Person("신사임당",48);
		arr[2] = new Person("세종대왕",67);
		
		//3. 출력
		for(int i = 0; i < arr.length; i++) {
			Person p = arr[i]; //arr[i]번지를 꺼내면 Person객체가 나온다.
			p.printPerson();   // 주소값을 p에 박는다.
		}
		
		for(Person p:arr) {
			p.printPerson();
		}
				
	}
}
