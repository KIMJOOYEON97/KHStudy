package kh.java.inherit.shape;

import java.util.Arrays;

public class Rectangle extends Shape {
	
	private Point[] points = new Point[4];
	private int width;
	private int height;
//	private String result1;  =>이렇게 해서하면 왜인지는 모르겠는데 null값이 한번찍힌다.
//	private String result2;
	
	public Rectangle() {
	}
	
	public Rectangle(Point[] points, int width, int height) {
		super();
		this.points = points;
		this.width = width;
		this.height = height;
	}
	public Point[] getPoints() {
		return points;
	}
	public void setPoints(Point[] points) {
		this.points = points;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public void draw() {
		String result1 ="네 꼭지점이";
		result1 += Arrays.toString(this.points);
		result1 +="이고,"+"너비가"+width+", 높이가"+height+"인 사각형을 그린다.";
		System.out.println(result1);
	}
	@Override
	public double getArea() {
		return height*width;	
	}
	@Override
	public String toString() {
		int i =0;
		String result2 ="points=[";
				for(Point p: points) {
					result2 += p;
					i++;
					if(i==4) {
						result2 +="], ";
					}
				}
			 result2+= "width="+width+", height="+height;
			 return result2;
	}
}
/**
 * * points: Point[4]  0번지-leftTop, 1번지-rightTop, 2번지-rightBottom, 3번지-leftBottom 
* width : int
* height : int
생성자
* 기본생성자
* 파라미터생성자 : Point[] points, int width, int height
다음 메소드를 오버라이딩할 것.
* draw()메소드: 
* getArea()메소드 
* toString 메소드
    실행클래스)
        Point[] points = {new Point(0,0), new Point(200,0), new Point(200,100), new Point(0,100)};
        Rectangle rect = new Rectangle(points, 200, 100);
        rect.draw();
        System.out.println("사각형의 너비는 "+rect.getArea()+"입니다.");
        System.out.println(rect);
    출력결과)
        네 꼭지점이 (0, 0), (200, 0), (200, 100), (0, 100)이고, 너비가 200, 높이가 100인 사각형을 그린다.
        사각형의 너비는 20000.0입니다.
        points=[(0, 0), (200, 0), (0, 100), (200, 100)], width=200, height=100 
 */
