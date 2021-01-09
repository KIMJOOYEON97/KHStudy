package javaTest3_KIMJOOYEON.airplane9;

public class PlaneTest {
	
	
	public static void main(String[] args) {
		
		Airplane a = new Airplane();
		Cargoplane c = new Cargoplane();
		a.setPlaneName("L747");
		c.setPlaneName("C40");
		a.setFuelSize(1000);
		c.setFuelSize(1000);
		
		System.out.println("Plane   fuelSize\r\n" + 
				"-----------------------------");
		System.out.println(a.getPlaneName()+"\t"+a.getFuelSize());
		System.out.println(c.getPlaneName()+"\t"+c.getFuelSize());
		a.flight(100);
		c.flight(100);
		System.out.println("100 운항");
		
		System.out.println("Plane   fuelSize\r\n" + 
				"-----------------------------");
		System.out.println(a.getPlaneName()+"\t"+a.getFuelSize());
		System.out.println(c.getPlaneName()+"\t"+c.getFuelSize());
		a.refuel(200);
		c.refuel(200);
		System.out.println("200 운항");
		
		System.out.println("Plane   fuelSize\r\n" + 
				"-----------------------------");
		System.out.println(a.getPlaneName()+"\t"+a.getFuelSize());
		System.out.println(c.getPlaneName()+"\t"+c.getFuelSize());
		
	}
}
