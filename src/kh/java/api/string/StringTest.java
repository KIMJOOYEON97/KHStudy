package kh.java.api.string;

import java.util.StringTokenizer;

public class StringTest {

	public static void main(String[] args) {
		StringTest st = new StringTest();
//		st.test1();
//		st.test2();
		st.test3();
	}
	/**
	 * CSV 데이터 처리하기
	 * Comma Seperated Value->,로 데이터가 구분되어진 값
	 * "java, oracle, html, javascript, css" ->,&공백을 구분자로 씀
	 * 
	 * 구분자는 실제 데이터에 사용되지 않는 어떠한 문자도 좋다.
	 * java/oracle/html/spring/maven  ->/가 구분자로 쓰임
	 * java§oracle§html§spring§maven§kh/java/html  ->§가 구분자로 쓰임
	 * java/oracle/html/spring/maven/kh/java/html      kh/java/html 하나의 데이터라도  전혀 다른 결과가 나옴
	 * 
	 * 1.String의 split
	 * 2.StringTokenizer
	 * 
	 */
	public void test3() {
		String data ="java§oracle§html§spring§maven§kh/java/html";
		
		//1.split
		String[] arr = data.split("§");
		for(String s: arr) {
			System.out.println("["+s+"]");
		}
		
		//2.StringTokenizer
		StringTokenizer tokenizer = new StringTokenizer(data,"§");
		while(tokenizer.hasMoreTokens()) {
			System.out.println(tokenizer.countTokens());
			String s = tokenizer.nextToken();
			System.out.println("<"+ s +">");
		}
		System.out.println(tokenizer.countTokens()); //소진해버린다
		
		
		//구분자 처리 다른점
		// 1. StringTokenizer는 빈문자열은 요소로 취급하지 않는다.
		// 2. StringTokenizer 구분자 문자열을 문자단위로 인식처리
		// 3. split도 정규표현식을 사용하면 문자단위로 처리
//		data="a,,b,,c,d";
		data="a, b,c, d";
		//정규표현식(regular expression) ->검색에 최적화된 표현식
		arr = data.split("[, ]"); //곧이곧대로 
		for(String s : arr)
			System.out.println("["+s+"]"); //빈 문자열을 하나의 요소로 처리O
		
		tokenizer = new StringTokenizer(data, ", ");
		while(tokenizer.hasMoreTokens())
			System.out.println("<"+ tokenizer.nextToken()+">"); //빈문자열을 요소로 처리X
		
		
	}
	/**
	 * StringBuilder 	mutable(변경가능) 싱글쓰레드용				-변수 하나가 변해가면서 전개
	 * StringBuffer		mutable(변경가능) 멀티쓰레드용 동기화를 지원
	 */
	public void test2() {
		StringBuilder sb = new StringBuilder("java");//초기화 문자
		System.out.println(sb.hashCode());
		sb.append("oracle");
		System.out.println(sb.hashCode());
		
		System.out.println(sb);
		print(sb.toString());//내용물만 싹 꺼내서
	}
	
	public void print(String s) {
		System.out.println(s);
		
	}
	
	/**
	 * String은 immutable(변경불가)이다.
	 */
		
	public void test1() {
		String s1 = "java";
		System.out.println(s1);
		System.out.println(s1.hashCode());
		
		s1 += "oracle";  //s1이 변경된 것이 아니다. s1의 주소값이 바뀜
		System.out.println(s1);
		System.out.println(s1.hashCode());
		
		s1 += "javascript";
		s1 += "html";
		s1 += "css";
		
	}
}
