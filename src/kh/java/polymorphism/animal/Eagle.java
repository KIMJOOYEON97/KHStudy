package kh.java.polymorphism.animal;

public class Eagle extends Animal implements Flyable {

	@Override
	public void fly(String fly) {
		System.out.println("독수리가"+fly+"합니다");
		
	}

	@Override
	public void attack() {
		System.out.println("독수리가 낚아채갑니다.");
	}

}
