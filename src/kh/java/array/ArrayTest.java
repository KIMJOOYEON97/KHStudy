package kh.java.array;

public class ArrayTest {
	
	public static void main(String[] args) {
		ArrayTest a = new ArrayTest();
//		a.test0();
//		a.test1();
//		a.test2();
//		a.test3();
//		a.test4();
//		a.test5();
//		a.test6();
		a.test7();
	
	}
	/**
	 * 배열의 특징
	 * - 배열의 길이는 변경할 수 없다.
	 */
	public void test7() {
		int[] arr = new int[10];
		System.out.println(arr.length);
		
		//hashCode 비교 : 객체의 주소값에 접근할 수 있는 key값
		System.out.println(arr.hashCode());
		//toString: 객체를 문자열 정보로 표현 해시코드 값이 들어있음 @이후에
		System.out.println(arr);			//[I@2a139a55
		System.out.println(arr.toString());	//[I@2a139a55
		arr = new int[7];
		System.out.println(arr.length);
		System.out.println(arr.hashCode());
		System.out.println(arr);
		System.out.println(arr.toString());
		
		//참조형 변수의 기본값 null ->heap영역에 가르키는 곳이 없다 주소값이 없다는 의미
		arr = null; //삭제 
		
//		System.out.println(arr.length); //NullPointerException
//		System.out.println(arr[0]); //NullPointerException
		
	}
	/**
	 * String[]
	 */
	public void test6() {
//		String[] nameArr = new String[3];
//		nameArr[0] = "홍길동";
//		nameArr[1] ="신사임당";
//		nameArr[2] = "장영실";
//		String[] nameArr = {"홍길동","신사임당","장영실"};
		String[] nameArr = new String[] {"홍길동","신사임당","장영실"};
		
		for(int i = 0; i <nameArr.length;i++) {
			System.out.println(nameArr[i]);
		}
		
	}
	/**
	 * @실습문제 : 알파벳 소문자가 담긴 char배열을 생성하고 출력하세요.
	 * 
	 * a, b, c, d, e, f, g, .... x, y, z
	 */
		public void test5() {
			int len = 26;
			char[] abc = new char[len];
			
			for(int i = 0; i <abc.length;i++) {
				abc[i] = (char) ('a'+ i);
				System.out.print(abc[i]);
				System.out.print(i !=abc.length -1 ? ", ": "");
			}

	}
	
	/**
	 *  배열의 요소에 담긴 값에 규칙이 있다면, 값대입시에 반복문을 사용할 수 있다.
	 *  
	 *  {1,2,3,4,5,6.....100}
	 *  {1,2,3,4,5}
	 *  {'a','b','c'}
	 *  {2,4,6,8,10}
	 */
	public void test4() {
		
		int[] arr = new int[100];
//		arr[0] =1
//		arr[1] =2
		
		//값대입
		for(int i = 0; i <arr.length; i++) {
			arr[i] =i +101;
		}
		
		//값출력
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d]=%d%n",i,arr[i]);
		}
	}
	/**
	 * 초기화
	 * 배열변수 선언  + 배열 할당(heap) + 인덱스별 값대입
	 */
	public void test3() {
//		char[] chArr = {'a','b','c'};
		char[] charr = new char[] {'a','b','c'};
		
//		char[] chArr;
//		char chArr = new char[2]
//		chArr[0]='a';
//		chArr[1]='b';
//		chArr[2]='c';
	}
	
	public void test2(){
		//배열 선언
		double[] arr;   //double[] arr = new double[3]
		//배열 할당 : heap영역에 배열객체를 생성하고, 주소값을 arr에 대입
		arr = new double[3];
		
		//배열 요소(각 인덱스)에 값 대입
		arr[0] =1.1;
		arr[1] =2.2;
		arr[2] =3.3; //배열의 마지막 인덱스 : arr.length - 1
//		arr[3] =4.4;
		
		for(int i= 0; i <arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	/**
	 *  배열 : 동일한 자료형의 값이 여러개인 경우
	 */
	public void test1() {
		//1. 배열 선언
		int[] arr; //java에서 선호
//		int arr[]; //c언어쪽에서 선호
		
		//2. 배열 할당 : 배열 길이 반드시 지정할 것
		//메모리 heap영역에 int값을 담을 수 있는 공간 할당.
		//배열은 각 타입별 초기값을  미리 처리됨.
		//기본형 - int 0, double 0.0, char ' ',boolean false
		//참조형 - null(값없음)
		arr =new int[5];
		
		//배열 각번지수 참조
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
	
		
		
		//3. 배열 각번지에 값대입
		arr[0] = 80;
		arr[1] = 70;
		arr[2] = 90;
		arr[3] = 75;
		arr[4] = 43;
		
		//초기화
//		int[] arr = {80,70,90,75,43};
		
		
		System.out.println("-----------------------");
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
		
		for(int i = 0; i < 5;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("-----------------------");
	
		
		//4. 총점, 평균
//		int total =arr[0] + arr[1]+arr[2]+arr[3]+arr[4];
		//반복문을 이용해 점수배열의 총점 구하기
		int total = 0;
		//의미를 찾기 힘든 magic number 대신 변수, 상수를 사용하자
		for(int x=0;x<arr.length;x++) {
			total += arr[x];
		}
		double avg = (double) total/arr.length;
		
		System.out.printf("총점 : %d점, 평균 : %.2f%n",total,avg);
	}
	
	public void test0() {
		//동일한 자료형을 가진 여러 값
		int kor = 80;
		int math = 70;
		int eng = 90;
		int society = 75;
		int science = 43;
		
		//총점, 평균
		int total = kor + math + eng +society +science;
		double avg = (double) total/5;
		
		System.out.printf("총점 : %d점, 평균 : %.2f%n",total,avg);
		
	}

}
