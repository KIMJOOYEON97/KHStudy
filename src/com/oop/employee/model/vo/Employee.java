package com.oop.employee.model.vo;

public class Employee {
	
	private int empNo;
	private String name;
	private char gender;
	private String phone;
	private String dept;
	private int salary;
	private double bonusPct;
	
	//기본 생성자
	public Employee() {
		
	}
	
	//파라미터 생성자
	public Employee(int empNo, String name, char gender, String phone) {
		this.empNo= empNo;
		this.name= name;
		this.gender= gender;
		this.phone= phone;
	}
	
	public Employee(int empNo, String name, char gender,String dept, String phone, int salary, double bonusPct) {
		this.empNo= empNo;
		this.name= name;
		this.gender= gender;
		this.phone= phone;
		this.salary = salary;
		this.bonusPct = bonusPct;
	}
	
	public void printEmployee() {
		System.out.printf(" empNo: %d%n name: %s%n gender: %c%n phone: %s%n salary: %d%n bonusPct: %.2f%n"
				,empNo, name, gender,phone, salary, bonusPct);
		System.out.println();
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public double getBonusPct() {
		return bonusPct;
	}
	public void setBonusPct(double bonusPct) {
		this.bonusPct = bonusPct;
	}
	

}
