package com.oop.employee.model.vo;

public class Run {
	
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setEmpNo(12);
		e.setName("홍길동");
		e.setGender('남');
		e.setPhone("01012345678");
		e.setDept("기획부");
		e.setSalary(1000000);
		e.setBonusPct(100000);
		e.printEmployee();
		
		Employee e2 = new Employee(13,"김현지",'여',"01098765432","마케팅부",4000000,100000.0);
		e2.printEmployee();
		
		Employee e3 = new Employee(15, "장영실", '남', "01065439876");
		e3.printEmployee();
	}

}
