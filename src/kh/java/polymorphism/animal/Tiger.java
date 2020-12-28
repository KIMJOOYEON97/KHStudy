package kh.java.polymorphism.animal;

public class Tiger extends Animal{
	
	public void say() {
		System.out.println("어흥~ 나는 호랑이다.");
	}
	
	public void attack() {
		bite();
	}
	
	public void bite() {
		System.out.println("호랑이에게 뜯겼습니다.");
	}

}
