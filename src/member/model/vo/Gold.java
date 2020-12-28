package member.model.vo;

public class Gold extends Member{

	public Gold() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Gold(String name, String grade, int point) {
//		super(name, grade, point);
		// TODO Auto-generated constructor stub
		
		this.name = name;
		this.grade =grade;
		this.point = point;
	}
	
	
	@Override
	public double getEjapoint() {
		return getPoint()*0.05;
	}

}
