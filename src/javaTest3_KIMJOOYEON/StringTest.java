package javaTest3_KIMJOOYEON;

public class StringTest {

	public static void main(String[] args) {
		String str = "1.22,4.12,5.93,8.71,9.34";
		double data[] = new double[5];
		double sum = 0;
		
		
		String[] st;
		int idx =0;
		st = str.split("[,]");
		for(String d: st) {
			data[idx] = Double.valueOf(d);
			sum += data[idx];
			idx++;
		}
		
		System.out.printf("합계 : %.3f %n",sum);
		System.out.printf("평균 : %.3f ",(double)sum/idx);
	}
}
