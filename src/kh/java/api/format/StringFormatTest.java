package kh.java.api.format;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 날짜 : java.text.SimpleDateFormat 
 * 숫자 : java.text.DecimalFormat
 *
 */
public class StringFormatTest {

	public static void main(String[] args) {
		StringFormatTest s = new StringFormatTest();
		s.test1();
		s.test2();
	}
	/**
	 * DecimalFormat
	 * 
	 * # 해당자리에 데이터가 없는 경우, 생략
	 * 0 해당자리에 데이터가 없는 경우, 0으로 표시
	 * 
	 */
	public void test2() {
		
		double num = 1234567890.123;
		DecimalFormat df = new DecimalFormat("￦#,###"); //세자리마다 콤마
		System.out.println(df.format(num));
		
		df.applyPattern("#.00000"); //비어있는 자리는 0을 채워준다.
		System.out.println(df.format(num));
		
	}
	
	/**
	 * SimpleDateFormat
	 */
	public void test1() {
		Date d = new Date();
		SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd (E) HH:mm:ss"); //객체 만들어주기
		String result = sdf.format(d); //.format메소드에 Date객체 d 전달
		System.out.println(result);
	}
}
