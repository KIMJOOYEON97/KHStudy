package kh.java.inherit.shape;

public class Circle extends Shape{

/**
 * Circle has a Point : has a 포함관계 연관관계 //무조건 필드로써 참조하면 has a 포함관계
 * Circle───────────>Point
 * 
 * Circle is a Shape : is a 상속관계(일반화관계)
 * Circle──────▷Shape
 * 	
 */
	
	private Point center;//field center의 타입은 Point인 것이다. StudentManager가 Student객체배열를 가지고 있는 것과 똑같은 것이다.
	private int r; //반지름
	public Circle() {
		//아무런 필드 대입이 없다면, 기본값으로 세팅한다.
		this.center = new Point(100,100);
		this.r= 100;
		
	}

	public Circle(Point center, int r) {
		super();
		this.center = center;
		this.r = r;
	}

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}
	/**
	 * override 상속받은 메소드를 고쳐쓸 수 있다
	 * 1. 메소드명, 파라미터선언부, 리턴타입 모두 동일해야한다.
			-@Override annotation  오류 방지가능.
	 * 2. 접근제한자는 더 넓은 범위로 수정이 가능하다.
	 * 		- private(x) - default(x) - protected - public
	 * 		- private메소드는 오버라이드 불가
	 * 		- default메소드는 거의 없음
	 * 3. 메소드가 던지는 예외클래스는 줄이거나, 자식클래스로 변경가능
	 * 
	 */
	@Override
	public void draw() {
//		System.out.println("중심점이 ("+center.getX()+", "+center.getY()+")이고, "+
//							"반지름이" + r +"인 원을 그리고 있다.");
		
//		// 객체가 문자열로 출력됨
//		중심점이 kh.java.inherit.shape.Point@2a139a55 이고,반지름이100인 원을 그리고 있다.
//		중심점이 kh.java.inherit.shape.Point@15db9742 이고,반지름이30인 원을 그리고 있다.
		System.out.println("중심점이 "+center.toString()+" 이고,"+
				"반지름이" + r +"인 원을 그리고 있다.");
		
		//field좌표가 필요한데 어떻게 해야하나? -->Point에 toString을 Overrider해준다.
		System.out.println("중심점이 "+center+" 이고,"+
				"반지름이" + r +"인 원을 그리고 있다.");
//	     중심점이 (100,100) 이고,반지름이100인 원을 그리고 있다.
//	     중심점이 (200,100) 이고,반지름이30인 원을 그리고 있다.

		
	}
	
	
	
	
}
