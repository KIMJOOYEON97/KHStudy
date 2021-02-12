package shape;

public class Rectangle extends Shape implements Resize  {

	
	
	
	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Rectangle(int width, int height, String colors) {
		super(width, height, colors);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setResize(int size) {
		super.setWidth(super.getWidth()+size);
	}

	@Override
	public double getArea() {
		return getWidth()*getHeight();
	}

}
