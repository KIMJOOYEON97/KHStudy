package kh.java.polymorphism.animal;

public class AnimalMain {

	public static void main(String[] args) {
		AnimalMain am = new AnimalMain();
//		am.test1();
//		am.test2();
//		am.test3();
		
		//다형성의 활용
		//1. 배개변수 선언부
//		am.test4();
//		
//		//2. 리턴값 처리
//		am.test5();
//		
		//동적바인딩
//		am.test6();
		
		//추상메소드
//		am.test7();
		
		am.test8();
	}
	/**
	 * 인터페이스는 객체화 할 수 없다
	 * 인터페이스 역시 부모타입으로 다형성을 적용할 수 있다.
	 * 
	 */
	
	public void test8() {
//		Runnable r = new Runnable; //Cannot instantiate the type Runnable
		
		Runnable r1 = new Dog(); //r1에 구현 클래스 자체(Dog에 객체)가 들어가 있다.
		Runnable r2 = new Cat();
		
		r1.run(); //Runnable의 추상메소드를  믿고 쓸 수 있다. 당연히 가지고 있다.
		r2.run();
		
		//자식객체의 메소드를 쓸 수 없다
//		r1.say();  		//Animal 재작성메소드 say
//		r1.attack();	//Animal 재작성메소드 attack
//		r1.kick();		//Dog의  kick
		
		((Dog)r1).say();  
		((Dog)r1).attack();
		((Dog)r1).kick();
		
		//상수 
		System.out.println(Runnable.LEGS);
		
		Bitable b1 = new Dog();
		Bitable b2 = new Cat();
		b1.bite("멍멍");
		b2.bite("야옹");
		
		System.out.println("-----------------------");
		
//		b1.//object 메소드 말고는 bite밖에 못씀
		Dog d1 =(Dog)b1;  //자식클래스가 더 넓다.
		d1.bite("멍멍");
		d1.kick();
		d1.attack();	  //오버라이딩
		d1.say();
		
		System.out.println("-----------------------");
	
		Animal a1 = d1;
		a1.attack();
		a1.say();
		
		Flyable f1 = new Eagle();
		f1.fly("펄럭펄럭");
//		f1.attack;
		Eagle e = (Eagle)f1;
		e.attack();
		e.fly("훨훨");
		Animal a2 = e;
		a2.attack();
//		a2.fly();
	}
	
	public void test7() {
//		Animal a = new Animal();//Cannot instantiate the type Animal
		Animal a = new Cat();
		Animal b = new Dog();
		Animal c = new Tiger();
		//추상클래스 Animal을 상속한 자식클래스는 
		//무조건 추상메소드 attack구현을 보장받는다. 
		a.attack();
		b.attack();
		c.attack();
		c.say();
		
	}
	/**
	 * 동적바인딩
	 * 1. 상속 & 부모클래스의 메소드 오버라이딩
	 * 2. 자식객체를 부모타입으로써 제어, 해당 메소드 호출
	 * 자동으로 자식타입의 재작성한 메소드가 호출된다.
	 * 다운캐스팅 없이 자식메소드 사용 가능
	 * 
	 * 정적바인딩
	 * 동일한 타입의 메소드를 호출한다.
	 */
	public void test6() {
		
		Animal a1 = new Cat();
		Animal a2 = new Dog();
		//cat dog객체이지만 animal인 척하기 때문에 animal 메소드만 사용할 수 있었음.
		
		a1.say();
		a2.say();
		
		//다형성을 이용한 attack
		Animal[] arr = new Animal[100];
		for(int i = 0; i<arr.length; i++) {
			if(i%2==0)
				arr[i] = makeDog();
			else
				arr[i] = makeCat();
		}
		//실행
		for(Animal anm : arr)
			anm.attack();//동적바인딩 자식클래스의 오버라이드한 메소드가 호출됨
			//Animal의 메소드 attack이다.
		
	}
	
	/**
	 * 리턴값 다형성 이용해서 처리하기
	 */
	public void test5() {
		Animal cat = makeCat(); //뭘 리턴하던 다 에니멀 타입의 변수에 담을 수 있다.
		Animal dog = makeDog();
	
		Animal[] arr = new Animal[100];
		for(int i = 0; i<arr.length; i++) {
			if(i%2==0)
				arr[i] = makeDog();
			else
				arr[i] = makeCat();
		}
		
		for(Animal anm : arr) {
			attack(anm);
		}
	
	}
	
	public Dog makeDog() {
		return new Dog();
	}
	
	public Cat makeCat() {
		return new Cat();
	}
	
	/**
	 * 매개변수 선언부에서 다형성 활용하기
	 */
	public void test4() {
		Cat cat = new Cat();
		Dog dog = new Dog();
		
		attack(cat);
		attack(dog);
	}
	
	public void attack(Animal animal) {
//		((Cat)animal).punch();
//		((Dog)animal).kick();
		
		if (animal instanceof Dog) {
			((Dog)animal).kick();
		}
		else if (animal instanceof Cat) {
			((Cat)animal).punch();
		}
	}
	
	/**
	 * 부모타입의 배열에 자식객체를 담을 수 있다
	 */
	public void test3() {
		Animal[] arr = new Animal[3]; //Animal만 상속했다면 이 배열에 다 들어올 수 있다.
		arr[0]=new Cat();
		arr[1]=new Dog();
//		arr[2]=new Animal(); //new Animal => instantiate(객체화 하는 것)
							// 추상 클래스로는 객체를 만들수 없다
		arr[2]=new Cat();
		
		System.out.println(arr[0] instanceof Cat);  	//true
		System.out.println(arr[0] instanceof Dog);		//false
		System.out.println(arr[0] instanceof Animal);	//true
		System.out.println(arr[0] instanceof Object);	//true
		
		//Animal anml = new Cat();
		//Animal anml = new Dog();
		for(Animal anml : arr) {
			anml.say();
			
			//instanceof 해당탕비의 객체인 경우 true 리턴
			//true가 리턴된 경우, 해당 타입으로의 안전한 형변환 보장
			//Cat객체인 경우
			if(anml instanceof Cat) {
				System.out.println("======");
				((Cat)anml).punch();
			}
			else if(anml instanceof Dog) {
				System.out.println("======");
				((Dog)anml).kick();
			}
				
				
//			((Cat)anml).punch(); //undowncasting
//			((Dog)anml).kick();  //undowncasting 
			//Cat cannot be cast to kh.java.polymorphism.animal.Dog
			//cat이랑 dog는 남남이다. => 정말 cat 객체만 cat으로 변환해야하고 dog객체가 dog로 변환해야한다/
		}
	}
	/**
	 * 형변환
	 * - upcasting  부모타입으로 형변환 . 자동(암묵적)형변환
	 * - downcasting 자식타입으로 형변환. 수동(명시적)형변환
	 */
	public void test2() {
		
		Animal animal = new Dog(); // upcasting
		Dog dog =(Dog) animal; //downcasting
		
		dog.kick();
	}

	/**
	 * 자식객체를 부모타입의 참조변수에 담아 제어할 수 있다.
	 * 단, 자식클래스에 선언된 자원을 사용할 수 없다.
	 */
	public void test1() {
		Cat cat = new Cat();
		cat.say();
		cat.punch();
		
		Animal animal1 = cat;
		System.out.println(cat == animal1);//주소값 비교 true
		animal1.say();
//		animal1.punsh();//부모타입 변수에 담으면 자식클래스의 선언된 자원(필드,메소드)를 사용할 수 없다.
		
		Object obj1 = cat;
//		obj1.say();
//		obj1.punch();
		System.out.println(obj1.hashCode());
		
		System.out.println("--------------------");
		//다시 자식탕비의 변수에 담으면 자식타입의 자원 사용 가능
//		Animal animal2 = (Animal)obj1;
//		animal2.say();
		((Animal) obj1).say();
//		 ------->형변환 연산자가 객체접근연산자가 먼저 처리되기때문에 괄호가 필요하다.
		
//		Cat cat2 =(Cat)animal2;
//		cat2.punch();
		((Cat) obj1).punch(); //obj1이 cat객체인것을 알기때문에 바뀌는 것이다. Dog로는 변환 불가
//		((Dog)obj1).kick(); // java.lang.ClassCastException, Cat cannot be cast to kh.java.polymorphism.animal.Dog

		
	}
}
