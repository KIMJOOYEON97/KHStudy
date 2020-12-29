package com.api.token;

import java.util.Arrays;
import java.util.StringTokenizer;

public class TokenTest {

	public static void main(String[] args) {
		
		String data = "J a v a P r o g r a m ";
		//토큰 처리전 글자 출력
		System.out.println(data);
		//전 글자 개수를 담을 변수
		int count = 0;
		char[] array = new char[11];
		StringTokenizer st = new StringTokenizer(data," ");
		while(st.hasMoreTokens()) {
			String s = st.nextToken();
			array[count++]+= s.charAt(0);
		}
		//토큰 처리 후 글자갯수 출력 확인
		System.out.println("글자개수:"+count+"개");
		
		//char[] 값 출력
		System.out.println(Arrays.toString(array));
		
		//char[]을 다시 String으로 바꾼 후 모두 대문자로 변환하여 출력  
		String[] str = null;
		StringBuilder sb = new StringBuilder();
		str = (Arrays.toString(array)).split(",");
		for(int i = 0; i <str.length;i++) {
			sb.append(str[i].toUpperCase());
		}
		System.out.println(sb);
	
		
	}
}
