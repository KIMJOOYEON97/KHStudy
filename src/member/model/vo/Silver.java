package member.model.vo;

public class Silver {
	
	private String name;
	private String grade;
	private int point;
	
	//기본생성자
	public Silver() {
		
	}
	//파라미터생성자
	public Silver(String name, String grade, int point) {
		this.name = name;
		this.grade = grade;
		this.point = point;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getGrade() {
		return grade;
	}


	public void setGrade(String grade) {
		this.grade = grade;
	}


	public int getPoint() {
		return point;
	}


	public void setPoint(int point) {
		this.point = point;
	}
	
	
	public double getPointInterest() {
		return point*0.02;
	}
	

}
