package kh.java.object.array.person;

import java.util.Scanner;

public class PersonManager {

	private Person[] arr = new Person[3];
	private Scanner sc = new Scanner(System.in);//여러매소드에서 공유 가능
	
	/**
	 * Person 정보 입력 메소드
	 */
	public void inputPerson() {
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
		
		
	}
	/**
	 * Person 정보 입력 메소드
	 */
	public void printPerson() {
		
		for(Person p : arr)
			p.printPerson();
		
	}

}
