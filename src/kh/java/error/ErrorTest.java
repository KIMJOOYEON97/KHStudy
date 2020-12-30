package kh.java.error;
/**
 * Error
 * 예외처리 등 프로그램적으로 해결할 수 없는 심각한 오류
 *
 */
public class ErrorTest {

	public static void main(String[] args) {

		ErrorTest e= new ErrorTest();
//		e.test1();
		e.test2();
		System.out.println(" ----- 프로그램 정상 종료 -----");
	}
	public void test1() {
		long[] arr = new long[Integer.MAX_VALUE];
		//OutOfMemoryError: Requested array size exceeds VM limit 배열의 크기가 너무 커서 생기는 문제
	}
	public void test2() {
		System.out.println("test2호출!");
		test2(); //종료조건 없는 재귀호출
		//Exception in thread "main" java.lang.StackOverflowError
	}

}
