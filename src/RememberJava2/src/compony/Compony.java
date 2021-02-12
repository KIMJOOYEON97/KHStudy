package compony;

public class Compony {
	
	private double salary;
	private double annualIncome;
	private double bonus;
	private double afterTaxBonus;
	private double afterTaxIncome;
	
	public Compony() {
		super();
	}
	public Compony(double salary) {
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getAnnualIncome() {
		annualIncome = salary*12;
		return annualIncome;
	}
	public void setAnnualIncome(double annualIncome) {
		this.annualIncome = annualIncome;
	}
	public double getBonus() {
		bonus = (salary*0.2)*4;
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	public double getAfterTaxBonus() {
		afterTaxBonus =((salary*0.2)*4)*0.945;
		return afterTaxBonus;
	}
	public void setAfterTaxBonus(double afterTaxBonus) {
		this.afterTaxBonus = afterTaxBonus;
	}

	public double getAfterTaxIncome() {
		afterTaxIncome = (salary*12)*0.9;
		return afterTaxIncome;
	}
	
	
}
