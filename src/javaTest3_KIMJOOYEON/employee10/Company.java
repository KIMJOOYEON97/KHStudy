package javaTest3_KIMJOOYEON.employee10;

public class Company {

	public static void main(String[] args) {
		// 1번의 사용 데이터를 기반으로 객체를 생성하여 배열에 넣는다 .
		Employee[] employees = new Employee[2];
		//추상 클래스를 상속한 자식클래스로 객체 만들기
		employees[0] = new Secretary("Hilery", 1, "secretary", 800);
		employees[1] = new Sales("Clinten", 2, "sales", 1200);
		// 모든 객체의 기본 정보를 출력한다 (for 문을 이용하여 출력한다.)
		
		System.out.println("name   department   salary\r\n" + 
				"------------------------------------");
		for(Employee e: employees) {
			System.out.printf("%6s %10s %5d\n",e.getName(),e.getDepartment(),e.getSalary());
		}
		
		 // 모든 객체에 인센티브 100 씩 지급한 급여를 계산하고 다시 객체의 salary에 넣는다 .
		((Secretary) employees[0]).incentive(100);
		((Sales) employees[1]).incentive(100);
		System.out.println("인센트브 100 지급");
		
		// 모든 객체의 정보와 세금을 출력한다 (for 문을 이용하여 출력한다.)
		System.out.println("name   department   salary  tax\r\n" + 
				"------------------------------------");
		for(Employee e: employees) {
			System.out.printf("%6s %10s %7d %5.1f\n",e.getName(),e.getDepartment(),e.getSalary(),e.tax());
			
		}
	}

}
