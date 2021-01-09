package javaTest3_KIMJOOYEON.employee10;

public class Secretary extends Employee implements Bonus{

	
	
	
	public Secretary() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Secretary(String name, int number, String department, int salary) {
		super(name, number, department, salary);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double tax() {
		return getSalary()*0.1;
	}

	@Override
	public void incentive(int pay) {
		setSalary(getSalary()+(int)(getSalary()*0.1));
	}

}
