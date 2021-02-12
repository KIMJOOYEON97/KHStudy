package shape;

public class ShapeTest {
	
	public static void main(String[] args) {
		Shape shape[] = new Shape[6];
		 // (1.조건)에서 주어진 데이터를 기반으로 Shape type의 객체를 생성 하여
		// 6개의 도형 객체를 배열에 넣는다.
		shape[0] = new Triangle(7, 5, "Blue");
		shape[1] = new Rectangle(4, 6, "Blue");
		shape[2] = new Triangle(6, 7, "Red");
		shape[3] = new Rectangle(8, 3, "Red");
		shape[4] = new Triangle(9, 8, "White");
		shape[5] = new Rectangle(5, 7, "White");
		 // 모든 객체의 넓이 정보와 색상 정보를 for Loop를 이용하여 화면에 출력 한다
		for(Shape s:shape) {
			String shape1 = s.getClass().toString().substring(12);
			System.out.print(shape1+"\t"+s.getArea()+"\t"+s.getColors()+"\n");
		}
		System.out.println();
		 // 모든 객체들을 for Loop문을 이용하여 setResize함수를 이용하여
//		 5를 입력 하고 사이즈를 변경 후 화면에 출력 한다
		for(Shape s:shape) {
			if(s instanceof Triangle )
				((Triangle) s).setResize(5);
			if(s instanceof Rectangle)
				((Rectangle) s).setResize(5);
		}
		for(Shape s:shape) {
			String shape1 = s.getClass().toString().substring(12);
			System.out.print(shape1+"\t"+s.getArea()+"\t"+s.getColors()+"\n");
		}
		
	}

}
