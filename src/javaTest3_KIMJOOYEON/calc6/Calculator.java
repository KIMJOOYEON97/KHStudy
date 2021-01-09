package javaTest3_KIMJOOYEON.calc6;

public class Calculator {

	public double getSum(int data) throws InvalidException {
		double sum = 0;
		if(data>2&&data<6) {
			for(int i = 1; i <=data; i++) {
				sum += i;
			}
		}
		else {
			throw new InvalidException("입력 값에 오류가 있습니다.");
		}
		
		return sum;
	}
}
