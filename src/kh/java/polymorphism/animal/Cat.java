package kh.java.polymorphism.animal;

public class Cat extends Animal implements Runnable,Bitable {

	public void punch() {
		System.out.println("냥냥 펀치!");
	}
	@Override
	public void attack() {
		punch();
	}
	
	@Override
	public void say() {
		System.out.println("안녕하세요, 미스 묘입니다.");
	}
	@Override
	public void run() {		
		System.out.println("미스묘는 걸어요");
	}
	@Override
	public void bite(String sound) {
		System.out.println("미스묘는 물어요~"+sound);
	}
}
