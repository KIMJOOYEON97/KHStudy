package kh.java.inherit.shape;

public class ShapeMain {

	public static void main(String[] args) {
		
		
		Circle c1 = new Circle();
		//좌표랑 반지름을 기본값으로 셋팅
		Circle c2 = new Circle(new Point(200,100), 30);
		
		c1.draw();
		c2.draw();
		
        Point[] points = {new Point(0,0), new Point(200,0), new Point(200,100), new Point(0,100)};
        Rectangle rect = new Rectangle(points, 200, 100);
        rect.draw();
        System.out.println("사각형의 너비는 "+rect.getArea()+"입니다.");
        System.out.println(rect);
	}

}
