package kh.java.inner.class_;

public class Main {
	
	public static void main(String[] args) {
		OuterClass outer = new OuterClass();
		OuterClass.A a = outer.new A(); //타입 선언 Map.entry처럼
		//OuterClass의 내부 A클래스
		a.aaa();						// 멤버 내부 클래스
		
		OuterClass.B b = new OuterClass.B(); //static이기 때문에 이렇게 접근
		b.bbb();  							// static 내부클래스
		
		//지역내부클래스는 외부에서 절대 접근할 수 없다.
		outer.test();//할 수 있는 것은 메소드만 생성가능
		
	}

}
