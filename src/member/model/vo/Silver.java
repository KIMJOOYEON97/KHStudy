package member.model.vo;

public class Silver extends Member {

	public Silver() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Silver(String name, String grade, int point) {
		super(name, grade, point);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double Interest() {
		return getEjapoint();
	}
	
	public double getEjapoint() {
		return getPoint()*0.02;
	}
}