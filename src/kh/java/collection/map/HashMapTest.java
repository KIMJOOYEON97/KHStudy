package kh.java.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import kh.java.collection.set.Person;

/**
 * 
 * Map
 * key, value 한쌍으로 요소를 구성한다.
 * key를 통해서 value를 접근해 사용.
 * key는 중복을 허용하지 않는다. value는 중복되어도 좋다.
 *
 *
 * 동일한 key로 추가 저장하면, 나중 value로 치환된다.
 */
public class HashMapTest {

	public static void main(String[] args) {
		HashMapTest h = new HashMapTest();
		h.test1();
		h.test2();
	}
/**
 * 전체 요소 열람하기 ->map은 직접적으로 연속으로 열람 불가
 * 1. key값을 set에 담기
 * 2. key,value한쌍을 set에 담기
 */
	
	private void test2() {
		Map<String, Person> map = new HashMap<String, Person>();
		map.put("honggd", new Person("홍길동"));
		map.put("sinsa", new Person("신사임당"));
		map.put("sejong", new Person("세종대왕"));
		map.put("jsy", new Person("장영실"));
		
		//1.keySet : key집합
		Set<String> keySet = map.keySet();
		//keySet + iterator
		Iterator<String> iter = keySet.iterator();
		while(iter.hasNext()) {
			String key = iter.next();
			Person value = map.get(key);
			System.out.printf("key = %s, value = %s%n",key,value);
		}
		
		//keySet + forEach
		for(String key : keySet) {
			Person value = map.get(key);
			System.out.printf("key = %s, value = %s%n",key,value);
		}
		
		System.out.println("------------------------------");
		//2. Map.Entry(key,value한쌍) Set
		Set<Entry<String, Person>> entrySet = map.entrySet();
		//entrySet + forEach
		for(Entry<String, Person> entry : entrySet) {
			String key = entry.getKey();
			Person value = entry.getValue();
			System.out.printf("key = %s, value = %s%n",key,value);
		}
		//entrySet +iterator
		Iterator<Entry<String,Person>> iter1 = entrySet.iterator(); 
		//리턴타입은 Iterator고 요소가 Entry =><Entry<String,Person>> 하나의 요소로 봄
		
		while(iter1.hasNext()) {
			Entry<String,Person> entry = iter1.next();
			String key = entry.getKey();
			Person value = entry.getValue();
			System.out.printf("key = %s, value = %s%n",key,value);
		}
		
	}
	

	private void test1() {
		// <K, V> 두개의 제네릭을 사용
		//key로 Integer만 허용
		//value로 String만 허용
		HashMap<Integer, String> map1 = new HashMap<Integer,String>();
		Map<Character,Person> map2 = new HashMap<>();
	
		//요소 추가
		map1.put(1, "홍길동");
		map1.put(2, "신사임당");
		map1.put(3, "세종대왕");
		
		//요소 가져오기
		String s1 = map1.get(1); //get(key); 1=>new Integer 1임
		System.out.println(s1);
		
		//동일한 키값으로 추가
		map1.put(2, "장영실"); //value는 뒤늦게 작성한 값으로 바뀐다.
		
		//map2에 요소추가
		map2.put('a', new Person("Aida"));
		map2.put('b', new Person("Bob"));
		map2.put('c', new Person("Clain"));
		map2.put('d', new Person("David"));
		
		//equals&hashCode overriding을 전제로 한다.
		//특정key가 존재하는가?
		System.out.println(map2.containsKey('b')); //char가 아니라 -> new Character('b')이다
		System.out.println(map2.containsKey('x')); //char가 아니라 -> new Character('b')이다
		
		//특정 value가 존재하는가?
		System.out.println(map2.containsValue(new Person("David"))); 
		//필드값이 동일하다면 동일한 값으로 만들기로 오버라이딩 해놓았기 때문에
		
		
		Person p1 = map2.get('b');
		System.out.println(p1 +" "+p1.hashCode());
		map2.put('b',new Person("Bill"));
		Person p2 = map2.get('b');
		System.out.println(p2 +" "+p2.hashCode());
		
		
		System.out.println(map1);
	
		
	}

}
