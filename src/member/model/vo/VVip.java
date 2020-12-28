package member.model.vo;

public class VVip extends Member{

	public VVip() {
		super();
		// TODO Auto-generated constructor stub
	}

	public VVip(String name, String grade, int point) {
		super(name, grade, point);
		// TODO Auto-generated constructor stub
	}
	
//	@Override
//	public double Interest() {
//		return getEjapoint();
//	}
	
	public double getEjapoint() {
		return getPoint()*0.15;
	}
}
