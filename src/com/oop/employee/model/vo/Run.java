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
		
		Employee e2 = new Employee();
		e2.setEmpNo(13);
		e2.setName("김흥도");
		e2.setGender('남');
		e2.setPhone("01056432345");
		
		Employee e3 = new Employee(14,"김현지",'여',"01098765432","마케팅부",4000000,100000);
		
		Employee e4 = new Employee(15, "장영실", '남', "01065439876");

		e.printEmployee();
		e2.printEmployee();
		e3.printEmployee();
		e4.printEmployee();
	}

}
