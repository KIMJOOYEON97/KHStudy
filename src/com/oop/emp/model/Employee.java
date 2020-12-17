package com.oop.emp.model;

import java.util.Scanner;

public class Employee {
	/**
	 *    사번 : - empNo:int
    이름 : - empName:String
    소속부서 : - dept:String
    직급 : - job:String
    나이 : - age:int
    성별 : - gender:char
    급여 : - salary:int
    보너스포인트 : - bonusPoint:double
    핸드폰 : - phone:String
    주소 : - address:String
Employee 클래스의 메소드 작성
1. 키보드입력용 메소드 : empInput()
2. emp객체 모든 필드 출력용 메소드 : empOutput()
3. getter/setter메소드

	 */
	private int empNo;
	private String empName;
	private String dept;
	private String job;
	private int age;
	private char gender;
	private int salary;
	private double bonusPoint;
	private String phone;
	private String address;
	
	//field도 마찬가지로 우회적으로 메소드를 통해 접근하기 위한 세팅
	//getter과 setter은 우회적으로 메소드를 통해 접근하기 위해 필요한 세팅
	//getter
	public int getEmpNo(){
		return empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public String getDept() {
		return dept;
	}
	public String getJob() {
		return job;
	}
	public int getAge() {
		return age;
	}
	public char getGender() {
		return gender;
	}
	public int getSalary() {
		return salary;
	}
	public double getBonusPoint() {
		return bonusPoint;
	}
	public String getPhone() {
		return phone;
	}
	public String getAddress() {
		return address;
	}
	
	//setter
	public void setEmpNO(int empNo) {
		this.empNo = empNo;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public void setSalary(int salary) {
		this.salary =salary;
	}
	public void setBonusPoint(double bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void empInput() {
		//set으로 데이터를 집어넣고
		Scanner sc = new Scanner(System.in);
		
		//sc.next가 인자의 역할을 함.(값의 역할) 그래서 set() 안쪽으로 들어가야함
		System.out.print("사번 : " );
		setEmpNO(sc.nextInt());
		System.out.print("이름 :");
		setEmpName(sc.next());
		System.out.print("소속부서 : ");
		setDept(sc.next());
		System.out.print("직급 : ");		
		setJob(sc.next());
		System.out.print("나이 : ");
		setAge(sc.nextInt());
		System.out.print("성별 (F/M): ");
		setGender(sc.next().charAt(0));
		System.out.print("급여 : ");
		setSalary(sc.nextInt());
		System.out.print("보너스포인트 : ");
		setBonusPoint(sc.nextDouble());
		System.out.print("핸드폰 : ");
		setPhone(sc.next());
		System.out.print("주소 : ");
		sc.nextLine();
		setAddress(sc.nextLine());
		
		
		
	}
	public void empOutput() {
	//get으로 데이터를 빼온다. get은 return값이 있기 때문에 인자가 필요없다.
		System.out.print("사번 : " + getEmpNo() +"\n"+
				"이름 : " + getEmpName() +"\n"+
				"소속부서 : " + getDept() +"\n"+
				"직급 : " + getJob()+"\n"+
				"나이 : " + getAge() +"\n"+
				"성별 : " + getGender() +"\n"+
				"급여 : " + getSalary() +"\n"+
				"보너스포인트 : " + getBonusPoint() +"\n"+
				"핸드폰 : " + getPhone()+"\n"+
				"주소 : " +getAddress());
		
	}
	


}
