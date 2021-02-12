package mobile;

public class MoblieTest {

	
	public static void main(String[] args) {
		// 각각의 Mobile 객체 생성
		Mobile Ltab = new Ltab("Ltab",500,"AP-01");
		Mobile Otab = new Otab("Otab",1000,"AND-30");
		
		 // 생성된 객체의 정보 출력
		System.out.println("Mobile\tBattery\tOS");
		System.out.println("----------------------------------");
		System.out.println(Ltab.getMoblieName()+"\t"+Ltab.getBatterySize()+"\t"+Ltab.getOsType());
		System.out.println(Otab.getMoblieName()+"\t"+Otab.getBatterySize()+"\t"+Otab.getOsType());
		
		 // 각각의 Mobile 객체에 10분씩 충전
		System.out.println("10분 충전");
		System.out.println("Mobile\tBattery\tOS");
		System.out.println("----------------------------------");
		Ltab.charge(10);
		Otab.charge(10);
		
		// 10분 충전 후 객체 정보 출력
		System.out.println(Ltab.getMoblieName()+"\t"+Ltab.getBatterySize()+"\t"+Ltab.getOsType());
		System.out.println(Otab.getMoblieName()+"\t"+Otab.getBatterySize()+"\t"+Otab.getOsType());
		
		// 각각의 Mobile 객체에 5분씩 통화
		System.out.println("5분 통화");
		System.out.println("Mobile\tBattery\tOS");
		System.out.println("----------------------------------");
		Ltab.operate(5);
		Otab.operate(5);
		// 5분 통화 후 객체 정보 출력
		System.out.println(Ltab.getMoblieName()+"\t"+Ltab.getBatterySize()+"\t"+Ltab.getOsType());
		System.out.println(Otab.getMoblieName()+"\t"+Otab.getBatterySize()+"\t"+Otab.getOsType());
	}
}
