package kh.java.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {
	
	public static void main(String[] args) {
		ArrayListTest a = new ArrayListTest();
//		a.test0();
//		a.test1();
//		a.test2();
//		a.test3();
//		a.test4();
//		a.test5();
		a.test6();
	}
	/**
	 * 커스텀 클래스  정렬하기
	 */	
	private void test6() {
		List<Student> list = new ArrayList<>();
		
		list.add(new Student(2,"신사임당"));
		list.add(new Student(4,"장영실"));
		list.add(new Student(5,"이황"));
		list.add(new Student(1,"홍길동"));
		list.add(new Student(3,"세종대왕"));
		
		//기본정렬 : 학번오름차순
//		Collections.sort(list); // 오류가 나는 이유는 Student가 Comparable을 갖추고 있지 않음
		list.sort(null); //기본정렬인 경우 Comparator객체가 필요치 않다.
		
		//학번 내림차순
//		Collections.sort(list, Collections.reverseOrder());
		
		
		//추가적인 정렬기준 생성
		//1. 이름오름차순
//		Comparator<Student> comp = new StudentNameAscending();
//		Collections.sort(list, comp);
		
		//2. 이름내림차순
//		Comparator<Student> comp = new StudentNameAscending();
//		Collections.sort(list, comp.reversed());
		
		System.out.println(list);
	}
	/**
	 * 정렬
	 * 1. Comparable 인터페이스 : 
	 * 		기본정렬(한가지) 클래스에서 구현. compareTo메소드 오버라이딩
	 * 2. Comparator 인터페이스 : 
	 * 		기본정렬외에 추가적으로 정렬기준을 제시해야 할때.
	 *  	별도의 Comparator 구현클래스를 작성(개수 제한 없음)
	 *  	compare메소드 오버라이딩
	 * 	
	 * 
	 */
	
	private void test5() {
		List<String> list = new ArrayList<>(); //List로만 정렬기능이 구현가능함
		list.add("가버려");
		list.add("다나가");
		list.add("허허허");
		list.add("나나나~");
		
		//정렬메소드호출			
//		Collections.sort(list);// 기본정렬기준(사전등재순)에 따라 정렬
		
		//사전등재역순
		Comparator<String> comp = Collections.reverseOrder();
		Collections.sort(list,comp);
		
		System.out.println(list); //toString이 잘 되어있다.
	}


	private void test4() {
		//객체 할당부의 재네릭 타입은 생략 가능(jdk1.7이상)
		List<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(2);
		list.add(3);
		list.add(1);
		list.add(4);
		list.add(1,100); //1번지에 100요소 추가
		
		
		System.out.println(list); //[5, 100, 2, 3, 1, 4] => 배열같아보이지만 배열이 아니다.
		
		
		//삭제메소드
		//1.index로 삭제
//		list.remove(3);
		System.out.println(list); //[5, 100, 2, 1, 4] => 배열같아보이지만 배열이 아니다.
		
		//2.동등객체로 삭제 : 객체가 가진 값이 동일한 객체 (equals가 동일한 객체)
		list.remove(new Integer(100)); //Integer는 이미 다 구현되어있다.
		
		
		//수정 : 해당인덱스의 객체를 제공된 매개인자로 대체
		list.set(1, 888);

		//다른 Collection객체 추가
		List<Integer> another = new ArrayList<>();
		another.add(7);
		another.add(8);
		another.add(9);
		list.addAll(another);
		
		//매개인자 요소를 포함하고 있는가(동등객체)
		System.out.println(list.contains(9));
		
		//매개인자 요소가 몇번지에 있는가 : int
		System.out.println(list.indexOf(9));
		System.out.println(list.indexOf(900));
		
		
		//열람 : 기존 for문, forEach문, iterator방식
		Iterator<Integer> iter = list.iterator();
		while(iter.hasNext()) {
			Integer i = iter.next(); //순차적으로 결과를 확인할 수 있다.
			System.out.println(i);
		}
		
		//모든 요소 삭제
		list.clear();
		
		//리스트가 비어있는가?
		System.out.println(list.isEmpty());
		
		
		System.out.println(list); //[5, 2, 3, 1, 4]
		
		
		
	}
	/**
	 * test0
	 */
	private void test3() {
		List<Student> list = new ArrayList<Student>();
		
		list.add(new Student(1,"홍길동"));
		list.add(new Student(2,"신사임당"));
		list.add(new Student(3,"세종대왕"));
		list.add(new Student(4,"장영실"));
		list.add(new Student(5,"이황"));
		
		//2.중간의 학생1명 삭제

//		list.remove(2);
		//객체를 전달해 삭제하려면 , 전달한 객체와 저장된 객체의 동등성을 인정받아야 한다.
		//두 객체의 equals 비교 결과가 true가 나오도록 equals 오버라이딩해야한다.
		System.out.println(new Student(3,"세종대왕").equals(new Student(3,"세종대왕")));
		System.out.println(list.remove(new Student(3,"세종대왕")));
		
		System.out.println(new Student(3,"세종대왕").hashCode());
		System.out.println(new Student(3,"세종대왕").hashCode());
		
		list.remove(new Student(3,"세종대왕"));
		
		
		//3. 중간에 학생1명 추가 : new Student(6,"뺑덕어멈");
		list.add(0,new Student(6,"뺑덕어멈"));
		
		
//		System.out.println(list);		
		
		for (Student s : list) {
			System.out.println(s);
		}
	}
	/**
	 * Generics 타입제한
	 * 
	 * 기본형을 사용할 수 없다. => Wrapper Class 사용
	 * int -> Integer
	 * double -> Double
	 */
	
	private void test2() {
		List list1 = new ArrayList();
		list1.add("안녕");
		list1.add(123);
		Object e1 = list1.get(0); //기본적으로 요소는 Object타입이다.
		//모든 객체는 object에 담을 수 있고 
		Object e2 = list1.get(1); //리턴 타입 Objcet
//		System.out.println(((String)e1).length()); =>이렇게 쓰면 안된다.
		
		//다형성 적용
		//<String> 타입변수 지정 : 요소의 타입 제한 ->꺼내면 String이라는 것을 보장한다
		List<String> list2 = new ArrayList<String>();
		list2.add("안녕");
//		list2.add(123); //String이 아닌 요소는 추가할 수 없다.
		//the type List<String> is not applicable for the arguments (int)
		String s1 = list2.get(0); //리턴 타입 String
		System.out.println(s1.length());
		
		//Wrapper Class
		List<Integer> list3 = new ArrayList<Integer>();
		list3.add(31); // 컬렉션의 요소로 기본형은 요소로서 추가될 수 없다
		// 31 -> new Integer(31) : auto-boxing
		int num = list3.get(0); 
		//리턴 타입 Integer new Integer(31) -> 31 : auto-unboxing
	}
	/**
	 * java.util.List 인터페이스
	 * java.util.ArrayList 구현클래스
	 * 
	 */
	private void test1() {
		ArrayList list1 = new ArrayList();
		List list2 = new ArrayList();
		Collection list3 = new ArrayList();
		
		//맨 마지막에 요소추가 add
		list1.add("안녕");
		list1.add(123);
		list1.add(123.456);
		list1.add(true);
		list1.add(new Date());
		list1.add(new Student(1,"고주몽"));
		list1.add(123);

		//toString override되어있음
		//저장된 순서유지, 중복허용
		System.out.println(list1);
		
		//저장된 요소의 개수
		System.out.println(list1.size());
		
		//삭제 remove
		list1.remove(3);
		
		//중간에 요소추가
		list1.add(3,false);
		
		//반복문을 통해 요소에 접근 가능 : 인덱스 사용가능
		for(int i = 0 ;i<list1.size();i++) {
			System.out.println(i+" : "+list1.get(i));
		}
		
	}

	/**
	 * 배열의 문제점
	 */
	
	private void test0() {
		
		Student[] arr = new Student[3];
		arr[0] = new Student(1,"홍길동");
		arr[1] = new Student(2,"신사임당");
		arr[2] = new Student(3,"세종대왕");
		
		//1. 학생2명 추가
		Student[] arr2 = new Student[10]; // 메모리 공간 낭비
		System.arraycopy(arr, 0, arr2, 0, arr.length);
		arr2[3] = new Student(4,"장영실");
		arr2[4] = new Student(5,"이황");
		
		//2.중간의 학생1명 삭제
		//데이터는 중간의 빈자리 없이 관리해야한다.
//		arr2[2] = null;
		arr2[2] = arr2[3];
		arr2[3] = arr2[4];
		arr2[4] = null;
		
		//3. 중간에 학생1명 추가 : new Student(6,"뺑덕어멈");
		arr2[4] = arr2[3];
		arr2[3] = arr2[2];
		arr2[2] = arr2[1];
		arr2[1] = arr2[0];
		arr2[0] = new Student(6,"뺑덕어멈");
		
		System.out.println(Arrays.toString(arr2));
	}

}
