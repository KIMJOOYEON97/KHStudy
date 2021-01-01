package kh.java.io.byte_system;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * byte기반의 표준 입출력
 * System.in : 사용자키보드 입력   Scanner sc = new Scanner(System.in) -> 너 키보드에서 좀 읽어와
 * System.out : 콘솔
 *
 */
public class SystemIOTest {

	public static void main(String[] args) {
		SystemIOTest s = new SystemIOTest();
//		s.test1();
		s.test2();
	}
	/**
	 * 2004년 JDK 1.5버전이 나오기전
	 * Scanner클래스가 등장전의 사용자 입력값처리는 다음과 같다.
	 */
	public void test2() {
		//보조스트림 : 기본스트림에 연결해서 사용. 보조스트림 여러개를 연결할 수 있다.
		//마지막 연결된 보조스트림으로 입출력 제어 및 자원 반납을 한다.
		// System.in ->브릿지스트림(보조) ->보조스트림
//		InputStreamReader isr = new InputStreamReader(System.in);
//		BufferedReader br = new BufferedReader(isr);  isr을 제어할 일이 없음으로 직접적으로 전달해버리는 밑의 코드를 사용
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		//BufferedReader으로 입출력 제어 및 자원 반납을 한다 => 사용자 입력값을 Enter를 기준으로 한번에 보여줌(라인으로 처리 가능)
		String data = " ";
		
		System.out.println("키보드로 입력하세요 :");
		try {
			int sum = 0;
			while((data = br.readLine()) != null) {
//				System.out.println(data);
				sum += Integer.parseInt(data);
				System.out.println(sum);
			}
			//IOException => checked exception
		}catch(IOException e) {
			e.printStackTrace();
		} finally {
			//자원반납 
			//표준입출력을 사용하는 스트림클래스는 반납하면 안된다.
			//한번 닫힌 표준입출력은 재사용할 수 없다.(System.in)
//			try {
//				br.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
		}
	}

	/**
	 * System.in
	 *
	 * read():int -> 대상으로부터 1byte(데이터크기) 읽어와서 int로 리턴하는 메소드
	 * 256가지(0~255) + 1 (-1 : 읽어올 값이 없는 경우)
	 * 
	 * 이클립스에스는 Ctrl + z 입력하면 -1을 리턴 -> 종료
	 */
	public void test1() {
		System.out.println("키보드로 입력값을 주세요 :");
		int data = 0; //읽어온 값을 처리할 변수
		
		try {
			
			while((data = System.in.read()) != -1) {
				System.out.println("input ="+data);
			}
			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
