package kh.java.collection.set;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class HashSetTest {
/**
 * Collection - Set - HashSet     인터페이스
 * 중복을 허용하지 않는다. 저장된 순서를 보장하지 않는다.
 * 
 * LinkedHashSet :  중복을 허용하지 않는다. 저장된 순서 유지
 * TreeSet :  중복을 허용하지 않는다. 오름차순 정렬 지원
 * 
 */
	
	public static void main(String[] args) {
		
		HashSetTest h = new HashSetTest();
//		h.test1(); //인덱스로 할 수 있는 것만 빠졌다.
//		h.test2();
//		h.test3();
//		h.test4();
		h.test5();
	}
	/**
	 * @실습문제
	 * 로또 숫자 출력하기
	 * 1~45 사이의 중복 없는 난수를 오름차순 정렬해서 출력하세요.
	 * 최소 6번이고 중복된 숫자가 나올 경우 6번이상 반복해야할 수도 있다.
	 */
	public void test5() {
		
		Set<Integer> roto = new TreeSet<Integer>();
		
		while(roto.size() < 6) {
			roto.add((int)(Math.random()*45)+1);
		}
		System.out.println(roto);
	}
	/**
	 * LinkedHashSet
	 * TreeSet
	 */
	public void test4() {
		Set<Integer> set1 = new LinkedHashSet<Integer>();
		set1.add(34);
		set1.add(101);
		set1.add(25);
		set1.add(1);
		System.out.println(set1);
		
		//오름 차순 정렬
		Set<Integer> set2 = new TreeSet<Integer>(set1);
		System.out.println(set2);
	}
	
	
	/**
	 * 커스텀 클래스 중복처리
	 */
	public void test3() {
		Set<Person> set = new HashSet<>();
		set.add(new Person("홍길동"));
		set.add(new Person("신사임당"));
		
		set.add(new Person("홍길동")); //위의 홍길동 객체와 이 홍길동 객체의 hashCode가 다르다.
		
		System.out.println(set);
	}
	
	/**
	 * List -> Set : 중복제거
	 * 
	 * Set -> List : 순서필요(정렬)
	 */
	private void test2() {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(3);
		list.add(2);
		list.add(1);
		list.add(2);
		System.out.println(list);
		
		//set변환
		Set<Integer> set = new HashSet<>(list);
		System.out.println(set);
		
		//list변환 : 내림차순 정렬
		list = new ArrayList<Integer>(set);
//		1)list.sort(Collections.reverseOrder());
		//2)
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list);
	}


	private void test1() {
		HashSet<Integer> set1 = new HashSet();
		Set<String> set2 = new HashSet<String>();
		Collection<Double> set3 = new HashSet<>();
		
		set2.add("안녕");
//		set2.add(123); //제네릭 덕분에 다른 타입의 요소는 추가 불가능하다.
		set2.add("Hello world");
		set2.add("ㅋㅋㅋ");
		set2.add("ㅋㅋㅋ");
		
		//저장된 요소 개수 확인
		System.out.println(set2.size());
		
		//인덱스통한 요소가져오기는 지원하지 않는다.
//		set2.get(2)
		
		//반복문을 통한 전체 열람만 가능
		//일반 for문은 사용할 수 없다
		//1.forEach문 가능
		for(String s : set2)
			System.out.println(s);
		
		System.out.println("---------");
		//2. iterator객체
		Iterator<String> iter = set2.iterator();
		while(iter.hasNext()) {
			String s = iter.next();
			System.out.println(s);
		}
		
		//삭제 : 동등한 객체를 찾아 삭제( equals & Hashcode 오버라이딩 필수)
		set2.remove("ㅋㅋㅋ");
		//전체삭제
		set2.clear();
		//비어있는지 검사
		System.out.println(set2.isEmpty());
		
		System.out.println(set2);
		
				
	}

}
