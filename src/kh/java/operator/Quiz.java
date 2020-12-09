package kh.java.operator;

public class Quiz {
	
	public static void main(String[] args) {
		
		Quiz q= new Quiz();
		q.test();
	}

	public void test() {
		
		int num = 0;
		int a = 5;
		int b = 10;
		
		num = ++a + ++b;
		a = num-- - --b;
		System.out.println(" num = "+num+", a = "+ a +", b = "+b);
				
		
	}
}
