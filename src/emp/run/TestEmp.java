package emp.run;

import emp.model.vo.Employee;

/**
* 실행용 클래스
* 패키지 : emp.run
* 클래스명 : TestEmp
* 실행메소드 : public static void main(String[] args)
* 내용 : Employee의 printEmployee메소드실행 기능제공 클래스
* 패키지 : emp.model.vo
* 클래스명 : Employee
* 추가 메소드 : public void printEmployee(){}
* 내용 : 자기소개출력 (본인 이름, 나이, 생년월일)
 */
public class TestEmp {
	
	public static void main(String[] args) {
		
		Employee human = new Employee();
		human.printEmployee();
		
	}

}
