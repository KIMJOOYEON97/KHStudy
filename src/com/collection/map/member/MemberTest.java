package com.collection.map.member;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MemberTest {
	
	static //회원 Map은 필드로 지정하고, MemberTest 생성자에서 map에 요소 추가할 것.
	Map<String, Member> map = new HashMap<>();
	
	public static void main(String[] args) {
		MemberTest m = new MemberTest();
		m.inputInfo();
		m.printInfo(map);
		m.findId("jangbg");
		m.findId("sejong");
		m.modifyInfo("yooon");
		m.deleteM("sinsa");
//		m.printInfo(map); 확인용
	}
	
	//1. 다음 회원 정보를 Map<String, Member>에 저장후, 출력하세요
	public Map<String, Member> inputInfo() {
		map.put("honggd",new Member("1234","홍길동",35,"01012341234"));
		map.put("sinsa",new Member("1234","신사임당",50,"01012341234"));
		map.put("leess",new Member("1234","이순신",43,"01012341234"));
		map.put("yooon",new Member("1234","윤봉길",37,"01012341234"));
		map.put("jangbg",new Member("1234","장보고",29,"01012341234"));
		return map;
	}
	
	public void printInfo(Map<String, Member> map2){
		Set<String> keySet = map2.keySet();
		Iterator<String> iter = keySet.iterator();
		System.out.println("==================================================");
		System.out.println("아이디	비밀번호	 이름          나이         	전화번호");
		System.out.println("--------------------------------------------------");
		while(iter.hasNext()) {
			String key = iter.next();
			Member info = map2.get(key);
			System.out.print(key+" "+info);
		}
		System.out.println("--------------------------------------------------");
	}
	
	//2. Map에 저장된 회원중 인자로 전달한 아이디가 존재하는 여부를 검사하는 메소드를 생성하세요.
	public void findId(String id) {
		System.out.println(map.containsKey(id));
	}
	
//	3. yooon 아이디 조회후 해당객체를 다음과 같이 수정하세요.
	public void modifyInfo(String id) {
		if(map.containsKey(id)) {
			map.put(id,new Member("5678","윤동주",27,"01034563456"));
		}
		
	}
// 4. sinsa 아이디 회원을 삭제하세요.
	
	public void deleteM(String id) {
		if(map.containsKey(id)) {
			map.remove(id);
		}
	}
}
