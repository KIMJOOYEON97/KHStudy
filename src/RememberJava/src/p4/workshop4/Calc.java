package p4.workshop4;

public class Calc {

	public int calculate(int data) {
		int evenSum = 0;
		System.out.print("짝수 : ");
		for(int i = 1; i<=data; i++) {
			if(i %2 == 0) {
				System.out.print(i+" ");
				evenSum += i;
			}
		}
		System.out.println();
		return evenSum;
	}

}
