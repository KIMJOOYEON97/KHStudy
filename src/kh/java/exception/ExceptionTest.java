package kh.java.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Exception
 * 예외처리를 통해서 정상복구될 수 있는 오루
 * 
 * 1. checked exception: RuntimeException 후손클래스 아님. 예외처리 강제화.
 * 2. unchecked exception : RuntimeException 후손클래스
 *
 */
public class ExceptionTest {

	public static void main(String[] args) {
		ExceptionTest e = new ExceptionTest();
//		e.test1();
//		e.test2();
//		e.test3();
//		e.test4();
		
		try {
			e.test5();//예외처리에 대한 책임 넘어옴
			//누군가는 처리해줘야함
		}catch(FileNotFoundException e1) {
			
		}catch(IOException e1) { //IOE클래스는 입출력관련의 부모클래스
			
		}
		System.out.println("-----정상 종료-----"); //프로그램이 비정상이 되지않고 끝까지 갔다는 의미
	}
	/**
	 * CheckedException ->컴파일 오류를 만들어서 예외처리를 안할 수 없게 만든다.
	 * 예외처리 강제화
	 * 1. try ~ catch
	 * 2. throws절 통해 회피
	 * 		- 복수개의 예외를 던지는 게 가능하다
	 * 		- 다형성을 적용할 수 있다.
	 */
	public void test5() throws FileNotFoundException,IOException{ 
		//test5는 FileNotFoundException을 던진다고 경고문구
		
		//1. try~catch처리
//		try {
//			FileReader fr = new FileReader("text.txt"); =>파일을 찾아서 파일의 내용을 불러움
//			//Unhandled exception type FileNotFoundException
//			System.out.println("파일을 찾았습니다.");
//			
//		} catch(FileNotFoundException e) {
//			e.printStackTrace();
//		}
		
		//2.throws를 통해 예외회피
		
		FileReader fr = new FileReader("text.txt"); //=>파일을 찾아서 파일의 내용을 불러움
		System.out.println("파일을 찾았습니다.");
				
	}
	/**
	 * 사용자로부터 정수 2개를 입력받고 , 합을 출력하는 프로그램을 만드세요.
	 * 부정입력이 있다면 , 처음부터 다시 입력 받으세요.
	 */
	public void test4() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			try {
				System.out.print("첫번째 정수를 입력하세요 : ");
				int num1 = sc.nextInt();
				System.out.print("두번째 정수를 입력하세요 : ");
				int num2 = sc.nextInt();
				
				int sum = num1+num2;
				
				System.out.printf("%d + %d = %d%n",num1,num2,sum);	
				break;
			}catch(Exception e) {
				System.out.println("잘못된 정보를 입력하였습니다. 올바른 정수를 입력하세요. ");
				sc.next(); //잘못된 입력값을 버퍼에서 제거하기
			}
		}
	}
	/**
	 * 사용자의 입력에 애해 예외처리하기
	 */
	public void test3() {
		
		Scanner sc = new Scanner(System.in);
		while(true){
			try {
				System.out.print("정수 : ");
				System.out.println(sc.nextInt());	
				
				//정상 입력한 경우
				break;
				
			}catch(Exception e) {
				System.out.println("올바른 정수를 입력하세요.");
				sc.next(); //사용자의 잘못된 입력값이 남겨진 버퍼 비우기
				continue; //Scanner가 밖에 있을 때 continue는 위험하다.
			}	
		}	
	}
	
	/**
	 * 처리순서
	 * 
	 * finally 절 : try절에서 예외가 던져지든 아니든 무조건 실행되는 코드
	 * 				자원반납 등의 목적으로 사용. 조기리턴시에도 실행됨
	 */
	public void test2() {
		
		System.out.println(1);
		
		try {
			System.out.println(2);
			
			if(true)
				return; //test2를 호출한 곳으로 돌아 간다.
			
			int[] arr = new int[3];
			System.out.println(arr[4]);
			
			System.out.println(3);
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println(4);
			//java.lang.ArrayIndexOutOfBoundsException: 4
		}finally {
			System.out.println(5);
		}
		System.out.println(6);
		
	}
	/**
	 * try절
	 * catch절
	 *  - 여러개의 예외클래스를 처리할 수 있도록 catch절을 여러개 작성할 수 있다.
	 *  - 부모 예외클래스 타입의 catch절로 통합해서 처리할 수도 있다.(다형성)
	 *  - 여러 개의 예외 클래스 타입의 catch절을 사용하는 경우, 자식 - 부모타입순으로 작성한다.
	 */
	public void test1() {
		//예외처리
		try {
			//예외가 발생할 수 있는 코드
			
			String s = null;
			System.out.println(s.length());
				
			Scanner sc = new Scanner(System.in);
			System.out.print("정수를 입력 : ");
			int num = sc.nextInt(); //java.util.InputMismatchException 정수타입이 아닌 문자가 입력되었다.
			//사용자 입력값은 무조건 문자열인데 문자열을 정수로 형변환하는 과정에서 ab23이 들어가면 안된다.
			
			System.out.println(num/0); // 수를 0으로 나눌 수 없다.
			//java.lang.ArithmeticException: / by zero 산술연산 예외
			
			
		} catch(InputMismatchException e) {
			//해당예외가 발생했을 경우 처리코드
			System.out.println("정확한 값을 입력해주세요.");
//		} catch(ArithmeticException e) {
//			System.out.println("수를 0으로 나눌 수 없습니다.");
//		} catch (NullPointerException e) {
//			System.out.println("NPE 발생!");
////			System.out.println(e);
//			e.printStackTrace(); // 예외가 발생했을때의 콜스택의 상황
//		}
		//catch절에도 다형성이 적용되기 때문
		}catch(RuntimeException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
