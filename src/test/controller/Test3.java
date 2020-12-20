package test.controller;

public class Test3 {
	
	public static void main(String[] args) {
		
		int i =1;
		int sum = 0;
		do {
			i++;
			sum += i;
			
		}while(i<=100);
		
		System.out.println("합계  : "+sum);
		System.out.println("평균 : "+sum/5.0);
	}

}
