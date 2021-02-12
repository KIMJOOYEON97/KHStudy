package workshop5;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		System.out.println("문자열을 입력하세요");
		Scanner sc  = new Scanner(System.in);
		String input = sc.next();
		char[] array=input.toCharArray(); 
		for(int i = 0; i <input.length();i++) {
			System.out.print(array[input.length()-1-i]);
		}
	}
}

