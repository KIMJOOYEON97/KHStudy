package javaTest3_KIMJOOYEON.employee10;

public class Sales extends Employee implements Bonus{

	
	
	public Sales() {
		super();
	}

	public Sales(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}

	@Override
	public double tax() {
		return getSalary()*0.13;
	}
	
	@Override
	public void incentive(int pay) {
		setSalary((int) (getSalary()*1.1));
	}


}
